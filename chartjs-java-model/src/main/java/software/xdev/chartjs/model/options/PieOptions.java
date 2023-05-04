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

import java.math.BigDecimal;

import software.xdev.chartjs.model.options.animation.PieAnimation;
import software.xdev.chartjs.model.options.elements.ArcElements;


public class PieOptions extends Options<PieOptions, PieAnimation>
{
	
	/**
	 * Default {@code 50 - for doughnut, 0 - for pie}
	 *
	 * @see #setCutoutPercentage(BigDecimal cutoutPercentage)
	 */
	protected BigDecimal cutoutPercentage;
	
	/**
	 * Default {@code -0.5 * Math.PI}
	 *
	 * @see #setRotation(BigDecimal rotation)
	 */
	protected BigDecimal rotation;
	
	/**
	 * Default {@code 2 * Math.PI}
	 *
	 * @see #setCircumference(BigDecimal circumference)
	 */
	protected BigDecimal circumference;
	
	protected ArcElements elements;
	
	/**
	 * @see #setCutoutPercentage(BigDecimal cutoutPercentage)
	 */
	public BigDecimal getCutoutPercentage()
	{
		return this.cutoutPercentage;
	}
	
	/**
	 * The percentage of the chart that is cut out of the middle.
	 */
	public PieOptions setCutoutPercentage(final BigDecimal cutoutPercentage)
	{
		this.cutoutPercentage = cutoutPercentage;
		return this;
	}
	
	/**
	 * @see #setRotation(BigDecimal rotation)
	 */
	public BigDecimal getRotation()
	{
		return this.rotation;
	}
	
	/**
	 * Starting angle to draw arcs from
	 */
	public PieOptions setRotation(final BigDecimal rotation)
	{
		this.rotation = rotation;
		return this;
	}
	
	/**
	 * @see #setCircumference(BigDecimal circumference)
	 */
	public BigDecimal getCircumference()
	{
		return this.circumference;
	}
	
	/**
	 * Sweep to allow arcs to cover
	 */
	public PieOptions setCircumference(final BigDecimal circumference)
	{
		this.circumference = circumference;
		return this;
	}
	
	/**
	 * @return {@link ArcElements} instance, or {@code null} if not set
	 */
	public ArcElements getElements()
	{
		return this.elements;
	}
	
	/**
	 * @param elements an {@link ArcElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public PieOptions setElements(final ArcElements elements)
	{
		this.elements = elements;
		return this;
	}
}
