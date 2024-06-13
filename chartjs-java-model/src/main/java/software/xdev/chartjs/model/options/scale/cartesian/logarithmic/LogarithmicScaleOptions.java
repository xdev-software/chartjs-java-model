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
package software.xdev.chartjs.model.options.scale.cartesian.logarithmic;

import software.xdev.chartjs.model.options.scale.cartesian.AbstractCartesianScaleOptions;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/cartesian/logarithmic.html">Chart JS</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3312>ChartJS Source</a>
 */
public class LogarithmicScaleOptions
	extends AbstractCartesianScaleOptions<LogarithmicScaleOptions, LogarithmicTickOptions>
{
	public LogarithmicScaleOptions()
	{
		super("logarithmic");
	}
}
