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

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import software.xdev.chartjs.model.charts.BarChart;
import software.xdev.chartjs.model.color.RGBAColor;
import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.dataset.BarDataset;
import software.xdev.chartjs.model.javascript.JavaScriptFunction;
import software.xdev.chartjs.model.options.BarOptions;
import software.xdev.chartjs.model.options.scale.Scales;
import software.xdev.chartjs.model.options.scale.cartesian.linear.LinearScaleOptions;
import software.xdev.chartjs.model.options.scale.cartesian.linear.LinearTickOptions;


@SuppressWarnings("java:S2699") // Done in custom method
class ChartAxisFormatTest extends AbstractChartTest
{
	@Test
	void axisTickCallback()
	{
		this.createScreenshotAndCompare(
			new BarChart(data(), options(l -> l.setCallback(new JavaScriptFunction("(label) => `$${label}`")))),
			this.getWebContainer(),
			"AxisTickCallback");
	}
	
	@Test
	void format()
	{
		this.createScreenshotAndCompare(
			new BarChart(data(), options(l -> l.setFormat(new CurrencyFormatOptions("currency", "USD")))),
			this.getWebContainer(),
			"Format");
	}
	
	public static class CurrencyFormatOptions
	{
		private String style;
		private String currency;
		
		public CurrencyFormatOptions()
		{
		}
		
		public CurrencyFormatOptions(final String style, final String currency)
		{
			this.style = style;
			this.currency = currency;
		}
		
		public String getStyle()
		{
			return this.style;
		}
		
		public void setStyle(final String style)
		{
			this.style = style;
		}
		
		public String getCurrency()
		{
			return this.currency;
		}
		
		public void setCurrency(final String currency)
		{
			this.currency = currency;
		}
	}
	
	static BarData data()
	{
		final BarDataset dataset1 = new BarDataset()
			.setData(65)
			.addBackgroundColors(RGBAColor.RED);
		
		return new BarData()
			.addLabels("First")
			.addDataset(dataset1);
	}
	
	static BarOptions options(final Consumer<LinearTickOptions> configureTickOptions)
	{
		final LinearTickOptions linearTickOptions = new LinearTickOptions();
		configureTickOptions.accept(linearTickOptions);
		
		final BarOptions options = new BarOptions().setAnimation(false);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.Y, new LinearScaleOptions()
				.setTicks(linearTickOptions));
		return options;
	}
}
