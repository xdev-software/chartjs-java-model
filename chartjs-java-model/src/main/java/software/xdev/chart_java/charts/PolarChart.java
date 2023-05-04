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
import software.xdev.chart_java.data.PolarData;
import software.xdev.chart_java.dataset.PolarDataset;
import software.xdev.chart_java.options.Options;
import software.xdev.chart_java.options.PolarOptions;


public class PolarChart extends AbstractChart<PolarChart, PolarOptions, PolarData>
{
	public PolarChart()
	{
	}
	
	public PolarChart(final PolarData data)
	{
		super(data);
	}
	
	public PolarChart(final PolarData data, final PolarOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for a {@link PolarChart}.
	 *
	 * @return a new {@link PolarData} instance
	 */
	public static PolarData data()
	{
		return new PolarData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link PolarChart}.
	 *
	 * @return a new {@link PolarOptions} instance
	 */
	public static PolarOptions options()
	{
		return new PolarOptions();
	}
	
	@Override
	public String getType()
	{
		return "polarArea";
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * {@code PolarChart} is drawable if at least one dataset has at least two data points.
	 * </p>
	 */
	@Override
	public boolean isDrawable()
	{
		for(final PolarDataset dataset : this.getData().getDatasets())
		{
			if(dataset.getData().size() > 1)
			{
				return true;
			}
		}
		return false;
	}
}
