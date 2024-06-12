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
package software.xdev.chartjs.model.options.elements;

import software.xdev.chartjs.model.color.Color;
import software.xdev.chartjs.model.enums.PointStyle;


/**
 * <p>
 * Point elements are used to represent the points in a line chart or a bubble chart.
 * </p>
 * <p>
 * When set, these options apply to all objects of that type unless specifically overridden by the configuration
 * attached to a dataset.
 * </p>
 */
public class Point
{
	
	protected Integer radius;
	
	protected PointStyle pointStyle;
	
	protected Color backgroundColor;
	
	protected Integer borderWidth;
	
	protected Color borderColor;
	
	protected Integer hitRadius;
	
	protected Integer hoverRadius;
	
	protected Integer hoverBorderWidth;
	
	/**
	 * @see #setRadius(Integer)
	 */
	public Integer getRadius()
	{
		return this.radius;
	}
	
	/**
	 * <p>
	 * Default point radius
	 * </p>
	 *
	 * <p>
	 * Default {@code 3}
	 * </p>
	 */
	public Point setRadius(final Integer radius)
	{
		this.radius = radius;
		return this;
	}
	
	/**
	 * @see #setPointStyle(PointStyle)
	 */
	public PointStyle getPointStyle()
	{
		return this.pointStyle;
	}
	
	/**
	 * <p>
	 * Default point style
	 * </p>
	 *
	 * <p>
	 * Default {@code 'circle'}
	 * </p>
	 */
	public Point setPointStyle(final PointStyle pointStyle)
	{
		this.pointStyle = pointStyle;
		return this;
	}
	
	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	/**
	 * <p>
	 * Default point fill color
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public Point setBackgroundColor(final Color backgroundColor)
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
	 * Default point stroke width
	 * </p>
	 *
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public Point setBorderWidth(final Integer borderWidth)
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
	 * Default point stroke color
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public Point setBorderColor(final Color borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}
	
	/**
	 * @see #setHitRadius(Integer)
	 */
	public Integer getHitRadius()
	{
		return this.hitRadius;
	}
	
	/**
	 * <p>
	 * Extra radius added to point radius for hit detection
	 * </p>
	 *
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public Point setHitRadius(final Integer hitRadius)
	{
		this.hitRadius = hitRadius;
		return this;
	}
	
	/**
	 * @see #setHoverRadius(Integer)
	 */
	public Integer getHoverRadius()
	{
		return this.hoverRadius;
	}
	
	/**
	 * <p>
	 * Default point radius when hovered
	 * </p>
	 *
	 * <p>
	 * Default {@code 4}
	 * </p>
	 */
	public Point setHoverRadius(final Integer hoverRadius)
	{
		this.hoverRadius = hoverRadius;
		return this;
	}
	
	/**
	 * @see #setHoverBorderWidth(Integer)
	 */
	public Integer getHoverBorderWidth()
	{
		return this.hoverBorderWidth;
	}
	
	/**
	 * <p>
	 * Default stroke width when hovered
	 * </p>
	 *
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public Point setHoverBorderWidth(final Integer hoverBorderWidth)
	{
		this.hoverBorderWidth = hoverBorderWidth;
		return this;
	}
}
