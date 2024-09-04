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
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import software.xdev.chartjs.model.charts.BarChart;
import software.xdev.chartjs.model.color.RGBAColor;
import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.datapoint.XYDataPoint;
import software.xdev.chartjs.model.dataset.BarDataset;
import software.xdev.chartjs.model.options.BarOptions;
import software.xdev.chartjs.model.options.IndexAxis;
import software.xdev.chartjs.model.options.scale.Scales;
import software.xdev.chartjs.model.options.scale.cartesian.AbstractCartesianScaleOptions;
import software.xdev.chartjs.model.options.scale.cartesian.CartesianScaleOptions;
import software.xdev.chartjs.model.options.scale.cartesian.linear.LinearScaleOptions;
import software.xdev.chartjs.model.options.scale.cartesian.linear.LinearTickOptions;


@SuppressWarnings("java:S2699") // Done in custom method
class BarChartTest extends AbstractChartTest
{
	@Test
	void testScaleChecked()
	{
		this.testScale(BarDataset::addData);
	}
	
	@Test
	void testScaleUncheckedData()
	{
		this.testScale((dataset, value) -> dataset.addDataUnchecked(new XYDataPoint(value, value)));
	}
	
	void testScale(final BiConsumer<BarDataset, BigDecimal> addDataFunc)
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
			addDataFunc.accept(dataset, entry.getValue());
		}
		
		final BarOptions barOptions = new BarOptions()
			.setAnimation(false);
		
		barOptions
			.getScales()
			.addScale(
				Scales.ScaleAxis.Y,
				new LinearScaleOptions()
					.setTitle(new AbstractCartesianScaleOptions.Title().setText("Test"))
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
		final BarOptions options = new BarOptions()
			.setAnimation(false);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.X, new CartesianScaleOptions().setStacked(true))
			.addScale(Scales.ScaleAxis.Y, new CartesianScaleOptions().setStacked(true));
		
		this.createScreenshotAndCompare(
			new BarChart(createDefaultTwoDatasetBarData(), options),
			this.getWebContainer(),
			"Stacked"
		);
	}
	
	@Test
	void testTicked()
	{
		final BarDataset dataset1 = new BarDataset()
			.setData(65, 59, 80)
			.addBackgroundColors(RGBAColor.RED, RGBAColor.GREEN, RGBAColor.BLUE);
		
		final BarData data = new BarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1);
		
		final BarOptions options = new BarOptions().setAnimation(false);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.Y, new LinearScaleOptions()
				.setMin(20)
				.setMax(100)
				.setTicks(new LinearTickOptions()
					.setStepSize(5)));
		
		this.createScreenshotAndCompare(
			new BarChart(data, options),
			this.getWebContainer(),
			"Ticked");
	}
	
	@Test
	void testStackedHorizontal()
	{
		final BarOptions options = new BarOptions()
			.setAnimation(false)
			.setIndexAxis(IndexAxis.Y);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.X, new CartesianScaleOptions().setStacked(true))
			.addScale(Scales.ScaleAxis.Y, new CartesianScaleOptions().setStacked(true));
		
		this.createScreenshotAndCompare(
			new BarChart(createDefaultTwoDatasetBarData(), options),
			this.getWebContainer(),
			"StackedHorizontal"
		);
	}
	
	@Test
	void testStackedWithGroups()
	{
		// This test orients itself on https://www.chartjs.org/docs/4.4.0/samples/bar/stacked-groups.html
		final BarDataset dataset1 = new BarDataset()
			.setLabel("First stack")
			.setData(65, 59, 80)
			.addBackgroundColors(RGBAColor.RED, RGBAColor.RED, RGBAColor.RED)
			.setStack("Stack 1");
		
		final BarDataset dataset2 = new BarDataset()
			.setLabel("Second stack")
			.setData(28, 45, 10)
			.addBackgroundColors(RGBAColor.GREEN, RGBAColor.GREEN, RGBAColor.GREEN)
			.setStack("Stack 1");
		
		final BarDataset dataset3 = new BarDataset()
			.setLabel("Third stack")
			.setData(10, 23, 45)
			.addBackgroundColors(RGBAColor.BLUE, RGBAColor.BLUE, RGBAColor.BLUE)
			.setStack("Stack 2");
		
		final BarData data = new BarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1)
			.addDataset(dataset2)
			.addDataset(dataset3);
		
		final BarOptions options = new BarOptions()
			.setAnimation(false)
			.setIndexAxis(IndexAxis.Y);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.X, new CartesianScaleOptions().setStacked(true))
			.addScale(Scales.ScaleAxis.Y, new CartesianScaleOptions().setStacked(true));
		
		this.createScreenshotAndCompare(
			new BarChart(data, options),
			this.getWebContainer(),
			"StackedWithGroups"
		);
	}
	
	static BarData createDefaultTwoDatasetBarData()
	{
		final BarDataset dataset1 = new BarDataset()
			.setLabel("First stack")
			.setData(65, 59, 80)
			.addBackgroundColors(RGBAColor.RED, RGBAColor.RED, RGBAColor.RED);
		
		final BarDataset dataset2 = new BarDataset()
			.setLabel("Second stack")
			.setData(28, 45, 10)
			.addBackgroundColors(RGBAColor.GREEN, RGBAColor.GREEN, RGBAColor.GREEN);
		
		return new BarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1)
			.addDataset(dataset2);
	}
}
