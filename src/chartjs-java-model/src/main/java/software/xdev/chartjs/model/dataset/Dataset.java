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
package software.xdev.chartjs.model.dataset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import software.xdev.chartjs.model.enums.IndexAxis;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L66">ChartJS Source</a>
 */
public abstract class Dataset<T extends Dataset<T, O>, O>
{
	protected String type;
	protected final List<Object> data = new ArrayList<>();
	
	protected IndexAxis indexAxis;
	protected Object clip;
	protected String label;
	protected Number order;
	protected String stack;
	protected Boolean hidden;
	
	protected abstract String defaultType();
	
	/**
	 * Set's the default type
	 */
	public T withDefaultType()
	{
		return this.setType(this.defaultType());
	}
	
	public String getType()
	{
		return this.type;
	}
	
	/**
	 * Sets the {@code type} of the dataset.
	 * <p>
	 * Usually only required for <a href="https://www.chartjs.org/docs/latest/charts/mixed.html">mixed charts</a>
	 * </p>
	 */
	public T setType(final String type)
	{
		this.type = type;
		return this.self();
	}
	
	/**
	 * @return an unmodifiable view of the data held in this {@code Dataset}, never {@code null}
	 */
	public List<Object> getData()
	{
		return Collections.unmodifiableList(this.data);
	}
	
	/**
	 * @return an unmodifiable view of the data held in this {@code Dataset}, never {@code null}
	 */
	public <X> List<X> getData(final Class<X> filterClazz)
	{
		return this.data.stream()
			.filter(filterClazz::isInstance)
			.map(filterClazz::cast)
			.collect(Collectors.toUnmodifiableList());
	}
	
	/**
	 * @see #setData(Collection)
	 */
	public T setDataUnchecked(final Collection<?> data)
	{
		this.clearData();
		if(data != null)
		{
			this.data.addAll(data);
		}
		return this.self();
	}
	
	/**
	 * Sets the backing data list to the argument, replacing any data already added or set
	 *
	 * @param data The data to plot in a line
	 */
	public T setData(final Collection<O> data)
	{
		return this.setDataUnchecked(data);
	}
	
	/**
	 * @see #setData(Object[])
	 */
	public T setDataUnchecked(final Object... data)
	{
		return this.setDataUnchecked(Arrays.asList(data));
	}
	
	/**
	 * Sets the backing data list to the argument, replacing any data already added or set
	 *
	 * @param data The data to plot in a line
	 */
	@SuppressWarnings("unchecked") // Works fine
	public T setData(final O... data)
	{
		return this.setData(Arrays.asList(data));
	}
	
	/**
	 * Remove all data held by this {@code Dataset}
	 */
	public T clearData()
	{
		this.data.clear();
		return this.self();
	}
	
	/**
	 * @see #addData(Object)
	 */
	public T addDataUnchecked(final Object data)
	{
		this.data.add(data);
		return this.self();
	}
	
	/**
	 * Add the data point to this {@code Dataset}
	 *
	 * @param data a {@code O}, can be {@code null} to signify absence of data for a given point
	 * @see #setData(Collection)
	 */
	public T addData(final O data)
	{
		return this.addDataUnchecked(data);
	}
	
	public IndexAxis getIndexAxis()
	{
		return this.indexAxis;
	}
	
	public T setIndexAxis(final IndexAxis indexAxis)
	{
		this.indexAxis = indexAxis;
		return this.self();
	}
	
	public Object getClip()
	{
		return this.clip;
	}
	
	public T setClip(final Object clip)
	{
		this.clip = clip;
		return this.self();
	}
	
	public String getLabel()
	{
		return this.label;
	}
	
	public T setLabel(final String label)
	{
		this.label = label;
		return this.self();
	}
	
	public Number getOrder()
	{
		return this.order;
	}
	
	public T setOrder(final Number order)
	{
		this.order = order;
		return this.self();
	}
	
	public String getStack()
	{
		return this.stack;
	}
	
	public T setStack(final String stack)
	{
		this.stack = stack;
		return this.self();
	}
	
	public Boolean getHidden()
	{
		return this.hidden;
	}
	
	public T setHidden(final Boolean hidden)
	{
		this.hidden = hidden;
		return this.self();
	}
	
	@SuppressWarnings("unchecked")
	public T self()
	{
		return (T)this;
	}
}
