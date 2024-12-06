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

import software.xdev.chartjs.model.options.animation.DoughnutAnimationBase;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.6/src/types/index.d.ts#L298">ChartJS Source</a>
 */
public abstract class DoughnutOptionsBase<O extends DoughnutOptionsBase<O, A>, A extends DoughnutAnimationBase<A>>
	extends Options<O, A>
{
	private Number circumference;
	private Object cutout; // number or string
	private Object offset; // number or number[]
	private Object radius; // number or string
	private Number rotation;
	private Number spacing;
	
	public Number getCircumference()
	{
		return this.circumference;
	}
	
	public DoughnutOptionsBase<O, A> setCircumference(final Number circumference)
	{
		this.circumference = circumference;
		return this.self();
	}
	
	public Object getCutout()
	{
		return this.cutout;
	}
	
	public DoughnutOptionsBase<O, A> setCutout(final Object cutout)
	{
		this.cutout = cutout;
		return this.self();
	}
	
	public Object getOffset()
	{
		return this.offset;
	}
	
	public DoughnutOptionsBase<O, A> setOffset(final Object offset)
	{
		this.offset = offset;
		return this.self();
	}
	
	public Object getRadius()
	{
		return this.radius;
	}
	
	public DoughnutOptionsBase<O, A> setRadius(final Object radius)
	{
		this.radius = radius;
		return this.self();
	}
	
	public Number getRotation()
	{
		return this.rotation;
	}
	
	public DoughnutOptionsBase<O, A> setRotation(final Number rotation)
	{
		this.rotation = rotation;
		return this.self();
	}
	
	public Number getSpacing()
	{
		return this.spacing;
	}
	
	public DoughnutOptionsBase<O, A> setSpacing(final Number spacing)
	{
		this.spacing = spacing;
		return this.self();
	}
}
