package software.xdev;

import java.awt.Desktop;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

import software.xdev.chart_java.charts.BarChart;
import software.xdev.chart_java.charts.Chart;
import software.xdev.chart_java.data.BarData;
import software.xdev.chart_java.dataset.BarDataset;
import software.xdev.chart_java.options.BarOptions;


public final class Application
{
	private Application()
	{
	}
	
	public static void main(final String[] args)
	{
		final BarData data = new BarData();
		data.addLabels("A", "B", "C");
		data.addDataset(new BarDataset()
			.setLabel("Dataset1")
			.setData(1, 3, 2));
		
		createAndOpenTestFile(new BarChart()
			.setData(data)
			.setOptions(new BarOptions()));
	}
	
	private static void createAndOpenTestFile(final Chart<?, ?, ?> chart)
	{
		try
		{
			final Path tmp = Files.createTempFile("chart_test_", ".html");
			
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
					""".formatted(chart.toJson()));
			
			Desktop.getDesktop().browse(tmp.toUri());
		}
		catch(final IOException e)
		{
			throw new UncheckedIOException(e);
		}
	}
}
