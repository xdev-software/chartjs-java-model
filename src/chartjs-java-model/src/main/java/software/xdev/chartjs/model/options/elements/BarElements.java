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
 * Bar elements are used to represent the bars in a bar chart.
 */
public class BarElements
{
	protected Bar bars;
	
	public BarElements()
	{
		
	}
	
	/**
	 * @param bar {@link Bar} instance or {@code null}
	 */
	public BarElements(final Bar bar)
	{
		this.bars = bar;
	}
	
	/**
	 * @return {@link Bar} instance or {@code null} if not set
	 * @see #setBars(Bar)
	 */
	public Bar getBars()
	{
		return this.bars;
	}
	
	/**
	 * @param bars {@link Bar} instance or {@code null}
	 * @return this {@link BarElements} instance for chaining
	 */
	public BarElements setBars(final Bar bars)
	{
		this.bars = bars;
		return this;
	}
}
