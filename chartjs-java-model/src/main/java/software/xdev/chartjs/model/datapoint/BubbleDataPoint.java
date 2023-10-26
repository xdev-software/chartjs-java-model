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


public class BubbleDataPoint
{
	
	private BigDecimal x;
	
	private BigDecimal y;
	
	private BigDecimal r;
	
	public BubbleDataPoint()
	{
	}
	
	public BubbleDataPoint(final BigDecimal x, final BigDecimal y, final BigDecimal r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public BigDecimal getX()
	{
		return this.x;
	}
	
	public BubbleDataPoint setX(final int x)
	{
		this.x = new BigDecimal(x);
		return this;
	}
	
	public BubbleDataPoint setX(final double x)
	{
		this.x = new BigDecimal(String.valueOf(x));
		return this;
	}
	
	public BubbleDataPoint setX(final BigDecimal x)
	{
		this.x = x;
		return this;
	}
	
	public BigDecimal getY()
	{
		return this.y;
	}
	
	public BubbleDataPoint setY(final int y)
	{
		this.y = new BigDecimal(y);
		return this;
	}
	
	public BubbleDataPoint setY(final double y)
	{
		this.y = new BigDecimal(String.valueOf(y));
		return this;
	}
	
	public BubbleDataPoint setY(final BigDecimal y)
	{
		this.y = y;
		return this;
	}
	
	public BigDecimal getR()
	{
		return this.r;
	}
	
	public BubbleDataPoint setR(final double r)
	{
		this.r = new BigDecimal(String.valueOf(r));
		return this;
	}
	
	/**
	 * Radius of bubble
	 */
	public BubbleDataPoint setR(final BigDecimal r)
	{
		this.r = r;
		return this;
	}
}
