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
 * Arcs are used in the polar area, doughnut and pie charts.
 */
public class ArcElements
{
	
	protected Arc arc;
	
	/**
	 * No-arg constructor
	 */
	public ArcElements()
	{
		
	}
	
	/**
	 * Constructor
	 *
	 * @param arc {@link Arc} instance or {@code null}
	 */
	public ArcElements(final Arc arc)
	{
		this.arc = arc;
	}
	
	/**
	 * @return {@link Arc} instance or {@code null} if not set
	 * @see #setArc(Arc)
	 */
	public Arc getArc()
	{
		return this.arc;
	}
	
	/**
	 * @param arc {@link Arc} instance or {@code null}
	 * @return this {@link ArcElements} instance for chaining
	 */
	public ArcElements setArc(final Arc arc)
	{
		this.arc = arc;
		return this;
	}
}
