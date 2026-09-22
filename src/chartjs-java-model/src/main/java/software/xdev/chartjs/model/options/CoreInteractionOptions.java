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
package software.xdev.chartjs.model.options;

/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.6/src/types/index.d.ts#L1564">ChartJS Source</a>
 */
public class CoreInteractionOptions
{
	protected String mode;
	protected Boolean intersect;
	protected String axis;
	protected Boolean includeInvisible;
	
	public String getMode()
	{
		return this.mode;
	}
	
	public CoreInteractionOptions setMode(final String mode)
	{
		this.mode = mode;
		return this;
	}
	
	public Boolean getIntersect()
	{
		return this.intersect;
	}
	
	public CoreInteractionOptions setIntersect(final Boolean intersect)
	{
		this.intersect = intersect;
		return this;
	}
	
	public String getAxis()
	{
		return this.axis;
	}
	
	public CoreInteractionOptions setAxis(final String axis)
	{
		this.axis = axis;
		return this;
	}
	
	public Boolean getIncludeInvisible()
	{
		return this.includeInvisible;
	}
	
	public CoreInteractionOptions setIncludeInvisible(final Boolean includeInvisible)
	{
		this.includeInvisible = includeInvisible;
		return this;
	}
}
