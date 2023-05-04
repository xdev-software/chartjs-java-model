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

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude()
public class ScatterDataPoint
{
	
	private BigDecimal x;
	
	private BigDecimal y;
	
	public ScatterDataPoint()
	{
	}
	
	public ScatterDataPoint(final int x, final int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public ScatterDataPoint(final double x, final double y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public ScatterDataPoint(final BigDecimal x, final BigDecimal y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public BigDecimal getX()
	{
		return this.x;
	}
	
	public ScatterDataPoint setX(final int x)
	{
		this.x = new BigDecimal(x);
		return this;
	}
	
	public ScatterDataPoint setX(final double x)
	{
		this.x = new BigDecimal(String.valueOf(x));
		return this;
	}
	
	public ScatterDataPoint setX(final BigDecimal x)
	{
		this.x = x;
		return this;
	}
	
	public BigDecimal getY()
	{
		return this.y;
	}
	
	public ScatterDataPoint setY(final int y)
	{
		this.y = new BigDecimal(y);
		return this;
	}
	
	public ScatterDataPoint setY(final double y)
	{
		this.y = new BigDecimal(String.valueOf(y));
		return this;
	}
	
	public ScatterDataPoint setY(final BigDecimal y)
	{
		this.y = y;
		return this;
	}
}
