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

import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.options.BarOptions;
import software.xdev.chartjs.model.options.Options;


public class BarChart extends HomogeneousChart<BarChart, BarOptions, BarData>
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
	 * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link BarChart}.
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
}
