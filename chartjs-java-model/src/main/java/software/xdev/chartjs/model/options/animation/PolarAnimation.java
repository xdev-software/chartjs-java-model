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
package software.xdev.chartjs.model.options.animation;

public class PolarAnimation extends Animation<PolarAnimation>
{
	
	/**
	 * Default {@code true}
	 *
	 * @see #setAnimateRotate(Boolean)
	 */
	protected Boolean animateRotate;
	
	/**
	 * Default {@code true}
	 *
	 * @see #setAnimateScale(Boolean)
	 */
	protected Boolean animateScale;
	
	/**
	 * @see #setAnimateRotate(Boolean)
	 */
	public Boolean getAnimateRotate()
	{
		return this.animateRotate;
	}
	
	/**
	 * If true, will animate the rotation of the chart.
	 */
	public PolarAnimation setAnimateRotate(final Boolean animateRotate)
	{
		this.animateRotate = animateRotate;
		return this;
	}
	
	/**
	 * @see #setAnimateScale(Boolean)
	 */
	public Boolean getAnimateScale()
	{
		return this.animateScale;
	}
	
	/**
	 * If true, will animate scaling the chart.
	 */
	public PolarAnimation setAnimateScale(final Boolean animateScale)
	{
		this.animateScale = animateScale;
		return this;
	}
}
