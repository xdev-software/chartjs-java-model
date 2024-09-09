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

import software.xdev.chartjs.model.javascript.JavaScriptFunction;


public class Callbacks
{
	protected JavaScriptFunction beforeTitle;
	protected JavaScriptFunction title;
	protected JavaScriptFunction afterTitle;
	protected JavaScriptFunction beforeBody;
	protected JavaScriptFunction beforeLabel;
	protected JavaScriptFunction label;
	protected JavaScriptFunction labelColor;
	protected JavaScriptFunction labelTextColor;
	protected JavaScriptFunction afterLabel;
	protected JavaScriptFunction afterBody;
	protected JavaScriptFunction beforeFooter;
	protected JavaScriptFunction footer;
	protected JavaScriptFunction afterFooter;
	
	/**
	 * @see #setBeforeTitle(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeTitle()
	{
		return this.beforeTitle;
	}
	
	/**
	 * <p>
	 * Returns the text to render before the title.
	 * </p>
	 */
	public Callbacks setBeforeTitle(final JavaScriptFunction beforeTitle)
	{
		this.beforeTitle = beforeTitle;
		return this;
	}
	
	/**
	 * @see #setTitle(JavaScriptFunction)
	 */
	public JavaScriptFunction getTitle()
	{
		return this.title;
	}
	
	/**
	 * <p>
	 * Returns text to render as the title of the tooltip.
	 * </p>
	 */
	public Callbacks setTitle(final JavaScriptFunction title)
	{
		this.title = title;
		return this;
	}
	
	/**
	 * @see #setAfterTitle(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterTitle()
	{
		return this.afterTitle;
	}
	
	/**
	 * <p>
	 * Returns text to render after the title.
	 * </p>
	 */
	public Callbacks setAfterTitle(final JavaScriptFunction afterTitle)
	{
		this.afterTitle = afterTitle;
		return this;
	}
	
	/**
	 * @see #setBeforeBody(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeBody()
	{
		return this.beforeBody;
	}
	
	/**
	 * <p>
	 * Returns text to render before the body section.
	 * </p>
	 */
	public Callbacks setBeforeBody(final JavaScriptFunction beforeBody)
	{
		this.beforeBody = beforeBody;
		return this;
	}
	
	/**
	 * @see #setBeforeLabel(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeLabel()
	{
		return this.beforeLabel;
	}
	
	/**
	 * <p>
	 * Returns text to render before an individual label. This will be called for each item in the tooltip.
	 * </p>
	 */
	public Callbacks setBeforeLabel(final JavaScriptFunction beforeLabel)
	{
		this.beforeLabel = beforeLabel;
		return this;
	}
	
	/**
	 * @see #setLabel(JavaScriptFunction)
	 */
	public JavaScriptFunction getLabel()
	{
		return this.label;
	}
	
	/**
	 * <p>
	 * Returns text to render for an individual item in the tooltip.
	 * </p>
	 */
	public Callbacks setLabel(final JavaScriptFunction label)
	{
		this.label = label;
		return this;
	}
	
	/**
	 * @see #setLabelColor(JavaScriptFunction)
	 */
	public JavaScriptFunction getLabelColor()
	{
		return this.labelColor;
	}
	
	/**
	 * <p>
	 * Returns the colors to render for the tooltip item.
	 * </p>
	 */
	public Callbacks setLabelColor(final JavaScriptFunction labelColor)
	{
		this.labelColor = labelColor;
		return this;
	}
	
	/**
	 * @see #setLabelTextColor(JavaScriptFunction)
	 */
	public JavaScriptFunction getLabelTextColor()
	{
		return this.labelTextColor;
	}
	
	/**
	 * <p>
	 * Returns the colors for the text of the label for the tooltip item.
	 * </p>
	 */
	public Callbacks setLabelTextColor(final JavaScriptFunction labelTextColor)
	{
		this.labelTextColor = labelTextColor;
		return this;
	}
	
	/**
	 * @see #setAfterLabel(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterLabel()
	{
		return this.afterLabel;
	}
	
	/**
	 * <p>
	 * Returns text to render after an individual label.
	 * </p>
	 */
	public Callbacks setAfterLabel(final JavaScriptFunction afterLabel)
	{
		this.afterLabel = afterLabel;
		return this;
	}
	
	/**
	 * @see #setAfterBody(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterBody()
	{
		return this.afterBody;
	}
	
	/**
	 * <p>
	 * Returns text to render after the body section.
	 * </p>
	 */
	public Callbacks setAfterBody(final JavaScriptFunction afterBody)
	{
		this.afterBody = afterBody;
		return this;
	}
	
	/**
	 * @see #setBeforeFooter(JavaScriptFunction)
	 */
	public JavaScriptFunction getBeforeFooter()
	{
		return this.beforeFooter;
	}
	
	/**
	 * <p>
	 * Returns text to render before the footer section.
	 * </p>
	 */
	public Callbacks setBeforeFooter(final JavaScriptFunction beforeFooter)
	{
		this.beforeFooter = beforeFooter;
		return this;
	}
	
	/**
	 * @see #setFooter(JavaScriptFunction)
	 */
	public JavaScriptFunction getFooter()
	{
		return this.footer;
	}
	
	/**
	 * <p>
	 * Returns text to render as the footer of the tooltip.
	 * </p>
	 */
	public Callbacks setFooter(final JavaScriptFunction footer)
	{
		this.footer = footer;
		return this;
	}
	
	/**
	 * @see #setAfterFooter(JavaScriptFunction)
	 */
	public JavaScriptFunction getAfterFooter()
	{
		return this.afterFooter;
	}
	
	/**
	 * <p>
	 * Text to render after the footer section.
	 * </p>
	 */
	public Callbacks setAfterFooter(final JavaScriptFunction afterFooter)
	{
		this.afterFooter = afterFooter;
		return this;
	}
}
