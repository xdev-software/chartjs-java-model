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
package software.xdev.chartjs.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.testcontainers.utility.MountableFile;

import software.xdev.chartjs.model.charts.Chart;
import software.xdev.chartjs.model.container.SeleniumBrowserWebDriverContainer;
import software.xdev.testcontainers.selenium.containers.browser.BrowserWebDriverContainer;


public abstract class AbstractChartTest
{
	protected static final String SCREENSHOTS_FOR_FAILURE = "./target/screenshots/";
	protected static final String RESOURCES_SCREENSHOT_REFERENCES = "./src/test/resources/screenshotReferences/";
	protected static final String SCREENSHOT_SUFFIX = ".png";
	
	protected static final String TEST_TEMPLATE_HTML_FILE = "test-template.html";
	protected static final String CONTAINER_TEST_TEMPLATE_HTML_FILE = "/home/user/" + TEST_TEMPLATE_HTML_FILE;
	
	// One Container is started once and only the rendered HTML is changed. Improves performance.
	protected static final SeleniumBrowserWebDriverContainer WEB_CONTAINER = createBrowserWithTempDirectoryMounted();
	
	private static SeleniumBrowserWebDriverContainer createBrowserWithTempDirectoryMounted()
	{
		if(!SLF4JBridgeHandler.isInstalled())
		{
			SLF4JBridgeHandler.removeHandlersForRootLogger();
			SLF4JBridgeHandler.install();
		}
		
		final SeleniumBrowserWebDriverContainer browserContainer =
			new SeleniumBrowserWebDriverContainer(new ChromeOptions())
				.withRecordingMode(BrowserWebDriverContainer.RecordingMode.SKIP)
				.withCopyFileToContainer(
					MountableFile.forClasspathResource("/" + TEST_TEMPLATE_HTML_FILE),
					CONTAINER_TEST_TEMPLATE_HTML_FILE);
		browserContainer.start();
		return browserContainer;
	}
	
	protected SeleniumBrowserWebDriverContainer getWebContainer()
	{
		return WEB_CONTAINER;
	}
	
	protected void createScreenshotAndCompare(
		final Chart<?, ?, ?> chart,
		final SeleniumBrowserWebDriverContainer browserContainer,
		final String screenshotReference)
	{
		try
		{
			browserContainer.webDriver().get("file://" + CONTAINER_TEST_TEMPLATE_HTML_FILE);
			browserContainer.webDriver().executeScript(
				String.format(
					"new Chart(document.getElementById('c').getContext('2d'), %s)",
					chart.toJson()));
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
		final SeleniumBrowserWebDriverContainer browserContainer,
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
}
