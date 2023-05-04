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
import software.xdev.chartjs.model.enums.FontStyle;
import software.xdev.chartjs.model.enums.TitlePosition;


public class Title
{
	protected Boolean display;
	protected TitlePosition position;
	protected Boolean fullWidth;
	protected Integer fontSize;
	protected String fontFamily;
	protected Color fontColor;
	protected FontStyle fontStyle;
	protected Integer padding;
	protected String text;
	
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
	 * @see #setPosition(TitlePosition)
	 */
	public TitlePosition getPosition()
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
	public Title setPosition(final TitlePosition position)
	{
		this.position = position;
		return this;
	}
	
	/**
	 * @see #setFullWidth(Boolean)
	 */
	public Boolean getFullWidth()
	{
		return this.fullWidth;
	}
	
	/**
	 * <p>
	 * Marks that this box should take the full width of the canvas (pushing down other boxes)
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public Title setFullWidth(final Boolean fullWidth)
	{
		this.fullWidth = fullWidth;
		return this;
	}
	
	/**
	 * @see #setFontSize(Integer)
	 */
	public Integer getFontSize()
	{
		return this.fontSize;
	}
	
	/**
	 * <p>
	 * Font size inherited from global configuration
	 * </p>
	 *
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public Title setFontSize(final Integer fontSize)
	{
		this.fontSize = fontSize;
		return this;
	}
	
	/**
	 * @see #setFontFamily(String)
	 */
	public String getFontFamily()
	{
		return this.fontFamily;
	}
	
	/**
	 * <p>
	 * Font family inherited from global configuration
	 * </p>
	 *
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public Title setFontFamily(final String fontFamily)
	{
		this.fontFamily = fontFamily;
		return this;
	}
	
	/**
	 * @see #setFontColor(Color)
	 */
	public Color getFontColor()
	{
		return this.fontColor;
	}
	
	/**
	 * <p>
	 * Font color inherited from global configuration
	 * </p>
	 *
	 * <p>
	 * Default {@code "#666"}
	 * </p>
	 */
	public Title setFontColor(final Color fontColor)
	{
		this.fontColor = fontColor;
		return this;
	}
	
	/**
	 * @see #setFontStyle(FontStyle)
	 */
	public FontStyle getFontStyle()
	{
		return this.fontStyle;
	}
	
	/**
	 * <p>
	 * Font styling of the title, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 * </p>
	 *
	 * <p>
	 * Default {@code 'bold'}
	 * </p>
	 */
	public Title setFontStyle(final FontStyle fontStyle)
	{
		this.fontStyle = fontStyle;
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
