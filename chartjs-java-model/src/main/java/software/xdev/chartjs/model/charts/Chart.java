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

import com.fasterxml.jackson.annotation.JsonProperty;

import software.xdev.chartjs.model.data.Data;
import software.xdev.chartjs.model.options.Options;


@SuppressWarnings("java:S119") // SELF means the Chart itself... Not a problem
public interface Chart<SELF, O extends Options<O, ?>, D extends Data<D, ?>>
{
	/**
	 * @return type of this {@link Chart} implementation for proper drawing in JavaScript.
	 */
	@JsonProperty("type")
	String getType();
	
	/**
	 * <p>
	 * Convert {@code this} instance to Json for use with Chart.js library.
	 * </p>
	 *
	 * @return json representation of {@code this} {@link Chart}
	 */
	String toJsonNative();
	
	/**
	 * Same as {@link #toJsonNative()} but also check if the diagram {@link #isDrawable() is drawable}
	 * @see #toJson()
	 */
	default String toJson()
	{
		if(!this.isDrawable())
		{
			throw new IllegalArgumentException("Chart is not drawable");
		}
		return this.toJsonNative();
	}
	
	/**
	 * <p>
	 * Optional check to determine whether the current state of this {@link Chart} implementation instance will
	 * generate
	 * a drawable JSON string.
	 * </p>
	 * <p>
	 * Implementations provide a best-effort evaluation, and can not guarantee that the serialized chart will be
	 * rendered correctly.
	 * </p>
	 *
	 * @return true if {@code this} {@link Chart} is drawable in its current state
	 */
	boolean isDrawable();
	
	SELF setOptions(final O options);
	
	SELF setData(final D data);
}
