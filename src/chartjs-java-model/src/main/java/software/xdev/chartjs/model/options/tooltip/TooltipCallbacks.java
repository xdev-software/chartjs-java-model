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
package software.xdev.chartjs.model.options.tooltip;

import software.xdev.chartjs.model.javascript.JavaScriptFunction;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.8/src/types/index.d.ts#L2664">ChartJS Source<</a>
 */
public class TooltipCallbacks
{
	protected JavaScriptFunction beforeTitle;
	protected JavaScriptFunction title;
	protected JavaScriptFunction afterTitle;
	protected JavaScriptFunction beforeBody;
	protected JavaScriptFunction beforeLabel;
	protected JavaScriptFunction label;
	protected JavaScriptFunction labelColor;
	protected JavaScriptFunction labelTextColor;
	protected JavaScriptFunction labelPointStyle;
	protected JavaScriptFunction afterLabel;
	protected JavaScriptFunction afterBody;
	protected JavaScriptFunction beforeFooter;
	protected JavaScriptFunction footer;
	protected JavaScriptFunction afterFooter;
	
	public JavaScriptFunction getBeforeTitle()
	{
		return this.beforeTitle;
	}
	
	public TooltipCallbacks setBeforeTitle(final JavaScriptFunction beforeTitle)
	{
		this.beforeTitle = beforeTitle;
		return this;
	}
	
	public JavaScriptFunction getTitle()
	{
		return this.title;
	}
	
	public TooltipCallbacks setTitle(final JavaScriptFunction title)
	{
		this.title = title;
		return this;
	}
	
	public JavaScriptFunction getAfterTitle()
	{
		return this.afterTitle;
	}
	
	public TooltipCallbacks setAfterTitle(final JavaScriptFunction afterTitle)
	{
		this.afterTitle = afterTitle;
		return this;
	}
	
	public JavaScriptFunction getBeforeBody()
	{
		return this.beforeBody;
	}
	
	public TooltipCallbacks setBeforeBody(final JavaScriptFunction beforeBody)
	{
		this.beforeBody = beforeBody;
		return this;
	}
	
	public JavaScriptFunction getBeforeLabel()
	{
		return this.beforeLabel;
	}
	
	public TooltipCallbacks setBeforeLabel(final JavaScriptFunction beforeLabel)
	{
		this.beforeLabel = beforeLabel;
		return this;
	}
	
	public JavaScriptFunction getLabel()
	{
		return this.label;
	}
	
	public TooltipCallbacks setLabel(final JavaScriptFunction label)
	{
		this.label = label;
		return this;
	}
	
	public JavaScriptFunction getLabelColor()
	{
		return this.labelColor;
	}
	
	public TooltipCallbacks setLabelColor(final JavaScriptFunction labelColor)
	{
		this.labelColor = labelColor;
		return this;
	}
	
	public JavaScriptFunction getLabelTextColor()
	{
		return this.labelTextColor;
	}
	
	public TooltipCallbacks setLabelTextColor(final JavaScriptFunction labelTextColor)
	{
		this.labelTextColor = labelTextColor;
		return this;
	}
	
	public JavaScriptFunction getLabelPointStyle()
	{
		return this.labelPointStyle;
	}
	
	public TooltipCallbacks setLabelPointStyle(final JavaScriptFunction labelPointStyle)
	{
		this.labelPointStyle = labelPointStyle;
		return this;
	}
	
	public JavaScriptFunction getAfterLabel()
	{
		return this.afterLabel;
	}
	
	public TooltipCallbacks setAfterLabel(final JavaScriptFunction afterLabel)
	{
		this.afterLabel = afterLabel;
		return this;
	}
	
	public JavaScriptFunction getAfterBody()
	{
		return this.afterBody;
	}
	
	public TooltipCallbacks setAfterBody(final JavaScriptFunction afterBody)
	{
		this.afterBody = afterBody;
		return this;
	}
	
	public JavaScriptFunction getBeforeFooter()
	{
		return this.beforeFooter;
	}
	
	public TooltipCallbacks setBeforeFooter(final JavaScriptFunction beforeFooter)
	{
		this.beforeFooter = beforeFooter;
		return this;
	}
	
	public JavaScriptFunction getFooter()
	{
		return this.footer;
	}
	
	public TooltipCallbacks setFooter(final JavaScriptFunction footer)
	{
		this.footer = footer;
		return this;
	}
	
	public JavaScriptFunction getAfterFooter()
	{
		return this.afterFooter;
	}
	
	public TooltipCallbacks setAfterFooter(final JavaScriptFunction afterFooter)
	{
		this.afterFooter = afterFooter;
		return this;
	}
}
