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
import software.xdev.chart_java.data.PieData;
import software.xdev.chart_java.dataset.PieDataset;
import software.xdev.chart_java.options.Options;
import software.xdev.chart_java.options.PieOptions;


public class PieChart extends AbstractChart<PieChart, PieOptions, PieData>
{
	public PieChart()
	{
	}
	
	public PieChart(final PieData data)
	{
		super(data);
	}
	
	public PieChart(final PieData data, final PieOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for a {@link PieChart}.
	 *
	 * @return a new {@link PieData} instance
	 */
	public static PieData data()
	{
		return new PieData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link PieChart}.
	 *
	 * @return a new {@link PieOptions} instance
	 */
	public static PieOptions options()
	{
		return new PieOptions();
	}
	
	@Override
	public String getType()
	{
		return "pie";
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * {@code PieChart} is drawable if at least one dataset has at least one data point.
	 * </p>
	 */
	@Override
	public boolean isDrawable()
	{
		for(final PieDataset dataset : this.getData().getDatasets())
		{
			if(dataset.getData().size() > 1)
			{
				return true;
			}
		}
		return false;
	}
}
