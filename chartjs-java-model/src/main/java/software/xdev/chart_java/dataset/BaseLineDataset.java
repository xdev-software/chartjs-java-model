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
package software.xdev.chart_java.dataset;

import java.util.List;

import software.xdev.chart_java.objects.OptionalArray;


public abstract class BaseLineDataset<T extends PointDataset<T, O>, O> extends PointDataset<T, O>
{
	private final List<Integer> pointHitRadius = new OptionalArray<>();
	private String xAxisID;
	private String yAxisID;
	private Boolean showLine;
	
	private Boolean spanGaps;
	
	private Boolean stepped;
	
	public String getXAxisID()
	{
		return this.xAxisID;
	}
	
	/**
	 * The ID of the x axis to plot this dataset on. The value for this property should equal the ID set at
	 * {@code chart.options.scales.xAxes.id}
	 */
	public T setXAxisID(final String xAxisID)
	{
		this.xAxisID = xAxisID;
		return this.self();
	}
	
	/**
	 * @see #setYAxisID(String)
	 */
	public String getYAxisID()
	{
		return this.yAxisID;
	}
	
	/**
	 * The ID of the y axis to plot this dataset on. The value for this property should equal the ID set at
	 * {@code chart.options.scales.yAxes.id}
	 */
	public T setYAxisID(final String yAxisID)
	{
		this.yAxisID = yAxisID;
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
	
	/**
	 * @see #setShowLine(Boolean)
	 */
	public Boolean getShowLine()
	{
		return this.showLine;
	}
	
	/**
	 * If false, the line is not drawn for this dataset
	 */
	public T setShowLine(final Boolean showLine)
	{
		this.showLine = showLine;
		return this.self();
	}
	
	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps()
	{
		return this.spanGaps;
	}
	
	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	public T setSpanGaps(final Boolean spanGaps)
	{
		this.spanGaps = spanGaps;
		return this.self();
	}
	
	/**
	 * @see #setStepped(Boolean)
	 */
	public Boolean getStepped()
	{
		return this.stepped;
	}
	
	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be ignored
	 */
	public T setStepped(final Boolean stepped)
	{
		this.stepped = stepped;
		return this.self();
	}
}
