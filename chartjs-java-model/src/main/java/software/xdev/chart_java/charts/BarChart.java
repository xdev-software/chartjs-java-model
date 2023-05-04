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
package software.xdev.chart_java.charts;

import software.xdev.chart_java.data.BarData;
import software.xdev.chart_java.data.Data;
import software.xdev.chart_java.dataset.BarDataset;
import software.xdev.chart_java.options.BarOptions;
import software.xdev.chart_java.options.Options;


public class BarChart extends AbstractChart<BarChart, BarOptions, BarData>
{
	public BarChart()
	{
	}
	
	public BarChart(final BarData data)
	{
		super(data);
	}
	
	public BarChart(final BarData data, final BarOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for a {@link BarChart}.
	 *
	 * @return a new {@link BarData} instance
	 */
	public static BarData data()
	{
		return new BarData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link BarChart}.
	 *
	 * @return a new {@link BarOptions} instance
	 */
	public static BarOptions options()
	{
		return new BarOptions();
	}
	
	@Override
	public String getType()
	{
		return "bar";
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * A {@code BarChart} is drawable if:
	 * </p>
	 * <ul>
	 * <li>at least one dataset has at least one data point
	 * <li>an xAxis scale exists with the id of the xAxisID set on a dataset, if
	 * such an id set
	 * <li>a yAxis scale exists with the id of the yAxisID set on a dataset, if
	 * such an id is set
	 * <li>there is at least one label in the {@link BarData}
	 * </ul>
	 *
	 * @return true if this {@link BarChart} is drawable in its current state
	 */
	@Override
	public boolean isDrawable()
	{
		if(this.getData().getLabels().isEmpty())
		{
			return false;
		}
		boolean sufficientData = false;
		for(final BarDataset dataset : this.getData().getDatasets())
		{
			if(dataset.getXAxisID() != null && !this.hasScaleWithId(dataset.getXAxisID()))
			{
				return false;
			}
			if(dataset.getYAxisID() != null && !this.hasScaleWithId(dataset.getYAxisID()))
			{
				return false;
			}
			if(dataset.getData().size() > 0)
			{
				sufficientData = true;
			}
		}
		return sufficientData;
	}
	
	private boolean hasScaleWithId(final String id)
	{
		if(this.getOptions() != null
			&& this.getOptions().getScales() != null
			&& this.getOptions().getScales().getScalesList() != null)
		{
			return this.getOptions().getScales().getScalesList().get(id) != null;
		}
		return false;
	}
}
