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
 * Point elements are used to represent the points in a line chart or a bubble chart.
 */
public class PointElements
{
	protected Point point;
	
	/**
	 * Constructor
	 *
	 * @param point {@link Point} instance or {@code null}
	 */
	public PointElements(final Point point)
	{
		this.point = point;
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
	 * @return this {@link PointElements} instance for chaining
	 */
	public PointElements setPoint(final Point point)
	{
		this.point = point;
		return this;
	}
}
