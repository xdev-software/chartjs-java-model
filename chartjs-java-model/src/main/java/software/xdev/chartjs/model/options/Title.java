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

import software.xdev.chartjs.model.color.Color;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/labelling.html#scale-title-configuration">ChartJS docs</a>
 */
public class Title
{
	protected String align;
	protected Color color;
	protected Boolean display;
	protected Boolean fullSize;
	protected String position;
	protected Font font;
	protected Integer padding;
	protected String text;
	
	/**
	 * @see #setAlign(String)
	 */
	public String getAlign()
	{
		return this.align;
	}
	
	/**
	 * Alignment of the title
	 *
	 * <p>Default: center</p>
	 */
	public Title setAlign(final String align)
	{
		this.align = align;
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
	 * Color of text
	 */
	public Title setColor(final Color color)
	{
		this.color = color;
		return this;
	}
	
	/**
	 * @see #setFullSize(Boolean)
	 */
	public Boolean getFullSize()
	{
		return this.fullSize;
	}
	
	/**
	 * Marks that this box should take the full width/height of the canvas. If false, the box is sized and placed
	 * above/beside the chart area.
	 *
	 * <p>Default: true</p>
	 */
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
	
	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	/**
	 * <p>
	 * Display the title block
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public Title setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	/**
	 * @see #setPosition(String)
	 */
	public String getPosition()
	{
		return this.position;
	}
	
	/**
	 * <p>
	 * Position of the title. Only 'top' or 'bottom' are currently allowed
	 * </p>
	 *
	 * <p>
	 * Default {@code 'top'}
	 * </p>
	 */
	public Title setPosition(final String position)
	{
		this.position = position;
		return this;
	}
	
	/**
	 * @see #setPadding(Integer)
	 */
	public Integer getPadding()
	{
		return this.padding;
	}
	
	/**
	 * <p>
	 * Number of pixels to add above and below the title text
	 * </p>
	 *
	 * <p>
	 * Default {@code 10}
	 * </p>
	 */
	public Title setPadding(final Integer padding)
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
	 * <p>
	 * Title text
	 * </p>
	 *
	 * <p>
	 * Default {@code ""}
	 * </p>
	 */
	public Title setText(final String text)
	{
		this.text = text;
		return this;
	}
}
