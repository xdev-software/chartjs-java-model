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
package software.xdev.chartjs.model.options.scale;

import java.util.List;

import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L2971">ChartJS Source</a>
 */
public class GridLineConfiguration
{
	protected Boolean display;
	protected Boolean circular;
	protected String color;
	protected Number lineWidth;
	protected Boolean drawOnChartArea;
	protected Boolean drawTicks;
	protected List<Number> tickBorderDash = new OptionalArray<>();
	protected Number tickBorderDashOffset;
	protected String tickColor;
	protected Number tickWidth;
	protected Boolean offset;
	protected Number z;
	
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	public GridLineConfiguration setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	public Boolean getCircular()
	{
		return this.circular;
	}
	
	public GridLineConfiguration setCircular(final Boolean circular)
	{
		this.circular = circular;
		return this;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public GridLineConfiguration setColor(final String color)
	{
		this.color = color;
		return this;
	}
	
	public Number getLineWidth()
	{
		return this.lineWidth;
	}
	
	public GridLineConfiguration setLineWidth(final Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}
	
	public Boolean getDrawOnChartArea()
	{
		return this.drawOnChartArea;
	}
	
	public GridLineConfiguration setDrawOnChartArea(final Boolean drawOnChartArea)
	{
		this.drawOnChartArea = drawOnChartArea;
		return this;
	}
	
	public Boolean getDrawTicks()
	{
		return this.drawTicks;
	}
	
	public GridLineConfiguration setDrawTicks(final Boolean drawTicks)
	{
		this.drawTicks = drawTicks;
		return this;
	}
	
	public List<Number> getTickBorderDash()
	{
		return this.tickBorderDash;
	}
	
	public GridLineConfiguration setTickBorderDash(final List<Number> tickBorderDash)
	{
		this.tickBorderDash = tickBorderDash;
		return this;
	}
	
	public Number getTickBorderDashOffset()
	{
		return this.tickBorderDashOffset;
	}
	
	public GridLineConfiguration setTickBorderDashOffset(final Number tickBorderDashOffset)
	{
		this.tickBorderDashOffset = tickBorderDashOffset;
		return this;
	}
	
	public String getTickColor()
	{
		return this.tickColor;
	}
	
	public GridLineConfiguration setTickColor(final String tickColor)
	{
		this.tickColor = tickColor;
		return this;
	}
	
	public Number getTickWidth()
	{
		return this.tickWidth;
	}
	
	public GridLineConfiguration setTickWidth(final Number tickWidth)
	{
		this.tickWidth = tickWidth;
		return this;
	}
	
	public Boolean getOffset()
	{
		return this.offset;
	}
	
	public GridLineConfiguration setOffset(final Boolean offset)
	{
		this.offset = offset;
		return this;
	}
	
	public Number getZ()
	{
		return this.z;
	}
	
	public GridLineConfiguration setZ(final Number z)
	{
		this.z = z;
		return this;
	}
}
