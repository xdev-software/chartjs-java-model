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

import software.xdev.chartjs.model.enums.FontStyle;


public class Font
{
	protected String family;
	protected Number size;
	protected FontStyle style;
	protected Number weight;
	protected String lineHeight;
	
	public String getFamily()
	{
		return this.family;
	}
	
	public Font setFamily(final String family)
	{
		this.family = family;
		return this;
	}
	
	public Number getSize()
	{
		return this.size;
	}
	
	public Font setSize(final Number size)
	{
		this.size = size;
		return this;
	}
	
	public FontStyle getStyle()
	{
		return this.style;
	}
	
	public Font setStyle(final FontStyle style)
	{
		this.style = style;
		return this;
	}
	
	public Number getWeight()
	{
		return this.weight;
	}
	
	public Font setWeight(final Number weight)
	{
		this.weight = weight;
		return this;
	}
	
	public String getLineHeight()
	{
		return this.lineHeight;
	}
	
	public void setLineHeight(final String lineHeight)
	{
		this.lineHeight = lineHeight;
	}
}
