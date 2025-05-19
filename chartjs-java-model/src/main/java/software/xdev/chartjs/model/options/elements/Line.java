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

import java.util.List;

import software.xdev.chartjs.model.enums.BorderCapStyle;
import software.xdev.chartjs.model.enums.BorderJoinStyle;


/**
 * <p>
 * Line elements are used to represent the line in a line chart.
 * </p>
 * <p>
 * When set, these options apply to all objects of that type unless specifically overridden by the configuration
 * attached to a dataset.
 * </p>
 */
public class Line
{
	protected Float tension;
	protected Object backgroundColor;
	protected Integer borderWidth;
	protected Object borderColor;
	protected BorderCapStyle borderCapStyle;
	protected List<Integer> borderDash;
	protected Float borderDashOffset;
	protected BorderJoinStyle borderJoinStyle;
	protected Boolean capBezierPoints;
	protected Fill<?> fill;
	protected Boolean stepped;
	
	/**
	 * @see #setTension(Float)
	 */
	public Float getTension()
	{
		return this.tension;
	}
	
	/**
	 * <p>
	 * Default bezier curve tension. Set to 0 for no bezier curves.
	 * </p>
	 *
	 * <p>
	 * Default {@code 0.4}
	 * </p>
	 */
	public Line setTension(final Float tension)
	{
		this.tension = tension;
		return this;
	}
	
	/**
	 * @see #setBackgroundColor(Object)
	 */
	public Object getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	/**
	 * <p>
	 * Default line fill color
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public Line setBackgroundColor(final Object backgroundColor)
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
	 * Default line stroke width
	 * </p>
	 *
	 * <p>
	 * Default {@code 3}
	 * </p>
	 */
	public Line setBorderWidth(final Integer borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}
	
	/**
	 * @see #setBorderColor(Object)
	 */
	public Object getBorderColor()
	{
		return this.borderColor;
	}
	
	/**
	 * <p>
	 * Default line stroke color
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.1)'}
	 * </p>
	 */
	public Line setBorderColor(final Object borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}
	
	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	public BorderCapStyle getBorderCapStyle()
	{
		return this.borderCapStyle;
	}
	
	/**
	 * <p>
	 * Default line cap style.
	 * </p>
	 *
	 * <ul>
	 * <li>{@code butt} The ends of lines are squared off at the endpoints.
	 * <li>{@code round} The ends of lines are rounded.
	 * <li>{@code square} The ends of lines are squared off by adding a box with
	 * an equal width and half the height of the line's thickness.
	 * </ul>
	 *
	 * <p>
	 * Default {@code 'butt'}
	 * </p>
	 */
	public Line setBorderCapStyle(final BorderCapStyle borderCapStyle)
	{
		this.borderCapStyle = borderCapStyle;
		return this;
	}
	
	/**
	 * @see #setBorderDash(List)
	 */
	public List<Integer> getBorderDash()
	{
		return this.borderDash;
	}
	
	/**
	 * <p>
	 * Default line dash.
	 * </p>
	 *
	 * <p>
	 * A list of numbers that specifies distances to alternately draw a line and a gap (in coordinate space units). If
	 * the number of elements in the array is odd, the elements of the array get copied and concatenated. For example,
	 * [5, 15, 25] will become [5, 15, 25, 5, 15, 25].
	 * </p>
	 *
	 * <p>
	 * Default {@code []}
	 * </p>
	 */
	public Line setBorderDash(final List<Integer> borderDash)
	{
		this.borderDash = borderDash;
		return this;
	}
	
	/**
	 * @see #setBorderDashOffset(Float)
	 */
	public Float getBorderDashOffset()
	{
		return this.borderDashOffset;
	}
	
	/**
	 * <p>
	 * Default line dash offset. A float specifying the amount of the offset. Initially 0.0.
	 * </p>
	 *
	 * <p>
	 * Default {@code 0.0}
	 * </p>
	 */
	public Line setBorderDashOffset(final Float borderDashOffset)
	{
		this.borderDashOffset = borderDashOffset;
		return this;
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
	 *
	 * <p>
	 * Default {@code 'miter'}
	 * </p>
	 */
	public Line setBorderJoinStyle(final BorderJoinStyle borderJoinStyle)
	{
		this.borderJoinStyle = borderJoinStyle;
		return this;
	}
	
	/**
	 * @see #setCapBezierPoints(Boolean)
	 */
	public Boolean getCapBezierPoints()
	{
		return this.capBezierPoints;
	}
	
	/**
	 * <p>
	 * If true, bezier control points are kept inside the chart. If false, no restriction is enforced.
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public Line setCapBezierPoints(final Boolean capBezierPoints)
	{
		this.capBezierPoints = capBezierPoints;
		return this;
	}
	
	/**
	 * @see #setFill(Fill)
	 */
	public Fill getFill()
	{
		return this.fill;
	}
	
	/**
	 * <p>
	 * If true, the line is filled.
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public Line setFill(final Fill<?> fill)
	{
		this.fill = fill;
		return this;
	}
	
	/**
	 * @see #setStepped(Boolean)
	 */
	public Boolean getStepped()
	{
		return this.stepped;
	}
	
	/**
	 * <p>
	 * If true, the line is shown as a steeped line and 'tension' will be ignored
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public Line setStepped(final Boolean stepped)
	{
		this.stepped = stepped;
		return this;
	}
}
