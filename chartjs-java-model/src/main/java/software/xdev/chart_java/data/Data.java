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
package software.xdev.chart_java.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import software.xdev.chart_java.dataset.Dataset;

public class Data<D extends Data<D, T, O>, T extends Dataset<T, O>, O>
{

	private final List<String> labels = new ArrayList<>();
	private final List<T> datasets = new ArrayList<>();

	/**
	 * @return unmodifiable list of all labels, never {@code null}
	 */
	public List<String> getLabels() {
		return Collections.unmodifiableList(this.labels);
	}

	/**
	 * Sets the backing label list, replacing any labels previously added or set
	 * 
	 * @param labels
	 * @return this object to allow method chaining
	 */
	public D setLabels(final Collection<String> labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(labels);
		}
		return this.self();
	}

	/**
	 * Sets the backing label list, replacing any labels previously added or set
	 * 
	 * @param labels
	 * @return this object to allow method chaining
	 */
	public D setLabels(final String... labels) {
		this.labels.clear();
		if (labels != null) {
			this.labels.addAll(Arrays.asList(labels));
		}
		return this.self();
	}

	/**
	 * Removes all labels from the backing list
	 * 
	 * @return this object to allow method chaining
	 */
	public D clearLabels() {
		this.labels.clear();
		return this.self();
	}

	/**
	 * Adds the label to the backing label list
	 * 
	 * @return this object to allow method chaining
	 */
	public D addLabel(final String label) {
		this.labels.add(label);
		return this.self();
	}

	/**
	 * Adds the labels to the backing label list
	 * 
	 * @return this object to allow method chaining
	 */
	public D addLabels(final String... label) {
		this.labels.addAll(Arrays.asList(label));
		return this.self();
	}
	
	/**
	 * @return unmodifiable list of all datasets, never
	 *         {@code null}
	 */
	public List<T> getDatasets() {
		return Collections.unmodifiableList(this.datasets);
	}

	/**
	 * @return this object to allow method chaining
	 */
	public D setDatasets(final Collection<T> datasets) {
		this.datasets.clear();
		if (datasets != null) {
			this.datasets.addAll(datasets);
		}
		return this.self();
	}

	/**
	 * @return this object to allow method chaining
	 */
	public D addDataset(final T dataset) {
		this.datasets.add(dataset);
		return this.self();
	}
	
	@SuppressWarnings("unchecked")
	protected D self()
	{
		return (D)this;
	}
}
