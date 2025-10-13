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

/**
 * Line elements are used to represent the line in a line chart.
 */
public class LineElements
{
	
	protected Line line;
	protected Point point;
	
	public LineElements()
	{
		
	}
	
	/**
	 * Constructor
	 *
	 * @param line {@link Line} instance or {@code null}
	 */
	public LineElements(final Line line)
	{
		this.line = line;
	}
	
	/**
	 * Constructor
	 *
	 * @param point {@link Point} instance or {@code null}
	 */
	public LineElements(final Point point)
	{
		this.point = point;
	}
	
	/**
	 * Constructor
	 *
	 * @param line  {@link Line} instance or {@code null}
	 * @param point {@link Point} instance or {@code null}
	 */
	public LineElements(final Line line, final Point point)
	{
		this.line = line;
		this.point = point;
	}
	
	/**
	 * @return {@link Line} instance or {@code null} if not set
	 * @see #setLine(Line)
	 */
	public Line getLine()
	{
		return this.line;
	}
	
	/**
	 * @param line {@link Line} instance or {@code null}
	 * @return this {@link LineElements} instance for chaining
	 */
	public LineElements setLine(final Line line)
	{
		this.line = line;
		return this;
	}
	
	/**
	 * @return {@link Point} instance or {@code null} if not set
	 * @see #setPoint(Point)
	 */
	public Point getPoint()
	{
		return this.point;
	}
	
	/**
	 * @param point {@link Point} instance or {@code null}
	 * @return this {@link LineElements} instance for chaining
	 */
	public LineElements setPoint(final Point point)
	{
		this.point = point;
		return this;
	}
}
