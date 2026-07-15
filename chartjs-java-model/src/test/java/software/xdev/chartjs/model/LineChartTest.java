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

import software.xdev.chartjs.model.charts.LineChart;
import software.xdev.chartjs.model.data.LineData;
import software.xdev.chartjs.model.dataset.LineDataset;
import software.xdev.chartjs.model.options.LineOptions;


@SuppressWarnings("java:S2699") // Done in custom method
class LineChartTest extends AbstractChartTest
{
	@Test
	void testWithSpanGaps()
	{
		final LineDataset dataset1 = new LineDataset()
			.setLabel("A")
			.setData(65, 59, null, 45, 80)
			.setBorderColor("blue")
			.setBackgroundColor("rgba(0, 0, 255, 0.2)");
		
		final LineDataset dataset2 = new LineDataset()
			.setLabel("B")
			.setData(28, 45, null, 45, 10)
			.setBorderColor("gray");
		
		final LineData data = new LineData()
			.addLabels("1", "2", "3", "4", "5")
			.addDataset(dataset1)
			.addDataset(dataset2);
		
		final LineOptions options = new LineOptions()
			.setAnimation(false)
			.setSpanGaps(true);
		
		this.createScreenshotAndCompare(
			new LineChart(data, options),
			this.getWebContainer(),
			"SpanGaps"
		);
	}
}
