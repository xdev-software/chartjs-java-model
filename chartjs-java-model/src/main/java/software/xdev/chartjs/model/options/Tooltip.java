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

import software.xdev.chartjs.model.enums.FontStyle;
import software.xdev.chartjs.model.javascript.JavaScriptFunction;


public class Tooltip
{
	protected Boolean enabled;
	protected JavaScriptFunction external;
	protected String mode;
	protected JavaScriptFunction itemSort;
	protected Object backgroundColor;
	protected String titleFontFamily;
	protected Integer titleFontSize;
	protected FontStyle titleFontStyle;
	protected Object titleFontColor;
	protected Integer titleSpacing;
	protected Integer titleMarginBottom;
	protected String bodyFontFamily;
	protected Integer bodyFontSize;
	protected FontStyle bodyFontStyle;
	protected Object bodyFontColor;
	protected Integer bodySpacing;
	protected String footerFontFamily;
	protected Integer footerFontSize;
	protected FontStyle footerFontStyle;
	protected Object footerFontColor;
	protected Integer footerSpacing;
	protected Integer footerMarginTop;
	protected Integer xPadding;
	protected Integer yPadding;
	protected Integer caretSize;
	protected Integer cornerRadius;
	protected Object multiKeyBackground;
	protected Callbacks callbacks;
	
	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled()
	{
		return this.enabled;
	}
	
	/**
	 * <p>
	 * Are tooltips enabled
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public Tooltip setEnabled(final Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}
	
	/**
	 * @see #setExternal(JavaScriptFunction)
	 */
	public JavaScriptFunction getExternal()
	{
		return this.external;
	}
	
	/**
	 * <p>
	 * See section below
	 * </p>
	 *
	 * <p>
	 * Default {@code null}
	 * </p>
	 */
	public Tooltip setExternal(final JavaScriptFunction external)
	{
		this.external = external;
		return this;
	}
	
	/**
	 * @see #setMode(String)
	 */
	public String getMode()
	{
		return this.mode;
	}
	
	/**
	 * <p>
	 * Sets which elements appear in the tooltip. Acceptable options are 'single', 'label' or 'x-axis'.  single
	 * highlights the closest element.  label highlights elements in all datasets at the same X value.  'x-axis' also
	 * highlights elements in all datasets at the same X value, but activates when hovering anywhere within the
	 * vertical
	 * slice of the x-axis representing that X value.
	 * </p>
	 *
	 * <p>
	 * Default {@code 'single'}
	 * </p>
	 */
	public Tooltip setMode(final String mode)
	{
		this.mode = mode;
		return this;
	}
	
	/**
	 * @see #setItemSort(JavaScriptFunction)
	 */
	public JavaScriptFunction getItemSort()
	{
		return this.itemSort;
	}
	
	/**
	 * <p>
	 * Allows sorting of tooltip items. Must implement a function that can be passed to Array.prototype.sort
	 * </p>
	 *
	 * <p>
	 * Default {@code undefined}
	 * </p>
	 */
	public Tooltip setItemSort(final JavaScriptFunction itemSort)
	{
		this.itemSort = itemSort;
		return this;
	}
	
	/**
	 * @see #setBackgroundColor(Object)
	 */
	public Object getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	/**
	 * <p>
	 * Background color of the tooltip
	 * </p>
	 *
	 * <p>
	 * Default {@code 'rgba(0,0,0,0.8)'}
	 * </p>
	 */
	public Tooltip setBackgroundColor(final Object backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}
	
	/**
	 * @see #setTitleFontFamily(String)
	 */
	public String getTitleFontFamily()
	{
		return this.titleFontFamily;
	}
	
	/**
	 * <p>
	 * Font family for tooltip title inherited from global font family
	 * </p>
	 *
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public Tooltip setTitleFontFamily(final String titleFontFamily)
	{
		this.titleFontFamily = titleFontFamily;
		return this;
	}
	
	/**
	 * @see #setTitleFontSize(Integer)
	 */
	public Integer getTitleFontSize()
	{
		return this.titleFontSize;
	}
	
	/**
	 * <p>
	 * Font size for tooltip title inherited from global font size
	 * </p>
	 *
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public Tooltip setTitleFontSize(final Integer titleFontSize)
	{
		this.titleFontSize = titleFontSize;
		return this;
	}
	
	/**
	 * @see #setTitleFontStyle(FontStyle)
	 */
	public FontStyle getTitleFontStyle()
	{
		return this.titleFontStyle;
	}
	
	/**
	 * <p>
	 *
	 * </p>
	 *
	 * <p>
	 * Default {@code "bold"}
	 * </p>
	 */
	public Tooltip setTitleFontStyle(final FontStyle titleFontStyle)
	{
		this.titleFontStyle = titleFontStyle;
		return this;
	}
	
	/**
	 * @see #setTitleFontColor(Object)
	 */
	public Object getTitleFontColor()
	{
		return this.titleFontColor;
	}
	
	/**
	 * <p>
	 * Font color for tooltip title
	 * </p>
	 *
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public Tooltip setTitleFontColor(final Object titleFontColor)
	{
		this.titleFontColor = titleFontColor;
		return this;
	}
	
	/**
	 * @see #setTitleSpacing(Integer)
	 */
	public Integer getTitleSpacing()
	{
		return this.titleSpacing;
	}
	
	/**
	 * <p>
	 * Spacing to add to top and bottom of each title line.
	 * </p>
	 *
	 * <p>
	 * Default {@code 2}
	 * </p>
	 */
	public Tooltip setTitleSpacing(final Integer titleSpacing)
	{
		this.titleSpacing = titleSpacing;
		return this;
	}
	
	/**
	 * @see #setTitleMarginBottom(Integer)
	 */
	public Integer getTitleMarginBottom()
	{
		return this.titleMarginBottom;
	}
	
	/**
	 * <p>
	 * Margin to add on bottom of title section
	 * </p>
	 *
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public Tooltip setTitleMarginBottom(final Integer titleMarginBottom)
	{
		this.titleMarginBottom = titleMarginBottom;
		return this;
	}
	
	/**
	 * @see #setBodyFontFamily(String)
	 */
	public String getBodyFontFamily()
	{
		return this.bodyFontFamily;
	}
	
	/**
	 * <p>
	 * Font family for tooltip items inherited from global font family
	 * </p>
	 *
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public Tooltip setBodyFontFamily(final String bodyFontFamily)
	{
		this.bodyFontFamily = bodyFontFamily;
		return this;
	}
	
	/**
	 * @see #setBodyFontSize(Integer)
	 */
	public Integer getBodyFontSize()
	{
		return this.bodyFontSize;
	}
	
	/**
	 * <p>
	 * Font size for tooltip items inherited from global font size
	 * </p>
	 *
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public Tooltip setBodyFontSize(final Integer bodyFontSize)
	{
		this.bodyFontSize = bodyFontSize;
		return this;
	}
	
	/**
	 * @see #setBodyFontStyle(FontStyle)
	 */
	public FontStyle getBodyFontStyle()
	{
		return this.bodyFontStyle;
	}
	
	/**
	 * <p>
	 *
	 * </p>
	 *
	 * <p>
	 * Default {@code "normal"}
	 * </p>
	 */
	public Tooltip setBodyFontStyle(final FontStyle bodyFontStyle)
	{
		this.bodyFontStyle = bodyFontStyle;
		return this;
	}
	
	/**
	 * @see #setBodyFontColor(Object)
	 */
	public Object getBodyFontColor()
	{
		return this.bodyFontColor;
	}
	
	/**
	 * <p>
	 * Font color for tooltip items.
	 * </p>
	 *
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public Tooltip setBodyFontColor(final Object bodyFontColor)
	{
		this.bodyFontColor = bodyFontColor;
		return this;
	}
	
	/**
	 * @see #setBodySpacing(Integer)
	 */
	public Integer getBodySpacing()
	{
		return this.bodySpacing;
	}
	
	/**
	 * <p>
	 * Spacing to add to top and bottom of each tooltip item
	 * </p>
	 *
	 * <p>
	 * Default {@code 2}
	 * </p>
	 */
	public Tooltip setBodySpacing(final Integer bodySpacing)
	{
		this.bodySpacing = bodySpacing;
		return this;
	}
	
	/**
	 * @see #setFooterFontFamily(String)
	 */
	public String getFooterFontFamily()
	{
		return this.footerFontFamily;
	}
	
	/**
	 * <p>
	 * Font family for tooltip footer inherited from global font family.
	 * </p>
	 *
	 * <p>
	 * Default {@code "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"}
	 * </p>
	 */
	public Tooltip setFooterFontFamily(final String footerFontFamily)
	{
		this.footerFontFamily = footerFontFamily;
		return this;
	}
	
	/**
	 * @see #setFooterFontSize(Integer)
	 */
	public Integer getFooterFontSize()
	{
		return this.footerFontSize;
	}
	
	/**
	 * <p>
	 * Font size for tooltip footer inherited from global font size.
	 * </p>
	 *
	 * <p>
	 * Default {@code 12}
	 * </p>
	 */
	public Tooltip setFooterFontSize(final Integer footerFontSize)
	{
		this.footerFontSize = footerFontSize;
		return this;
	}
	
	/**
	 * @see #setFooterFontStyle(FontStyle)
	 */
	public FontStyle getFooterFontStyle()
	{
		return this.footerFontStyle;
	}
	
	/**
	 * <p>
	 * Font style for tooltip footer.
	 * </p>
	 *
	 * <p>
	 * Default {@code "bold"}
	 * </p>
	 */
	public Tooltip setFooterFontStyle(final FontStyle footerFontStyle)
	{
		this.footerFontStyle = footerFontStyle;
		return this;
	}
	
	/**
	 * @see #setFooterFontColor(Object)
	 */
	public Object getFooterFontColor()
	{
		return this.footerFontColor;
	}
	
	/**
	 * <p>
	 * Font color for tooltip footer.
	 * </p>
	 *
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public Tooltip setFooterFontColor(final Object footerFontColor)
	{
		this.footerFontColor = footerFontColor;
		return this;
	}
	
	/**
	 * @see #setFooterSpacing(Integer)
	 */
	public Integer getFooterSpacing()
	{
		return this.footerSpacing;
	}
	
	/**
	 * <p>
	 * Spacing to add to top and bottom of each footer line.
	 * </p>
	 *
	 * <p>
	 * Default {@code 2}
	 * </p>
	 */
	public Tooltip setFooterSpacing(final Integer footerSpacing)
	{
		this.footerSpacing = footerSpacing;
		return this;
	}
	
	/**
	 * @see #setFooterMarginTop(Integer)
	 */
	public Integer getFooterMarginTop()
	{
		return this.footerMarginTop;
	}
	
	/**
	 * <p>
	 * Margin to add before drawing the footer
	 * </p>
	 *
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public Tooltip setFooterMarginTop(final Integer footerMarginTop)
	{
		this.footerMarginTop = footerMarginTop;
		return this;
	}
	
	/**
	 * @see #setXPadding(Integer)
	 */
	public Integer getXPadding()
	{
		return this.xPadding;
	}
	
	/**
	 * <p>
	 * Padding to add on left and right of tooltip
	 * </p>
	 *
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public Tooltip setXPadding(final Integer xPadding)
	{
		this.xPadding = xPadding;
		return this;
	}
	
	/**
	 * @see #setYPadding(Integer)
	 */
	public Integer getYPadding()
	{
		return this.yPadding;
	}
	
	/**
	 * <p>
	 * Padding to add on top and bottom of tooltip
	 * </p>
	 *
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public Tooltip setYPadding(final Integer yPadding)
	{
		this.yPadding = yPadding;
		return this;
	}
	
	/**
	 * @see #setCaretSize(Integer)
	 */
	public Integer getCaretSize()
	{
		return this.caretSize;
	}
	
	/**
	 * <p>
	 * Size, in px, of the tooltip arrow
	 * </p>
	 *
	 * <p>
	 * Default {@code 5}
	 * </p>
	 */
	public Tooltip setCaretSize(final Integer caretSize)
	{
		this.caretSize = caretSize;
		return this;
	}
	
	/**
	 * @see #setCornerRadius(Integer)
	 */
	public Integer getCornerRadius()
	{
		return this.cornerRadius;
	}
	
	/**
	 * <p>
	 * Radius of tooltip corner curves
	 * </p>
	 *
	 * <p>
	 * Default {@code 6}
	 * </p>
	 */
	public Tooltip setCornerRadius(final Integer cornerRadius)
	{
		this.cornerRadius = cornerRadius;
		return this;
	}
	
	/**
	 * @see #setMultiKeyBackground(Object)
	 */
	public Object getMultiKeyBackground()
	{
		return this.multiKeyBackground;
	}
	
	/**
	 * <p>
	 * Color to draw behind the colored boxes when multiple items are in the tooltip
	 * </p>
	 *
	 * <p>
	 * Default {@code "#fff"}
	 * </p>
	 */
	public Tooltip setMultiKeyBackground(final Object multiKeyBackground)
	{
		this.multiKeyBackground = multiKeyBackground;
		return this;
	}
	
	/**
	 * @see #setCallbacks(Callbacks)
	 */
	public Callbacks getCallbacks()
	{
		return this.callbacks;
	}
	
	/**
	 * <p>
	 * See the callbacks section below
	 * </p>
	 *
	 * <p>
	 * Default {@code }
	 * </p>
	 */
	public Tooltip setCallbacks(final Callbacks callbacks)
	{
		this.callbacks = callbacks;
		return this;
	}
}
