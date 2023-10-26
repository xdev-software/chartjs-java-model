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

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

import software.xdev.chartjs.model.javascript.JavaScriptFunction;


public class Legend
{
	protected Boolean display;
	protected Position position;
	protected Boolean fullWidth;
	protected JavaScriptFunction onClick;
	protected LegendLabels labels;
	
	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	/**
	 * Default {@code true}
	 * <p>
	 * Is the legend displayed
	 */
	public Legend setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	/**
	 * @see #setPosition(Legend.Position)
	 */
	public Position getPosition()
	{
		return this.position;
	}
	
	/**
	 * Default {@code 'top'}
	 * <p>
	 * Position of the legend. Options are 'top' or 'bottom'
	 */
	public Legend setPosition(final Legend.Position position)
	{
		this.position = position;
		return this;
	}
	
	/**
	 * @see #setFullWidth(Boolean)
	 */
	public Boolean getFullWidth()
	{
		return this.fullWidth;
	}
	
	/**
	 * Default {@code true}
	 * <p>
	 * Marks that this box should take the full width of the canvas (pushing down other boxes)
	 */
	public Legend setFullWidth(final Boolean fullWidth)
	{
		this.fullWidth = fullWidth;
		return this;
	}
	
	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnClick()
	{
		return this.onClick;
	}
	
	/**
	 * Default {@code function(event, legendItem) {}}
	 * <p>
	 * A callback that is called when a click is registered on top of a label item
	 */
	public Legend setOnClick(final JavaScriptFunction onClick)
	{
		this.onClick = onClick;
		return this;
	}
	
	/**
	 * @see #setLabels(LegendLabels)
	 */
	public LegendLabels getLabels()
	{
		return this.labels;
	}
	
	/**
	 * Default {@code -}
	 * <p>
	 * See the Legend Label Configuration section below.
	 */
	public Legend setLabels(final LegendLabels labels)
	{
		this.labels = labels;
		return this;
	}
	
	public enum Position
	{
		TOP,
		BOTTOM,
		LEFT,
		RIGHT;
		
		@Override
		@JsonValue
		public String toString()
		{
			return this.name().toLowerCase(Locale.ENGLISH);
		}
	}
}