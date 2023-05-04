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
package software.xdev.chart_java.options.scales;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;


public class Scales
{
	@JsonIgnore
	Map<String, Object> scalesList = new LinkedHashMap<>();
	
	@JsonAnyGetter
	public Map<String, Object> getScalesList()
	{
		return this.scalesList;
	}
	
	public Scales addScale(final String customScaleName, final Scale<?, ?> scale)
	{
		this.getScalesList().put(customScaleName, scale);
		return this;
	}
	
	public Scales addScale(final ScaleAxis axis, final Scale<?, ?> scale)
	{
		this.getScalesList().put(axis.toString(), scale);
		return this;
	}
	
	public enum ScaleAxis
	{
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
