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
package software.xdev.chart_java.options.elements;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

import software.xdev.chart_java.enums.FillMode;


/**
 * <p>
 * Option on the dataset object which can be used to create area between two datasets or a dataset and a boundary.
 * </p>
 */
public class Fill<T>
{
	@JsonValue
	protected T fill;
	
	public Fill()
	{
	}
	
	/**
	 * @param fill - If true, fill the area under the line
	 */
	public Fill(final Boolean fill)
	{
		this.fill = (T)fill;
	}
	
	/**
	 * @param index - Absolute dataset index
	 */
	public Fill(final String index)
	{
		this.fill = (T)index;
	}
	
	/**
	 * @param index - Relative dataset index
	 */
	public Fill(final Integer index)
	{
		this.fill = (T)index;
	}
	
	public Fill(final FillMode boundary)
	{
		this.fill = (T)boundary;
	}
	
	@JsonIgnore
	public T getFill()
	{
		return this.fill;
	}
	
	@JsonIgnore
	public void setFill(final T fill)
	{
		this.fill = fill;
	}
}
