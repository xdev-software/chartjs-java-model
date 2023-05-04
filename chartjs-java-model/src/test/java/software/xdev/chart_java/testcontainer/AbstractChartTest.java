/*
 * Copyright © 2023 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.xdev.chart_java.testcontainer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.BrowserWebDriverContainer;

import software.xdev.chart_java.charts.Chart;
import software.xdev.chart_java.testcontainer.container.SimpleBrowserWebDriverContainer;


public abstract class AbstractChartTest
{
	protected static final String SCREENSHOTS_FOR_FAILURE = "./target/screenshots/";
	protected static final String RESOURCES_SCREENSHOT_REFERENCES = "./src/test/resources/screenshotReferences/";
	protected static final String SCREENSHOT_SUFFIX = ".png";
	
	protected static final String HOME_DIRECTORY = "/home/user/";
	
	protected static final Path TEMP_DIR = createTempDir();
	
	// One Container is started once and only the rendered HTML is changed. Improves performance.
	protected static final SimpleBrowserWebDriverContainer WEB_CONTAINER = createBrowserWithTempDirectoryMounted();
	
	private static Path createTempDir()
	{
		try
		{
			return Files.createTempDirectory("charttests");
		}
		catch(final IOException e)
		{
			throw new UncheckedIOException(e);
		}
	}
	
	private static SimpleBrowserWebDriverContainer createBrowserWithTempDirectoryMounted()
	{
		if(!SLF4JBridgeHandler.isInstalled())
		{
			SLF4JBridgeHandler.removeHandlersForRootLogger();
			SLF4JBridgeHandler.install();
		}
		
		final SimpleBrowserWebDriverContainer browserContainer = new SimpleBrowserWebDriverContainer()
			.withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.SKIP, TEMP_DIR.toFile())
			.withCapabilities(new ChromeOptions())
			.withFileSystemBind(TEMP_DIR.toAbsolutePath().toString(), HOME_DIRECTORY, BindMode.READ_ONLY);
		browserContainer.start();
		return browserContainer;
	}
	
	protected SimpleBrowserWebDriverContainer getWebContainer()
	{
		return WEB_CONTAINER;
	}
	
	protected void createScreenshotAndCompare(
		final Chart<?, ?, ?> chart,
		final SimpleBrowserWebDriverContainer browserContainer,
		final String screenshotReference)
	{
		try
		{
			final Path chartFile = this.createHtmlTempFileFor(chart);
			browserContainer.webDriver().get("file://" + HOME_DIRECTORY + chartFile.getFileName());
			this.assertCurrentBrowserViewEqualsScreenshot(
				browserContainer,
				chart.getClass().getSimpleName() + screenshotReference);
		}
		catch(final IOException ioe)
		{
			throw new UncheckedIOException(ioe);
		}
	}
	
	protected void assertCurrentBrowserViewEqualsScreenshot(
		final SimpleBrowserWebDriverContainer browserContainer,
		final String screenshotReference) throws IOException
	{
		final byte[] actual = browserContainer.webDriver().getScreenshotAs(OutputType.BYTES);
		
		byte[] expected = new byte[0];
		
		final String screenShotName = screenshotReference + SCREENSHOT_SUFFIX;
		final Path screenshotReferenceResourcePath = Path.of(RESOURCES_SCREENSHOT_REFERENCES, screenShotName);
		if(Files.exists(screenshotReferenceResourcePath))
		{
			expected = Files.readAllBytes(screenshotReferenceResourcePath);
		}
		
		final boolean arraysMatch = Arrays.equals(expected, actual);
		
		if(!arraysMatch)
		{
			final Path path = Path.of(SCREENSHOTS_FOR_FAILURE, screenShotName);
			Files.createDirectories(path.getParent());
			Files.write(path, actual);
			assertArrayEquals(expected, actual);
		}
	}
	
	protected Path createHtmlTempFileFor(final Chart<?, ?, ?> chart) throws IOException
	{
		final Path tmp = Files.createTempFile(TEMP_DIR, "chart_test_", ".html");
		
		final String json = chart.toJson();
		Files.writeString(
			tmp,
			"""
				<!DOCTYPE html>
				<html lang='en'>
					<head>
						<meta charset='UTF-8'>
						<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/4.3.0/chart.umd.js"></script>
					</head>
					<body>
						<canvas id='c' style='border:1px solid #555;'></canvas>
						<script>
							new Chart(document.getElementById('c').getContext('2d'), %s);
						</script>
					</body>
				</html>
				""".formatted(json));
		
		this.log().info("Wrote file {} with:\n{}", tmp, json);
		
		return tmp;
	}
	
	protected Logger log()
	{
		return LoggerFactory.getLogger(this.getClass());
	}
}
