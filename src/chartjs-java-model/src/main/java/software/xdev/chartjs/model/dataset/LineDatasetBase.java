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

import java.util.List;

import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L190">ChartJS Source</a>
 */
public abstract class LineDatasetBase<T extends PointDataset<T, O>, O> extends PointDataset<T, O>
{
	protected String xAxisID;
	protected String yAxisID;
	protected Object spanGaps;
	protected Boolean showLine;
	
	private final List<Integer> pointHitRadius = new OptionalArray<>();
	
	protected Number tension;
	protected Object stepped;
	
	public String getXAxisID()
	{
		return this.xAxisID;
	}
	
	public T setXAxisID(final String xAxisID)
	{
		this.xAxisID = xAxisID;
		return this.self();
	}
	
	public String getYAxisID()
	{
		return this.yAxisID;
	}
	
	public T setYAxisID(final String yAxisID)
	{
		this.yAxisID = yAxisID;
		return this.self();
	}
	
	public Boolean getShowLine()
	{
		return this.showLine;
	}
	
	public T setShowLine(final Boolean showLine)
	{
		this.showLine = showLine;
		return this.self();
	}
	
	public Object getSpanGaps()
	{
		return this.spanGaps;
	}
	
	public T setSpanGaps(final Object spanGaps)
	{
		this.spanGaps = spanGaps;
		return this.self();
	}
	
	public Number getTension()
	{
		return this.tension;
	}
	
	public T setTension(final Number tension)
	{
		this.tension = tension;
		return this.self();
	}
	
	public Object getStepped()
	{
		return this.stepped;
	}
	
	public T setStepped(final Object stepped)
	{
		this.stepped = stepped;
		return this.self();
	}
	
	/**
	 * @see #setPointHitRadius(List)
	 */
	@Override
	public List<Integer> getPointHitRadius()
	{
		return this.pointHitRadius;
	}
	
	/**
	 * @see #setPointHitRadius(List)
	 */
	@Override
	public T addPointHitRadius(final Integer pointHitRadius)
	{
		this.pointHitRadius.add(pointHitRadius);
		return this.self();
	}
	
	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	@Override
	public T setPointHitRadius(final List<Integer> pointHitRadius)
	{
		this.pointHitRadius.clear();
		if(pointHitRadius != null)
		{
			this.pointHitRadius.addAll(pointHitRadius);
		}
		return this.self();
	}
}
