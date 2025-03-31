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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import software.xdev.chartjs.model.enums.IndexAxis;
import software.xdev.chartjs.model.javascript.JavaScriptFunction;
import software.xdev.chartjs.model.options.animation.Animation;
import software.xdev.chartjs.model.options.animation.Animations;
import software.xdev.chartjs.model.options.layout.Layout;
import software.xdev.chartjs.model.options.scale.Scales;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.7/src/types/index.d.ts#L1588">
 *     ChartJS Source (Options)</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.7/src/types/index.d.ts#L1756">
 *     ChartJS Source (AnimationOptons)</a>
 */
public class Options<T extends Options<T, A>, A extends Animation<A>>
{
	protected final Set<String> events = new HashSet<>();
	protected IndexAxis indexAxis;
	protected Boolean responsive;
	protected Integer responsiveAnimationDuration;
	protected Boolean maintainAspectRatio;
	protected JavaScriptFunction onClick;
	protected JavaScriptFunction legendCallback;
	protected JavaScriptFunction onResize;
	protected CoreInteractionOptions interaction;
	protected CoreInteractionOptions hover;
	protected Animations<A> animations;
	protected Object animation; // Usually a boolean or of Type <A>
	protected Layout layout;
	protected Plugins plugins = new Plugins();
	
	protected Scales scales = new Scales();
	
	
	public Scales getScales()
	{
		return this.scales;
	}
	
	public T setScales(final Scales scales)
	{
		this.scales = scales;
		return this.self();
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
	
	/**
	 * @see #setResponsive(Boolean)
	 */
	public Boolean getResponsive()
	{
		return this.responsive;
	}
	
	/**
	 * Default {@code true} Resizes when the canvas container does.
	 */
	public T setResponsive(final Boolean responsive)
	{
		this.responsive = responsive;
		return this.self();
	}
	
	public Object getAnimation()
	{
		return this.animation;
	}
	
	public T setAnimation(final Object animation)
	{
		this.animation = animation;
		return this.self();
	}
	
	/**
	 * @see #setResponsiveAnimationDuration(Integer)
	 */
	public Integer getResponsiveAnimationDuration()
	{
		return this.responsiveAnimationDuration;
	}
	
	/**
	 * Default {@code 0} Duration in milliseconds it takes to animate to new size after a resize event.
	 */
	public T setResponsiveAnimationDuration(final Integer responsiveAnimationDuration)
	{
		this.responsiveAnimationDuration = responsiveAnimationDuration;
		return this.self();
	}
	
	/**
	 * @see #setMaintainAspectRatio(Boolean)
	 */
	public Boolean getMaintainAspectRatio()
	{
		return this.maintainAspectRatio;
	}
	
	/**
	 * Default {@code true} Maintain the original canvas aspect ratio (width / height) when resizing
	 */
	public T setMaintainAspectRatio(final Boolean maintainAspectRatio)
	{
		this.maintainAspectRatio = maintainAspectRatio;
		return this.self();
	}
	
	/**
	 * @see #setEvents(Collection)
	 */
	public Set<String> getEvents()
	{
		return this.events;
	}
	
	/**
	 * Default {@code ["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]} Events that the chart
	 * should listen to for tooltips and hovering
	 */
	public T setEvents(final Collection<String> events)
	{
		this.events.clear();
		if(events != null)
		{
			this.events.addAll(events);
		}
		return this.self();
	}
	
	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnClick()
	{
		return this.onClick;
	}
	
	/**
	 * Default {@code null} Called if the event is of type 'mouseup' or 'click'. Called in the context of the chart and
	 * passed an array of active arcElements
	 */
	public T setOnClick(final JavaScriptFunction onClick)
	{
		this.onClick = onClick;
		return this.self();
	}
	
	/**
	 * @see #setLegendCallback(JavaScriptFunction)
	 */
	public JavaScriptFunction getLegendCallback()
	{
		return this.legendCallback;
	}
	
	/**
	 * Default {@code function (chart) { }} Function to generate a legend. Receives the chart object to generate a
	 * legend from. Default implementation returns an HTML string.
	 */
	public T setLegendCallback(final JavaScriptFunction legendCallback)
	{
		this.legendCallback = legendCallback;
		return this.self();
	}
	
	/**
	 * @see #setOnResize(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnResize()
	{
		return this.onResize;
	}
	
	/**
	 * Default {@code null} Called when a resize occurs. Gets passed two arguemnts: the chart instance and the new
	 * size.
	 */
	public T setOnResize(final JavaScriptFunction onResize)
	{
		this.onResize = onResize;
		return this.self();
	}
	
	public CoreInteractionOptions getInteraction()
	{
		return this.interaction;
	}
	
	public T setInteraction(final CoreInteractionOptions interaction)
	{
		this.interaction = interaction;
		return this.self();
	}
	
	public CoreInteractionOptions getHover()
	{
		return this.hover;
	}
	
	/**
	 * The hover configuration is passed into the options.hover namespace. The global hover configuration is at
	 * Chart.defaults.global.hover.
	 */
	public T setHover(final CoreInteractionOptions hover)
	{
		this.hover = hover;
		return this.self();
	}
	
	/**
	 * @see #setAnimations(Animations)
	 */
	public Animations<A> getAnimations()
	{
		return this.animations;
	}
	
	/**
	 * The following animation options are available. The global options for are defined in
	 * Chart.defaults.global.animation.
	 */
	public T setAnimations(final Animations<A> animations)
	{
		this.animations = animations;
		return this.self();
	}
	
	/**
	 * @return {@link Layout} instance or {@code null}
	 */
	public Layout getLayout()
	{
		return this.layout;
	}
	
	/**
	 * @param layout {@link Layout} instance or {@code null}
	 * @return {@code this} instance for chaining
	 */
	public T setLayout(final Layout layout)
	{
		this.layout = layout;
		return this.self();
	}
	
	/**
	 * @see #setPlugins(Plugins)
	 */
	public Plugins getPlugins()
	{
		return this.plugins;
	}
	
	/**
	 * A placeholder in which configuration options for plugins may be passed.
	 *
	 * @param plugins {@link Object} or {@code null}
	 * @return {@code this} instance for chaining
	 */
	public T setPlugins(final Plugins plugins)
	{
		this.plugins = plugins;
		return this.self();
	}
	
	@SuppressWarnings("unchecked")
	protected T self()
	{
		return (T)this;
	}
}
