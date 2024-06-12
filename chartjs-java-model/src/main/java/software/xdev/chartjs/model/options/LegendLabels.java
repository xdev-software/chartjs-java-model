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
import software.xdev.chartjs.model.javascript.JavaScriptFunction;


public class LegendLabels
{
	protected Integer boxWidth;
	protected Integer fontSize;
	protected FontStyle fontStyle;
	protected Color fontColor;
	protected String fontFamily;
	protected Integer padding;
	protected JavaScriptFunction generateLabels;
	protected Boolean usePointStyle;
	
	/**
	 * @see #setBoxWidth(Integer)
	 */
	public Integer getBoxWidth()
	{
		return this.boxWidth;
	}
	
	/**
	 * <p>
	 * Width of coloured box
	 * </p>
	 *
	 * <p>
	 * Default {@code 40}
	 * </p>
	 */
	public LegendLabels setBoxWidth(final Integer boxWidth)
	{
		this.boxWidth = boxWidth;
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
	public LegendLabels setFontSize(final Integer fontSize)
	{
		this.fontSize = fontSize;
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
	 * Font style inherited from global configuration
	 * </p>
	 *
	 * <p>
	 * Default {@code "normal"}
	 * </p>
	 */
	public LegendLabels setFontStyle(final FontStyle fontStyle)
	{
		this.fontStyle = fontStyle;
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
	public LegendLabels setFontColor(final Color fontColor)
	{
		this.fontColor = fontColor;
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
	public LegendLabels setFontFamily(final String fontFamily)
	{
		this.fontFamily = fontFamily;
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
	 * Padding between rows of colored boxes
	 * </p>
	 *
	 * <p>
	 * Default {@code 10}
	 * </p>
	 */
	public LegendLabels setPadding(final Integer padding)
	{
		this.padding = padding;
		return this;
	}
	
	/**
	 * @see #setGenerateLabels(JavaScriptFunction)
	 */
	public JavaScriptFunction getGenerateLabels()
	{
		return this.generateLabels;
	}
	
	/**
	 * <p>
	 * Generates legend items for each thing in the legend. Default implementation returns the text + styling for the
	 * color box. See Legend Item for details.
	 * </p>
	 *
	 * <p>
	 * Default {@code function(chart) {  }}
	 * </p>
	 */
	public LegendLabels setGenerateLabels(final JavaScriptFunction generateLabels)
	{
		this.generateLabels = generateLabels;
		return this;
	}
	
	/**
	 * @see #setUsePointStyle(Boolean)
	 */
	public Boolean getUsePointStyle()
	{
		return this.usePointStyle;
	}
	
	/**
	 * <p>
	 * Label style will match corresponding point style (size is based on fontSize, boxWidth is not used in this case).
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public LegendLabels setUsePointStyle(final Boolean usePointStyle)
	{
		this.usePointStyle = usePointStyle;
		return this;
	}
}
