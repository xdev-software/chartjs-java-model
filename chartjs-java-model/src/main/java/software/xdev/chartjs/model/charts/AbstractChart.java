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

import java.io.UncheckedIOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import software.xdev.chartjs.model.data.Data;
import software.xdev.chartjs.model.options.Options;


public abstract class AbstractChart<T, O extends Options<O, ?>, D extends Data<D, ?, ?>>
	implements Chart<T, O, D>
{
	protected D data;
	protected O options;
	
	protected final ObjectWriter objectWriter = new ObjectMapper()
		.setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY)
		.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
		.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE)
		.setVisibility(PropertyAccessor.IS_GETTER, JsonAutoDetect.Visibility.NONE)
		.setVisibility(PropertyAccessor.SETTER, JsonAutoDetect.Visibility.NONE)
		.setVisibility(PropertyAccessor.CREATOR, JsonAutoDetect.Visibility.NONE)
		.writer()
		.forType(this.getClass());
	
	protected AbstractChart()
	{
	}
	
	protected AbstractChart(final D data)
	{
		this();
		this.data = data;
	}
	
	protected AbstractChart(final D data, final O options)
	{
		this(data);
		this.options = options;
	}
	
	public D getData()
	{
		return this.data;
	}
	
	@Override
	public T setData(final D data)
	{
		this.data = data;
		return this.self();
	}
	
	public O getOptions()
	{
		return this.options;
	}
	
	@Override
	public T setOptions(final O options)
	{
		this.options = options;
		return this.self();
	}
	
	@Override
	public String toJson()
	{
		if(!this.isDrawable())
		{
			throw new IllegalArgumentException("Chart is not drawable");
		}
		
		try
		{
			return this.objectWriter.writeValueAsString(this);
		}
		catch(final JsonProcessingException e)
		{
			throw new UncheckedIOException("Failed to write json", e);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected T self()
	{
		return (T)this;
	}
}
