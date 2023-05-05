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

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import software.xdev.chartjs.model.charts.BarChart;
import software.xdev.chartjs.model.color.Color;
import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.dataset.BarDataset;
import software.xdev.chartjs.model.options.BarOptions;
import software.xdev.chartjs.model.options.scales.BarScale;
import software.xdev.chartjs.model.options.scales.ScaleTitle;
import software.xdev.chartjs.model.options.scales.Scales;
import software.xdev.chartjs.model.options.ticks.LinearTicks;


@SuppressWarnings("java:S2699") // Done in custom method
class BarChartTest extends AbstractChartTest
{
	@Test
	void testScale()
	{
		final BarDataset dataset = new BarDataset();
		final BarData data = new BarData();
		data.addDataset(dataset);
		for(final Map.Entry<String, BigDecimal> entry : IntStream.rangeClosed(0, 3)
			.boxed()
			.collect(Collectors.toMap(String::valueOf, BigDecimal::valueOf))
			.entrySet())
		{
			data.addLabel(entry.getKey());
			dataset.addData(entry.getValue());
		}
		
		final BarOptions barOptions = new BarOptions()
			.setAnimation(false);
		
		barOptions
			.getScales()
			.addScale(
				Scales.ScaleAxis.Y,
				new BarScale<>()
					.setTitle(new ScaleTitle().setText("Test"))
					.setMax(BigDecimal.valueOf(2)));
		
		final BarChart chart = new BarChart()
			.setOptions(barOptions)
			.setData(data);
		
		this.createScreenshotAndCompare(
			chart,
			this.getWebContainer(),
			"Scale");
	}
	
	@Test
	void testStacked()
	{
		final BarDataset dataset1 = new BarDataset()
			.setLabel("First stack")
			.setData(65, 59, 80)
			.addBackgroundColors(Color.RED, Color.RED, Color.RED);
		
		final BarDataset dataset2 = new BarDataset()
			.setLabel("Second stack")
			.setData(28, 45, 10)
			.addBackgroundColors(Color.GREEN, Color.GREEN, Color.GREEN);
		
		final BarData data = new BarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1)
			.addDataset(dataset2);
		
		final BarOptions options = new BarOptions();
		options.setAnimation(false);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.X, new BarScale<>().setStacked(true))
			.addScale(Scales.ScaleAxis.Y, new BarScale<>().setStacked(true));
		
		this.createScreenshotAndCompare(
			new BarChart(data, options),
			this.getWebContainer(),
			"Stacked"
		);
	}
	
	@Test
	void testTicked()
	{
		final BarDataset dataset1 = new BarDataset()
			.setData(65, 59, 80)
			.addBackgroundColors(Color.RED, Color.GREEN, Color.BLUE);
		
		final BarData data = new BarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1);
		
		final LinearTicks ticks = new LinearTicks()
			.setMin(20)
			.setMax(100)
			.setStepSize(5);
		
		final BarOptions options = new BarOptions();
		options.setAnimation(false);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.Y, new BarScale<LinearTicks>().setTicks(ticks));
		
		this.createScreenshotAndCompare(
			new BarChart(data, options),
			this.getWebContainer(),
			"Ticked");
	}
	
	@Test
	void testStackedHorizontal()
	{
		final BarDataset dataset1 = new BarDataset()
			.setLabel("First stack")
			.setData(65, 59, 80)
			.addBackgroundColors(Color.RED, Color.RED, Color.RED);
		
		final BarDataset dataset2 = new BarDataset()
			.setLabel("Second stack")
			.setData(28, 45, 10)
			.addBackgroundColors(Color.GREEN, Color.GREEN, Color.GREEN);
		
		final BarData data = new BarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1)
			.addDataset(dataset2);
		
		final BarOptions options = new BarOptions();
		options.setAnimation(false);
		options.setIndexAxis(BarOptions.IndexAxis.Y);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.X, new BarScale<>().setStacked(true))
			.addScale(Scales.ScaleAxis.Y, new BarScale<>().setStacked(true));
		
		this.createScreenshotAndCompare(
			new BarChart(data, options),
			this.getWebContainer(),
			"StackedHorizontal"
		);
	}
}
