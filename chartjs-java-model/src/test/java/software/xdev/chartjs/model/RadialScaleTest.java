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

import org.junit.jupiter.api.Test;

import software.xdev.chartjs.model.charts.RadarChart;
import software.xdev.chartjs.model.data.RadarData;
import software.xdev.chartjs.model.dataset.RadarDataset;
import software.xdev.chartjs.model.options.RadarOptions;
import software.xdev.chartjs.model.options.scale.GridLineConfiguration;
import software.xdev.chartjs.model.options.scale.Scales;
import software.xdev.chartjs.model.options.scale.radial.AngleLines;
import software.xdev.chartjs.model.options.scale.radial.PointLabels;
import software.xdev.chartjs.model.options.scale.radial.RadialLinearScaleOptions;
import software.xdev.chartjs.model.options.scale.radial.RadialTickOptions;


@SuppressWarnings("java:S2699") // Done in custom method
class RadialScaleTest extends AbstractChartTest
{
	@Test
	void testBasicRadialScale()
	{
		final RadarDataset dataset1 = new RadarDataset()
			.setLabel("A")
			.setData(65, 59, 80)
			.setBorderColor("blue")
			.setBackgroundColor("rgba(0, 0, 255, 0.2)");
		
		final RadarDataset dataset2 = new RadarDataset()
			.setLabel("B")
			.setData(28, 45, 10)
			.setBorderColor("gray");
		
		final RadarData data = new RadarData()
			.addLabels("First", "Second", "Third")
			.addDataset(dataset1)
			.addDataset(dataset2);
		
		final RadarOptions options = new RadarOptions()
			.setAnimation(false);
		options
			.getScales()
			.addScale(Scales.ScaleAxis.R, new RadialLinearScaleOptions()
				.setMin(0)
				.setAngleLines(new AngleLines().setColor("red"))
				.setGrid(new GridLineConfiguration().setColor("red"))
				.setPointLabels(new PointLabels().setColor("red"))
				.setTicks(new RadialTickOptions().setColor("red")));
		
		this.createScreenshotAndCompare(
			new RadarChart(data, options),
			this.getWebContainer(),
			"BasicRadialScale"
		);
	}
}
