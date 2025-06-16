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

public abstract class XYDataPointBase<S extends XYDataPointBase<S>>
{
	private Number x;
	private Number y;
	
	protected XYDataPointBase()
	{
	}
	
	protected XYDataPointBase(final Number x, final Number y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public Number getX()
	{
		return this.x;
	}
	
	public S setX(final Number x)
	{
		this.x = x;
		return this.self();
	}
	
	public Number getY()
	{
		return this.y;
	}
	
	public S setY(final Number y)
	{
		this.y = y;
		return this.self();
	}
	
	@SuppressWarnings("unchecked")
	public S self()
	{
		return (S)this;
	}
}
