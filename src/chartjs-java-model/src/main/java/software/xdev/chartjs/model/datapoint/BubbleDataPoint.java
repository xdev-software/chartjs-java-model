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
package software.xdev.chartjs.model.datapoint;

public class BubbleDataPoint extends XYDataPointBase<BubbleDataPoint>
{
	private Number r;
	
	public BubbleDataPoint()
	{
	}
	
	public BubbleDataPoint(final Number x, final Number y, final Number r)
	{
		super(x, y);
		this.r = r;
	}
	
	public Number getR()
	{
		return this.r;
	}
	
	/**
	 * Radius of bubble
	 */
	public BubbleDataPoint setR(final Number r)
	{
		this.r = r;
		return this;
	}
}
