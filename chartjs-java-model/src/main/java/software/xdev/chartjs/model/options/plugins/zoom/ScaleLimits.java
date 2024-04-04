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
package software.xdev.chartjs.model.options.plugins.zoom;

import java.math.BigDecimal;


public class ScaleLimits
{
	protected Object min;
	protected Object max;
	protected BigDecimal minRange;
	
	public Object getMin()
	{
		return min;
	}
	
	public ScaleLimits setMin(final Object min)
	{
		this.min = min;
		return this;
	}
	
	public Object getMax()
	{
		return max;
	}
	
	public ScaleLimits setMax(final Object max)
	{
		this.max = max;
		return this;
	}
	
	public BigDecimal getMinRange()
	{
		return minRange;
	}
	
	public ScaleLimits setMinRange(final BigDecimal minRange)
	{
		this.minRange = minRange;
		return this;
	}
}
