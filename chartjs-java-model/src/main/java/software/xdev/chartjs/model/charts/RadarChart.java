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
package software.xdev.chartjs.model.charts;

import software.xdev.chartjs.model.data.Data;
import software.xdev.chartjs.model.data.RadarData;
import software.xdev.chartjs.model.dataset.RadarDataset;
import software.xdev.chartjs.model.options.Options;
import software.xdev.chartjs.model.options.RadarOptions;


public class RadarChart extends AbstractChart<RadarChart, RadarOptions, RadarData>
{
	public RadarChart()
	{
	}
	
	public RadarChart(final RadarData data)
	{
		super(data);
	}
	
	public RadarChart(final RadarData data, final RadarOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for a {@link RadarChart}.
	 *
	 * @return a new {@link RadarData} instance
	 */
	public static RadarData data()
	{
		return new RadarData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link RadarChart}.
	 *
	 * @return a new {@link RadarOptions} instance
	 */
	public static RadarOptions options()
	{
		return new RadarOptions();
	}
	
	@Override
	public String getType()
	{
		return "radar";
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * {@code RadarChart} is drawable if at least one dataset has at least three data points.
	 * </p>
	 */
	@Override
	public boolean isDrawable()
	{
		for(final RadarDataset dataset : this.getData().getDatasets())
		{
			if(dataset.getData().size() >= 3)
			{
				return true;
			}
		}
		return false;
	}
}
