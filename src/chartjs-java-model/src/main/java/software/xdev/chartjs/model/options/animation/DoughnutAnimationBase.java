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

/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.6/src/types/index.d.ts#L284">ChartJS Source</a>
 */
public abstract class DoughnutAnimationBase<T extends DoughnutAnimationBase<T>> extends Animation<T>
{
	protected Boolean animateRotate;
	protected Boolean animateScale;
	
	public Boolean getAnimateRotate()
	{
		return this.animateRotate;
	}
	
	public DoughnutAnimationBase<T> setAnimateRotate(final Boolean animateRotate)
	{
		this.animateRotate = animateRotate;
		return this.self();
	}
	
	public Boolean getAnimateScale()
	{
		return this.animateScale;
	}
	
	public DoughnutAnimationBase<T> setAnimateScale(final Boolean animateScale)
	{
		this.animateScale = animateScale;
		return this.self();
	}
}
