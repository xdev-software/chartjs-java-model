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
package software.xdev.chartjs.model.options.plugins.zoom.limits;


/**
 * <a href="https://www.chartjs.org/chartjs-plugin-zoom/latest/guide/options.html#scale-limits">ChartJS docs</a>
 */
public class ScaleLimits
{
	protected Object min;
	protected Object max;
	protected Number minRange;
	
	public Object getMin()
	{
		return this.min;
	}
	
	public ScaleLimits setMin(final Object min)
	{
		this.min = min;
		return this;
	}
	
	public Object getMax()
	{
		return this.max;
	}
	
	public ScaleLimits setMax(final Object max)
	{
		this.max = max;
		return this;
	}
	
	public Number getMinRange()
	{
		return this.minRange;
	}
	
	public ScaleLimits setMinRange(final Number minRange)
	{
		this.minRange = minRange;
		return this;
	}
}
