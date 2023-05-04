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

import software.xdev.chart_java.data.Data;
import software.xdev.chart_java.data.ScatterData;
import software.xdev.chart_java.dataset.ScatterDataset;
import software.xdev.chart_java.options.LineOptions;
import software.xdev.chart_java.options.Options;


public class ScatterChart extends AbstractChart<ScatterChart, LineOptions, ScatterData>
{
	
	public ScatterChart()
	{
	}
	
	public ScatterChart(final ScatterData data)
	{
		super(data);
	}
	
	public ScatterChart(final ScatterData data, final LineOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for a {@link ScatterChart}.
	 *
	 * @return a new {@link ScatterData} instance
	 */
	public static ScatterData data()
	{
		return new ScatterData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link ScatterChart}.
	 *
	 * @return a new {@link LineOptions} instance
	 */
	public static LineOptions options()
	{
		return new LineOptions();
	}
	
	@Override
	public String getType()
	{
		return "scatter";
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * {@code LineChart} is drawable if at least one dataset has at least one data point.<br> If an xAxisID is set on a
	 * dataset, an xAxis scale must exist with that id.
	 * <br>
	 * If an yAxisID is set on a dataset, a yAxis scale must exist with that id.
	 * </p>
	 */
	@Override
	public boolean isDrawable()
	{
		boolean sufficientData = false;
		for(final ScatterDataset dataset : this.getData().getDatasets())
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
