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
	protected String align;
	protected Integer maxHeight;
	protected Integer maxWidth;
	protected Boolean fullSize;
	protected JavaScriptFunction onClick;
	protected JavaScriptFunction onHover;
	protected JavaScriptFunction onLeave;
	protected Boolean reverse;
	protected LegendLabels labels;
	protected Boolean rtl;
	protected String textDirection;
	protected LegendTitle title;
	
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
	 * @see #setAlign(String)
	 */
	public String getAlign()
	{
		return this.align;
	}
	
	/**
	 * Default 'center'.
	 * <p>
	 * Alignment of the legend
	 */
	public Legend setAlign(final String align)
	{
		this.align = align;
		return this;
	}
	
	/**
	 * @see #setMaxHeight(Integer)
	 */
	public Integer getMaxHeight()
	{
		return this.maxHeight;
	}
	
	/**
	 * Maximum height of the legend, in pixels
	 */
	public Legend setMaxHeight(final Integer maxHeight)
	{
		this.maxHeight = maxHeight;
		return this;
	}
	
	/**
	 * @see #setMaxWidth(Integer)
	 */
	public Integer getMaxWidth()
	{
		return this.maxWidth;
	}
	
	/**
	 * Maximum width of the legend, in pixels
	 */
	public Legend setMaxWidth(final Integer maxWidth)
	{
		this.maxWidth = maxWidth;
		return this;
	}
	
	/**
	 * @see #setFullSize(Boolean)
	 */
	public Boolean getFullSize()
	{
		return this.fullSize;
	}
	
	/**
	 * Default {@code true}
	 * <p>
	 * Marks that this box should take the full width of the canvas (pushing down other boxes)
	 */
	public Legend setFullSize(final Boolean fullSize)
	{
		this.fullSize = fullSize;
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
	 * A callback that is called when a click is registered on top of a label item
	 */
	public Legend setOnClick(final JavaScriptFunction onClick)
	{
		this.onClick = onClick;
		return this;
	}
	
	/**
	 * @see #setOnHover(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnHover()
	{
		return this.onHover;
	}
	
	/**
	 * A callback that is called when a 'mousemove' event is registered on top of a label item
	 */
	public Legend setOnHover(final JavaScriptFunction onHover)
	{
		this.onHover = onHover;
		return this;
	}
	
	/**
	 * @see #setOnLeave(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnLeave()
	{
		return this.onLeave;
	}
	
	/**
	 * A callback that is called when a 'mousemove' event is registered outside of a previously hovered label item
	 */
	public Legend setOnLeave(final JavaScriptFunction onLeave)
	{
		this.onLeave = onLeave;
		return this;
	}
	
	/**
	 * @see #setReverse(Boolean)
	 */
	public Boolean getReverse()
	{
		return this.reverse;
	}
	
	/**
	 * Default <code>false</code>
	 * <p>
	 * Legend will show datasets in reverse order
	 */
	public Legend setReverse(final Boolean reverse)
	{
		this.reverse = reverse;
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
	
	/**
	 * @see #setRtl(Boolean)
	 */
	public Boolean getRtl()
	{
		return this.rtl;
	}
	
	/**
	 * <code>true</code> for rendering the legends from right to left
	 */
	public Legend setRtl(final Boolean rtl)
	{
		this.rtl = rtl;
		return this;
	}
	
	/**
	 * @see #setTextDirection(String)
	 */
	public String getTextDirection()
	{
		return this.textDirection;
	}
	
	/**
	 * This will force the text direction 'rtl' or 'ltr' on the canvas for rendering the legend, regardless of the css
	 * specified on the canvas
	 */
	public Legend setTextDirection(final String textDirection)
	{
		this.textDirection = textDirection;
		return this;
	}
	
	/**
	 * @see #setTitle(LegendTitle)
	 */
	public LegendTitle getTitle()
	{
		return this.title;
	}
	
	/**
	 * @see LegendTitle
	 */
	public Legend setTitle(final LegendTitle title)
	{
		this.title = title;
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
