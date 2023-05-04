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
package software.xdev.chart_java.options;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

import software.xdev.chart_java.options.animation.DefaultAnimation;
import software.xdev.chart_java.options.elements.BarElements;


public class BarOptions extends Options<BarOptions, DefaultAnimation>
{
	protected IndexAxis indexAxis = IndexAxis.X;
	protected Hover hover;
	protected BarElements elements;
	
	/**
	 * @return {@link Hover} instance or {@code null}
	 * @see #setHover(Hover)
	 */
	@Override
	public Hover getHover()
	{
		return this.hover;
	}
	
	/**
	 * <p>
	 * Label's hover mode. "label" is used since the x axis displays data by the index in the dataset.
	 * </p>
	 * <p>
	 * Default {@code "label"}
	 * </p>
	 *
	 * @param hover {@link Hover} instance or {@code null}
	 * @return this {@link BarOptions} instance for method chaining
	 */
	@Override
	public BarOptions setHover(final Hover hover)
	{
		this.hover = hover;
		return this;
	}
	
	/**
	 * @return {@link BarElements} instance, or {@code null} if not set
	 */
	public BarElements getElements()
	{
		return this.elements;
	}
	
	/**
	 * @param elements an {@link BarElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public BarOptions setElements(final BarElements elements)
	{
		this.elements = elements;
		return this;
	}
	
	/**
	 * @return the orientation of the bars
	 */
	public IndexAxis getIndexAxis()
	{
		return this.indexAxis;
	}
	
	/**
	 * <p>
	 * Sets the orientation of the bars. {@code "y"} results in horizontal bars.
	 * </p>
	 * <p>
	 * Default {@code "x"}
	 * </p>
	 *
	 * @param indexAxis
	 */
	public BarOptions setIndexAxis(final IndexAxis indexAxis)
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
			return super.toString().toLowerCase(Locale.ENGLISH);
		}
	}
}
