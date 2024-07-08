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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonValue;

import software.xdev.chartjs.model.options.animation.DefaultAnimation;
import software.xdev.chartjs.model.options.elements.LineElements;


@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility =
	Visibility.NONE)
public class LineOptions extends Options<LineOptions, DefaultAnimation>
{
	
	/**
	 * @see #setShowLine(Boolean)
	 */
	protected Boolean showLine;
	/**
	 * @see #setSpanGaps(Boolean)
	 */
	protected Boolean spanGaps;
	protected LineElements elements;
	
	/**
	 * The base axis of the dataset. 'x' for horizontal lines and 'y' for vertical lines.
	 */
	protected IndexAxis indexAxis;
	
	/**
	 * @see #setShowLine(Boolean)
	 */
	public Boolean getShowLine()
	{
		return this.showLine;
	}
	
	/**
	 * <p>
	 * If false, the lines between points are not drawn
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public LineOptions setShowLine(final Boolean showLine)
	{
		this.showLine = showLine;
		return this;
	}
	
	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps()
	{
		return this.spanGaps;
	}
	
	/**
	 * <p>
	 * If true, NaN data does not break the line
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public LineOptions setSpanGaps(final Boolean spanGaps)
	{
		this.spanGaps = spanGaps;
		return this;
	}
	
	/**
	 * @return {@link LineElements} instance, or {@code null} if not set
	 */
	public LineElements getElements()
	{
		return this.elements;
	}
	
	/**
	 * @param elements an {@link LineElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public LineOptions setElements(final LineElements elements)
	{
		this.elements = elements;
		return this;
	}
	
	/**
	 * @return {@link IndexAxis} value or {@code null} if not set
	 */
	public IndexAxis getIndexAxis()
	{
		return indexAxis;
	}
	
	/**
	 * @param indexAxis {@link IndexAxis} value or {@code null}
	 * @return this instance for method chaining
	 */
	public LineOptions setIndexAxis(IndexAxis indexAxis)
	{
		this.indexAxis = indexAxis;
		return this;
	}
	
	public enum IndexAxis
	{
		X,
		Y;
		
		@JsonValue
		@Override
		public String toString()
		{
			return super.toString().toLowerCase();
		}
	}
}
