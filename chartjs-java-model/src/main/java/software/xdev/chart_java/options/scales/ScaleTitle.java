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
package software.xdev.chart_java.options.scales;

import software.xdev.chart_java.color.Color;
import software.xdev.chart_java.enums.ScaleLabelAlignment;


/**
 * The grid line configuration is nested under the scale configuration in the scaleLabel key. It defines options for the
 * scale title.
 */
public class ScaleTitle
{
	protected Boolean display;
	protected String text;
	protected Color color;
	protected Font font;
	protected ScaleLabelAlignment align;
	
	public ScaleLabelAlignment getAlign()
	{
		return this.align;
	}
	
	public ScaleTitle setAlign(final ScaleLabelAlignment align)
	{
		this.align = align;
		return this;
	}
	
	public Font getFont()
	{
		return this.font;
	}
	
	public ScaleTitle setFont(final Font font)
	{
		this.font = font;
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
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public ScaleTitle setDisplay(final Boolean display)
	{
		this.display = display;
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
	 * <p>
	 * The text for the title. (i.e. "# of People", "Response Choices")
	 * </p>
	 *
	 * <p>
	 * Default {@code ""}
	 * </p>
	 */
	public ScaleTitle setText(final String text)
	{
		this.text = text;
		return this;
	}
	
	/**
	 * @see #setColor(Color)
	 */
	public Color getColor()
	{
		return this.color;
	}
	
	/**
	 * <p>
	 * Font color for the scale title.
	 * </p>
	 *
	 * <p>
	 * Default {@code "#666"}
	 * </p>
	 */
	public ScaleTitle setColor(final Color color)
	{
		this.color = color;
		return this;
	}
}
