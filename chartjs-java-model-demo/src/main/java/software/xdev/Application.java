package software.xdev;

import java.awt.Desktop;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

import software.xdev.chartjs.model.charts.BarChart;
import software.xdev.chartjs.model.charts.Chart;
import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.dataset.BarDataset;
import software.xdev.chartjs.model.options.BarOptions;


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
	
	@SuppressWarnings("java:S5443") // Only a demo nothing sensitive is here
	private static void createAndOpenTestFile(final Chart<?, ?, ?> chart)
	{
		try
		{
			final Path tmp = Files.createTempFile("chart_test_", ".html");
			
			Files.writeString(
				tmp,
				String.format("<!DOCTYPE html>\n"
					+ "<html lang='en'>\n"
					+ "\t<head>\n"
					+ "\t\t<meta charset='UTF-8'>\n"
					+ "\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/4.3.0/chart.umd"
					+ ".js\"></script>\n"
					+ "\t</head>\n"
					+ "\t<body>\n"
					+ "\t\t<canvas id='c' style='border:1px solid #555;'></canvas>\n"
					+ "\t\t<script>\n"
					+ "\t\t\tnew Chart(document.getElementById('c').getContext('2d'), %s);\n"
					+ "\t\t</script>\n"
					+ "\t</body>\n"
					+ "</html>", chart.toJson())
			);
			
			Desktop.getDesktop().browse(tmp.toUri());
		}
		catch(final IOException e)
		{
			throw new UncheckedIOException(e);
		}
	}
}
