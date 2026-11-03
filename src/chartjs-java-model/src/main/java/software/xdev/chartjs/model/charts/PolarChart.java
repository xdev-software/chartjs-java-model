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

import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.data.PolarData;
import software.xdev.chartjs.model.options.Options;
import software.xdev.chartjs.model.options.PolarOptions;


public class PolarChart extends HomogeneousChart<PolarChart, PolarOptions, PolarData>
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
	 * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link PolarChart}.
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
}
