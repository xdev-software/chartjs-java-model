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
package software.xdev.chartjs.model.options.scale.cartesian.linear;

import software.xdev.chartjs.model.options.scale.cartesian.AbstractCartesianTickOptions;


/**
 * Linear Axis specific tick options
 * @see <a href="https://www.chartjs.org/docs/latest/axes/cartesian/linear.html#linear-axis-specific-tick-options">ChartJS Docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3283">ChartJS Source</a>
 */
public class LinearTickOptions extends AbstractCartesianTickOptions<LinearTickOptions>
{
	protected Object format;
	protected Number precision;
	protected Number stepSize;
	protected Number count;
	
	public Object getFormat()
	{
		return this.format;
	}
	
	public LinearTickOptions setFormat(final Object format)
	{
		this.format = format;
		return this.self();
	}
	
	public Number getPrecision()
	{
		return this.precision;
	}
	
	public LinearTickOptions setPrecision(final Number precision)
	{
		this.precision = precision;
		return this.self();
	}
	
	public Number getStepSize()
	{
		return this.stepSize;
	}
	
	public LinearTickOptions setStepSize(final Number stepSize)
	{
		this.stepSize = stepSize;
		return this.self();
	}
	
	public Number getCount()
	{
		return this.count;
	}
	
	public LinearTickOptions setCount(final Number count)
	{
		this.count = count;
		return this.self();
	}
}
