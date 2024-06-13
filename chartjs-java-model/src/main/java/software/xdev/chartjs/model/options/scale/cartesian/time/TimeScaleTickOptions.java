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
package software.xdev.chartjs.model.options.scale.cartesian.time;

import software.xdev.chartjs.model.options.scale.cartesian.CartesianTickOptions;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3373">ChartJS Source</a>
 */
public class TimeScaleTickOptions extends CartesianTickOptions<TimeScaleTickOptions>
{
	protected String source;
	protected Number stepSize;
	
	public String getSource()
	{
		return this.source;
	}
	
	public TimeScaleTickOptions setSource(final String source)
	{
		this.source = source;
		return this.self();
	}
	
	public Number getStepSize()
	{
		return this.stepSize;
	}
	
	public TimeScaleTickOptions setStepSize(final Number stepSize)
	{
		this.stepSize = stepSize;
		return this.self();
	}
}
