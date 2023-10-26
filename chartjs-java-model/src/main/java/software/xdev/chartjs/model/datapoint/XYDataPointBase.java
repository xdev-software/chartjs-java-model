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

import java.math.BigDecimal;


public abstract class XYDataPointBase<S extends XYDataPointBase<S>>
{
	private BigDecimal x;
	
	private BigDecimal y;
	
	protected XYDataPointBase()
	{
	}
	
	protected XYDataPointBase(final int x, final int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	protected XYDataPointBase(final double x, final double y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	protected XYDataPointBase(final BigDecimal x, final BigDecimal y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public BigDecimal getX()
	{
		return this.x;
	}
	
	public S setX(final int x)
	{
		this.x = new BigDecimal(x);
		return this.self();
	}
	
	public S setX(final double x)
	{
		this.x = new BigDecimal(String.valueOf(x));
		return this.self();
	}
	
	public S setX(final BigDecimal x)
	{
		this.x = x;
		return this.self();
	}
	
	public BigDecimal getY()
	{
		return this.y;
	}
	
	public S setY(final int y)
	{
		this.y = new BigDecimal(y);
		return this.self();
	}
	
	public S setY(final double y)
	{
		this.y = new BigDecimal(String.valueOf(y));
		return this.self();
	}
	
	public S setY(final BigDecimal y)
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
