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
package software.xdev.chartjs.model.options.scale.cartesian;

import java.util.List;

import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * Border Configuration
 * @see <a href="https://www.chartjs.org/docs/latest/axes/styling.html#border-configuration">ChartJS Docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L2953">ChartJS Source</a>
 */
public class BorderConfiguration
{
	protected Boolean display;
	protected List<Number> dash = new OptionalArray<>();
	protected Number dashOffset;
	protected String color;
	protected Number width;
	protected Number z;
	
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	public BorderConfiguration setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public BorderConfiguration setColor(final String color)
	{
		this.color = color;
		return this;
	}
	
	public Number getWidth()
	{
		return this.width;
	}
	
	public BorderConfiguration setWidth(final Number width)
	{
		this.width = width;
		return this;
	}
	
	public List<Number> getDash()
	{
		return this.dash;
	}
	
	public BorderConfiguration setDash(final List<Number> dash)
	{
		this.dash = dash;
		return this;
	}
	
	public Number getDashOffset()
	{
		return this.dashOffset;
	}
	
	public BorderConfiguration setDashOffset(final Number dashOffset)
	{
		this.dashOffset = dashOffset;
		return this;
	}
	
	public Number getZ()
	{
		return this.z;
	}
	
	public BorderConfiguration setZ(final Number z)
	{
		this.z = z;
		return this;
	}
}
