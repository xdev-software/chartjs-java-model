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
package software.xdev.chartjs.model.options.scale;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;


public class Scales
{
	@SuppressWarnings("java:S1700")
	@JsonIgnore
	Map<String, Object> scales = new LinkedHashMap<>();
	
	@JsonAnyGetter
	public Map<String, Object> getScales()
	{
		return this.scales;
	}
	
	public Scales addScale(final String customScaleName, final AbstractCoreScaleOptions<?, ?> scale)
	{
		this.getScales().put(customScaleName, scale);
		return this;
	}
	
	public Scales addScale(final ScaleAxis axis, final AbstractCoreScaleOptions<?, ?> scale)
	{
		return this.addScale(axis.toString(), scale);
	}
	
	public enum ScaleAxis
	{
		R,
		X,
		Y;
		
		@JsonValue
		@Override
		public String toString()
		{
			return super.toString().toLowerCase();
		}
	}
}
