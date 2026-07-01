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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import software.xdev.chartjs.model.data.AbstractData;
import software.xdev.chartjs.model.options.Options;
import tools.jackson.databind.ObjectWriter;
import tools.jackson.databind.json.JsonMapper;


public abstract class AbstractChart<T, O extends Options<?, ?>, D extends AbstractData<?, ?>>
	implements Chart<T, O, D>
{
	protected D data;
	protected O options;
	
	@JsonIgnore
	protected ObjectWriter defaultObjectWriter = JsonMapper.builder()
		.changeDefaultPropertyInclusion(v -> v
			.withValueInclusion(JsonInclude.Include.NON_EMPTY))
		.changeDefaultVisibility(vc -> vc
			.withFieldVisibility(JsonAutoDetect.Visibility.ANY)
			.withGetterVisibility(JsonAutoDetect.Visibility.NONE)
			.withIsGetterVisibility(JsonAutoDetect.Visibility.NONE)
			.withSetterVisibility(JsonAutoDetect.Visibility.NONE)
			.withCreatorVisibility(JsonAutoDetect.Visibility.NONE))
		.build()
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
	
	@JsonIgnore
	public ObjectWriter getDefaultObjectWriter()
	{
		return this.defaultObjectWriter;
	}
	
	@JsonIgnore
	public T setDefaultObjectWriter(final ObjectWriter defaultObjectWriter)
	{
		this.defaultObjectWriter = defaultObjectWriter;
		return this.self();
	}
	
	@Override
	public String toJson()
	{
		return this.defaultObjectWriter.writeValueAsString(this);
	}
	
	@SuppressWarnings("unchecked")
	protected T self()
	{
		return (T)this;
	}
}
