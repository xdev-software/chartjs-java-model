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
package software.xdev.chartjs.model.dataset;

import java.util.ArrayList;
import java.util.List;

import software.xdev.chartjs.model.enums.BorderCapStyle;
import software.xdev.chartjs.model.enums.BorderJoinStyle;
import software.xdev.chartjs.model.enums.PointStyle;
import software.xdev.chartjs.model.objects.OptionalArray;
import software.xdev.chartjs.model.options.elements.Fill;


public abstract class PointDataset<T extends Dataset<T, O>, O> extends Dataset<T, O>
{
	private Fill<?> fill;
	
	private Float lineTension;
	
	private Object backgroundColor;
	
	private Integer borderWidth;
	
	private Object borderColor;
	
	private BorderCapStyle borderCapStyle;
	
	private final List<Integer> borderDash = new ArrayList<>();
	
	private Float borderDashOffset;
	
	private BorderJoinStyle borderJoinStyle;
	
	private final List<Object> pointBorderColor = new OptionalArray<>();
	
	private final List<Object> pointBackgroundColor = new OptionalArray<>();
	
	private final List<Integer> pointBorderWidth = new OptionalArray<>();
	
	private final List<Integer> pointRadius = new OptionalArray<>();
	
	private final List<Integer> pointHoverRadius = new OptionalArray<>();
	
	private final List<Integer> pointHitRadius = new OptionalArray<>();
	
	private final List<Object> pointHoverBackgroundColor = new OptionalArray<>();
	
	private final List<Object> pointHoverBorderColor = new OptionalArray<>();
	
	private final List<Integer> pointHoverBorderWidth = new OptionalArray<>();
	
	private final List<PointStyle> pointStyle = new OptionalArray<>();
	
	/**
	 * @see #setFill(Fill)
	 */
	public Fill getFill()
	{
		return this.fill;
	}
	
	/**
	 * If true, fill the area under the line
	 */
	public T setFill(final Fill<?> fill)
	{
		this.fill = fill;
		return this.self();
	}
	
	/**
	 * @see #setLineTension(Float)
	 */
	public Float getLineTension()
	{
		return this.lineTension;
	}
	
	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines.
	 */
	public T setLineTension(final Float lineTension)
	{
		this.lineTension = lineTension;
		return this.self();
	}
	
	/**
	 * @see #setBackgroundColor(Object)
	 */
	public Object getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	/**
	 * The fill color under the line.
	 */
	public T setBackgroundColor(final Object backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this.self();
	}
	
	/**
	 * @see #setBorderWidth(Integer)
	 */
	public Integer getBorderWidth()
	{
		return this.borderWidth;
	}
	
	/**
	 * The width of the line in pixels
	 */
	public T setBorderWidth(final Integer borderWidth)
	{
		this.borderWidth = borderWidth;
		return this.self();
	}
	
	/**
	 * @see #setBorderColor(Object)
	 */
	public Object getBorderColor()
	{
		return this.borderColor;
	}
	
	/**
	 * The color of the line.
	 */
	public T setBorderColor(final Object borderColor)
	{
		this.borderColor = borderColor;
		return this.self();
	}
	
	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	public BorderCapStyle getBorderCapStyle()
	{
		return this.borderCapStyle;
	}
	
	/**
	 * Default line cap style.
	 * <ul>
	 * <li>{@code butt} The ends of lines are squared off at the endpoints.
	 * <li>{@code round} The ends of lines are rounded.
	 * <li>{@code square} The ends of lines are squared off by adding a box with
	 * an equal width and half the height of the line's thickness.
	 * </ul>
	 */
	public T setBorderCapStyle(final BorderCapStyle borderCapStyle)
	{
		this.borderCapStyle = borderCapStyle;
		return this.self();
	}
	
	/**
	 * @see #setBorderDash(List)
	 */
	public List<Integer> getBorderDash()
	{
		return this.borderDash;
	}
	
	/**
	 * @see #setBorderDash(List)
	 */
	public T addBorderDash(final Integer borderDash)
	{
		this.borderDash.add(borderDash);
		return this.self();
	}
	
	/**
	 * Default line dash. A list of numbers that specifies distances to alternately draw a line and a gap (in
	 * coordinate
	 * space units). If the number of elements in the array is odd, the elements of the array get copied and
	 * concatenated. For example, [5, 15, 25] will become [5, 15, 25, 5, 15, 25].
	 */
	public T setBorderDash(final List<Integer> borderDash)
	{
		this.borderDash.clear();
		if(borderDash != null)
		{
			this.borderDash.addAll(borderDash);
		}
		return this.self();
	}
	
	/**
	 * @see #setBorderDashOffset(Float)
	 */
	public Float getBorderDashOffset()
	{
		return this.borderDashOffset;
	}
	
	/**
	 * Default line dash offset. A float specifying the amount of the offset. Initially 0.0.
	 */
	public T setBorderDashOffset(final Float borderDashOffset)
	{
		this.borderDashOffset = borderDashOffset;
		return this.self();
	}
	
	/**
	 * @see #setBorderJoinStyle(BorderJoinStyle)
	 */
	public BorderJoinStyle getBorderJoinStyle()
	{
		return this.borderJoinStyle;
	}
	
	/**
	 * <p>
	 * Default line join style.
	 * </p>
	 * <ul>
	 * <li>{@code round} Rounds off the corners of a shape by filling an
	 * additional sector of disc centered at the common endpoint of connected
	 * segments. The radius for these rounded corners is equal to the line
	 * width.
	 * <li>{@code bevel} Fills an additional triangular area between the common
	 * endpoint of connected segments, and the separate outside rectangular
	 * corners of each segment.
	 * <li>{@code miter} Connected segments are joined by extending their
	 * outside edges to connect at a single point, with the effect of filling an
	 * additional lozenge-shaped area. This setting is effected by the
	 * miterLimit property.
	 * </ul>
	 */
	public T setBorderJoinStyle(final BorderJoinStyle borderJoinStyle)
	{
		this.borderJoinStyle = borderJoinStyle;
		return this.self();
	}
	
	/**
	 * @see #setPointBorderColor(List)
	 */
	public List<Object> getPointBorderColor()
	{
		return this.pointBorderColor;
	}
	
	/**
	 * @see #setPointBorderColor(List)
	 */
	public T addPointBorderColor(final Object pointBorderColor)
	{
		this.pointBorderColor.add(pointBorderColor);
		return this.self();
	}
	
	/**
	 * The border color for points.
	 */
	public T setPointBorderColor(final List<Object> pointBorderColor)
	{
		this.pointBorderColor.clear();
		if(pointBorderColor != null)
		{
			this.pointBorderColor.addAll(pointBorderColor);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointBackgroundColor(List)
	 */
	public List<Object> getPointBackgroundColor()
	{
		return this.pointBackgroundColor;
	}
	
	/**
	 * @see #setPointBackgroundColor(List)
	 */
	public T addPointBackgroundColor(final Object pointBackgroundColor)
	{
		this.pointBackgroundColor.add(pointBackgroundColor);
		return this.self();
	}
	
	/**
	 * The fill color for points
	 */
	public T setPointBackgroundColor(final List<Object> pointBackgroundColor)
	{
		this.pointBackgroundColor.clear();
		if(pointBackgroundColor != null)
		{
			this.pointBackgroundColor.addAll(pointBackgroundColor);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointBorderWidth(List)
	 */
	public List<Integer> getPointBorderWidth()
	{
		return this.pointBorderWidth;
	}
	
	/**
	 * @see #setPointBorderWidth(List)
	 */
	public T addPointBorderWidth(final Integer pointBorderWidth)
	{
		this.pointBorderWidth.add(pointBorderWidth);
		return this.self();
	}
	
	/**
	 * The width of the point border in pixels
	 */
	public T setPointBorderWidth(final List<Integer> pointBorderWidth)
	{
		this.pointBorderWidth.clear();
		if(pointBorderWidth != null)
		{
			this.pointBorderWidth.addAll(pointBorderWidth);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointRadius(List)
	 */
	public List<Integer> getPointRadius()
	{
		return this.pointRadius;
	}
	
	/**
	 * @see #setPointRadius(List)
	 */
	public T addPointRadius(final Integer pointRadius)
	{
		this.pointRadius.add(pointRadius);
		return this.self();
	}
	
	/**
	 * The radius of the point shape. If set to 0, nothing is rendered.
	 */
	public T setPointRadius(final List<Integer> pointRadius)
	{
		this.pointRadius.clear();
		if(pointRadius != null)
		{
			this.pointRadius.addAll(pointRadius);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointHoverRadius(List)
	 */
	public List<Integer> getPointHoverRadius()
	{
		return this.pointHoverRadius;
	}
	
	/**
	 * @see #setPointHoverRadius(List)
	 */
	public T addPointHoverRadius(final Integer pointHoverRadius)
	{
		this.pointHoverRadius.add(pointHoverRadius);
		return this.self();
	}
	
	/**
	 * The radius of the point when hovered
	 */
	public T setPointHoverRadius(final List<Integer> pointHoverRadius)
	{
		this.pointHoverRadius.clear();
		if(pointHoverRadius != null)
		{
			this.pointHoverRadius.addAll(pointHoverRadius);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointHitRadius(List)
	 */
	public List<Integer> getPointHitRadius()
	{
		return this.pointHitRadius;
	}
	
	/**
	 * @see #setPointHitRadius(List)
	 */
	public T addPointHitRadius(final Integer pointHitRadius)
	{
		this.pointHitRadius.add(pointHitRadius);
		return this.self();
	}
	
	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public T setPointHitRadius(final List<Integer> pointHitRadius)
	{
		this.pointHitRadius.clear();
		if(pointHitRadius != null)
		{
			this.pointHitRadius.addAll(pointHitRadius);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	public List<Object> getPointHoverBackgroundColor()
	{
		return this.pointHoverBackgroundColor;
	}
	
	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	public T addPointHoverBackgroundColor(final Object pointHoverBackgroundColor)
	{
		this.pointHoverBackgroundColor.add(pointHoverBackgroundColor);
		return this.self();
	}
	
	/**
	 * Point background color when hovered
	 */
	public T setPointHoverBackgroundColor(final List<Object> pointHoverBackgroundColor)
	{
		this.pointHoverBackgroundColor.clear();
		if(pointHoverBackgroundColor != null)
		{
			this.pointHoverBackgroundColor.addAll(pointHoverBackgroundColor);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	public List<Object> getPointHoverBorderColor()
	{
		return this.pointHoverBorderColor;
	}
	
	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	public T addPointHoverBorderColor(final Object pointHoverBorderColor)
	{
		this.pointHoverBorderColor.add(pointHoverBorderColor);
		return this.self();
	}
	
	/**
	 * Point border color when hovered
	 */
	public T setPointHoverBorderColor(final List<Object> pointHoverBorderColor)
	{
		this.pointHoverBorderColor.clear();
		if(pointHoverBorderColor != null)
		{
			this.pointHoverBorderColor.addAll(pointHoverBorderColor);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	public List<Integer> getPointHoverBorderWidth()
	{
		return this.pointHoverBorderWidth;
	}
	
	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	public T addPointHoverBorderWidth(final Integer pointHoverBorderWidth)
	{
		this.pointHoverBorderWidth.add(pointHoverBorderWidth);
		return this.self();
	}
	
	/**
	 * Border width of point when hovered
	 */
	public T setPointHoverBorderWidth(final List<Integer> pointHoverBorderWidth)
	{
		this.pointHoverBorderWidth.clear();
		if(pointHoverBorderWidth != null)
		{
			this.pointHoverBorderWidth.addAll(pointHoverBorderWidth);
		}
		return this.self();
	}
	
	/**
	 * @see #setPointStyle(List)
	 */
	public List<PointStyle> getPointStyle()
	{
		return this.pointStyle;
	}
	
	/**
	 * @see #setPointStyle(List)
	 */
	public T addPointStyle(final PointStyle pointStyle)
	{
		this.pointStyle.add(pointStyle);
		return this.self();
	}
	
	/**
	 * The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot', 'cross', 'crossRot', 'star', 'line',
	 * and
	 * 'dash'. If the option is an image, that image is drawn on the canvas using drawImage.
	 */
	public T setPointStyle(final List<PointStyle> pointStyle)
	{
		this.pointStyle.clear();
		if(pointStyle != null)
		{
			this.pointStyle.addAll(pointStyle);
		}
		return this.self();
	}
}
