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
package software.xdev.chart_java.options.elements;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import software.xdev.chart_java.color.Color;
import software.xdev.chart_java.enums.BorderSkipped;


/**
 * <p>
 * Bar elements are used to represent the bars in a bar chart.
 * </p>
 * <p>
 * When set, these options apply to all objects of that type unless specifically overridden by the configuration
 * attached to a dataset.
 * </p>
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility =
	Visibility.NONE)
public class Bar
{
	
	/**
	 * @see #setBackgroundColor(Color)
	 */
	protected Color backgroundColor;
	
	/**
	 * @see #setBorderWidth(Integer)
	 */
	protected Integer borderWidth;
	
	/**
	 * @see #setBorderColor(Color)
	 */
	protected Color borderColor;
	
	/**
	 * @see #setBorderSkipped(BorderSkipped)
	 */
	protected BorderSkipped borderSkipped;
	
	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	/**
	 * <p>
	 * Default bar fill color
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public Bar setBackgroundColor(final Color backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}
	
	/**
	 * @see #setBorderWidth(Integer)
	 */
	public Integer getBorderWidth()
	{
		return this.borderWidth;
	}
	
	/**
	 * <p>
	 * Default bar stroke width
	 * </p>
	 *
	 * <p>
	 * Default {@code 0}
	 * </p>
	 */
	public Bar setBorderWidth(final Integer borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}
	
	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor()
	{
		return this.borderColor;
	}
	
	/**
	 * <p>
	 * Default bar stroke color
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public Bar setBorderColor(final Color borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}
	
	/**
	 * @see #setBorderSkipped(BorderSkipped)
	 */
	public BorderSkipped getBorderSkipped()
	{
		return this.borderSkipped;
	}
	
	/**
	 * <p>
	 * Default skipped (excluded) border for rectangle. Can be one of bottom, left, top, right
	 * </p>
	 *
	 * <p>
	 * Default {@code 'bottom'}
	 * </p>
	 */
	public Bar setBorderSkipped(final BorderSkipped borderSkipped)
	{
		this.borderSkipped = borderSkipped;
		return this;
	}
}
