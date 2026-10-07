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
import software.xdev.chartjs.model.data.RadarData;
import software.xdev.chartjs.model.options.Options;
import software.xdev.chartjs.model.options.RadarOptions;


public class RadarChart extends HomogeneousChart<RadarChart, RadarOptions, RadarData>
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
	 * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link RadarChart}.
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
}
