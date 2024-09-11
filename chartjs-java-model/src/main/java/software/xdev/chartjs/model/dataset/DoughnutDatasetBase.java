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
package software.xdev.chartjs.model.dataset;

/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L248">ChartJS Source</a>
 */
public abstract class DoughnutDatasetBase<T extends DoughnutDatasetBase<T>>
	extends BackgroundBorderHoverDataset<T, Number>
	implements NumberDataset<T>
{
	protected Number circumference;
	protected Object offset;
	protected Number rotation;
	protected Number weight;
	protected Number spacing;
	
	public Number getCircumference()
	{
		return this.circumference;
	}
	
	public T setCircumference(final Number circumference)
	{
		this.circumference = circumference;
		return this.self();
	}
	
	public Object getOffset()
	{
		return this.offset;
	}
	
	public T setOffset(final Object offset)
	{
		this.offset = offset;
		return this.self();
	}
	
	public Number getRotation()
	{
		return this.rotation;
	}
	
	public T setRotation(final Number rotation)
	{
		this.rotation = rotation;
		return this.self();
	}
	
	public Number getWeight()
	{
		return this.weight;
	}
	
	public T setWeight(final Number weight)
	{
		this.weight = weight;
		return this.self();
	}
	
	public Number getSpacing()
	{
		return this.spacing;
	}
	
	public T setSpacing(final Number spacing)
	{
		this.spacing = spacing;
		return this.self();
	}
}
