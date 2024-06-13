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
package software.xdev.chartjs.model.options.scale.radial;

import java.util.List;

import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/radial/linear.html#angle-line-options">ChartJS Docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3475">ChartJS source</a>
 */
public class AngleLines
{
	protected Boolean display;
	protected String color;
	protected Number lineWidth;
	protected List<Number> borderDash = new OptionalArray<>();
	protected Number borderDashOffset;
	
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	public AngleLines setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public AngleLines setColor(final String color)
	{
		this.color = color;
		return this;
	}
	
	public Number getLineWidth()
	{
		return this.lineWidth;
	}
	
	public AngleLines setLineWidth(final Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}
	
	public List<Number> getBorderDash()
	{
		return this.borderDash;
	}
	
	public AngleLines setBorderDash(final List<Number> borderDash)
	{
		this.borderDash = borderDash;
		return this;
	}
	
	public Number getBorderDashOffset()
	{
		return this.borderDashOffset;
	}
	
	public AngleLines setBorderDashOffset(final Number borderDashOffset)
	{
		this.borderDashOffset = borderDashOffset;
		return this;
	}
}
