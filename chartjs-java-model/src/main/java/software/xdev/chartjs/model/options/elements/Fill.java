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
package software.xdev.chartjs.model.options.elements;

import com.fasterxml.jackson.annotation.JsonValue;

import software.xdev.chartjs.model.enums.FillMode;


/**
 * <p>
 * Option on the dataset object which can be used to create area between two datasets or a dataset and a boundary.
 * </p>
 */
public class Fill<T>
{
	@SuppressWarnings("java:S1700") // Used inside JSON model
	@JsonValue
	protected T fill;
	
	public Fill()
	{
	}
	
	/**
	 * @param fill - If true, fill the area under the line
	 */
	@SuppressWarnings("unchecked") // Support for legacy
	public Fill(final Boolean fill)
	{
		this.fill = (T)fill;
	}
	
	/**
	 * @param index - Absolute dataset index
	 */
	@SuppressWarnings("unchecked") // Support for legacy
	public Fill(final String index)
	{
		this.fill = (T)index;
	}
	
	/**
	 * @param index - Relative dataset index
	 */
	@SuppressWarnings("unchecked") // Support for legacy
	public Fill(final Integer index)
	{
		this.fill = (T)index;
	}
	
	@SuppressWarnings("unchecked") // Support for legacy
	public Fill(final FillMode boundary)
	{
		this.fill = (T)boundary;
	}
	
	public T getFill()
	{
		return this.fill;
	}
	
	public void setFill(final T fill)
	{
		this.fill = fill;
	}
}
