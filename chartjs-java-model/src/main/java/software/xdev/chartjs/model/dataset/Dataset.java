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


public abstract class Dataset<T extends Dataset<T, O>, O>
{
	protected final List<O> data = new ArrayList<>();
	
	/**
	 * @return an unmodifiable view of the data held in this {@code Dataset}, never {@code null}
	 */
	public List<O> getData()
	{
		return Collections.unmodifiableList(this.data);
	}
	
	/**
	 * Sets the backing data list to the argument, replacing any data already added or set
	 *
	 * @param data The data to plot in a line
	 */
	public T setData(final Collection<O> data)
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
	public T setData(final O... data)
	{
		this.clearData();
		if(data != null)
		{
			this.data.addAll(Arrays.asList(data));
		}
		return this.self();
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
	 * Add the data point to this {@code Dataset}
	 *
	 * @param data a {@code O}, can be {@code null} to signify absence of data for a given point
	 * @see #setData(Collection)
	 */
	public T addData(final O data)
	{
		this.data.add(data);
		return this.self();
	}
	
	@SuppressWarnings("unchecked")
	public T self()
	{
		return (T)this;
	}
}
