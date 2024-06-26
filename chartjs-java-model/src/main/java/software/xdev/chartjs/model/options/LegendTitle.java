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

import software.xdev.chartjs.model.options.layout.Padding;


public class LegendTitle
{
	protected Object color;
	protected Boolean display;
	protected Font font;
	protected Padding padding;
	protected String text;
	
	/**
	 * @see #setColor(Object)
	 */
	public Object getColor()
	{
		return this.color;
	}
	
	/**
	 * Default <code>Chart.defaults.color</code>
	 * <p/>
	 * Color of text
	 */
	public LegendTitle setColor(final Object color)
	{
		this.color = color;
		return this;
	}
	
	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	/**
	 * Default <code>false</code>
	 * <p/>
	 * Is the legend title displayed?
	 */
	public LegendTitle setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	/**
	 * @see #setFont(Font)
	 */
	public Font getFont()
	{
		return this.font;
	}
	
	/**
	 * Default <code>Chart.defaults.font</code>
	 */
	public LegendTitle setFont(final Font font)
	{
		this.font = font;
		return this;
	}
	
	/**
	 * @see #setPadding(Padding)
	 */
	public Padding getPadding()
	{
		return this.padding;
	}
	
	/**
	 * Padding around the title
	 */
	public LegendTitle setPadding(final Padding padding)
	{
		this.padding = padding;
		return this;
	}
	
	/**
	 * @see #setText(String)
	 */
	public String getText()
	{
		return this.text;
	}
	
	/**
	 * The string title
	 */
	public LegendTitle setText(final String text)
	{
		this.text = text;
		return this;
	}
}
