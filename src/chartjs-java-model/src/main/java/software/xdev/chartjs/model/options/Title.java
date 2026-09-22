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
package software.xdev.chartjs.model.options;

/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/labelling.html#scale-title-configuration">ChartJS docs</a>
 */
public class Title
{
	protected String align;
	protected Object color;
	protected Boolean display;
	protected Boolean fullSize;
	protected String position;
	protected Font font;
	protected Object padding;
	protected Object text;
	
	public String getAlign()
	{
		return this.align;
	}
	
	public Title setAlign(final String align)
	{
		this.align = align;
		return this;
	}
	
	public Object getColor()
	{
		return this.color;
	}
	
	public Title setColor(final Object color)
	{
		this.color = color;
		return this;
	}
	
	public Boolean getFullSize()
	{
		return this.fullSize;
	}
	
	public Title setFullSize(final Boolean fullSize)
	{
		this.fullSize = fullSize;
		return this;
	}
	
	public Font getFont()
	{
		return this.font;
	}
	
	public Title setFont(final Font font)
	{
		this.font = font;
		return this;
	}
	
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	public Title setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	public String getPosition()
	{
		return this.position;
	}
	
	public Title setPosition(final String position)
	{
		this.position = position;
		return this;
	}
	
	public Object getPadding()
	{
		return this.padding;
	}
	
	public Title setPadding(final Object padding)
	{
		this.padding = padding;
		return this;
	}
	
	public Object getText()
	{
		return this.text;
	}
	
	public Title setText(final Object text)
	{
		this.text = text;
		return this;
	}
}
