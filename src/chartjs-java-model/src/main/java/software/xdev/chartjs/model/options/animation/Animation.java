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
package software.xdev.chartjs.model.options.animation;

import software.xdev.chartjs.model.enums.Easing;
import software.xdev.chartjs.model.javascript.JavaScriptFunction;


public class Animation<T extends Animation<?>>
{
	protected Integer duration;
	
	protected Easing easing;
	
	protected Active active;
	
	protected Resize resize;
	
	/**
	 * @see #setOnProgress(JavaScriptFunction onProgress)
	 */
	protected JavaScriptFunction onProgress;
	
	/**
	 * @see #setOnComplete(JavaScriptFunction onComplete)
	 */
	protected JavaScriptFunction onComplete;
	
	/**
	 * @return duration as {@link Integer} or {@code null}
	 * @see #setDuration(Integer)
	 */
	public Integer getDuration()
	{
		return this.duration;
	}
	
	/**
	 * <p>
	 * Default {@code 1000}
	 * </p>
	 *
	 * <p>
	 * The number of milliseconds an animation takes.
	 * </p>
	 */
	public T setDuration(final Integer duration)
	{
		this.duration = duration;
		return this.self();
	}
	
	/**
	 * @return {@link Easing} or {@code null}
	 * @see #setEasing(Easing)
	 */
	public Easing getEasing()
	{
		return this.easing;
	}
	
	/**
	 * <p>
	 * Default {@link Easing#EASE_OUT_QUART}
	 * </p>
	 *
	 * <p>
	 * Easing function to use.
	 * </p>
	 *
	 * <p>
	 * Easing functions adapted from Robert Penner's easing equations http://www.robertpenner.com/easing/
	 * </p>
	 */
	public T setEasing(final Easing easing)
	{
		this.easing = easing;
		return this.self();
	}
	
	public Active getActive()
	{
		return this.active;
	}
	
	public T setActive(final Active active)
	{
		this.active = active;
		return this.self();
	}
	
	public Resize getResize()
	{
		return this.resize;
	}
	
	public void setResize(final Resize resize)
	{
		this.resize = resize;
	}
	
	/**
	 * @return {@link JavaScriptFunction} or {@code null}
	 * @see #setOnProgress(JavaScriptFunction onProgress)
	 */
	public JavaScriptFunction getOnProgress()
	{
		return this.onProgress;
	}
	
	/**
	 * <p>
	 * Default {@code none}
	 * </p>
	 *
	 * <p>
	 * Callback called on each step of an animation. Passed a single argument, an object, containing the chart instance
	 * and an object with details of the animation.
	 * </p>
	 */
	public T setOnProgress(final JavaScriptFunction onProgress)
	{
		this.onProgress = onProgress;
		return this.self();
	}
	
	/**
	 * @return {@link JavaScriptFunction} or {@code null}
	 * @see #setOnComplete(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnComplete()
	{
		return this.onComplete;
	}
	
	/**
	 * <p>
	 * Default {@code none}
	 * </p>
	 *
	 * <p>
	 * Callback called at the end of an animation. Passed the same arguments as onProgress
	 * </p>
	 */
	public T setOnComplete(final JavaScriptFunction onComplete)
	{
		this.onComplete = onComplete;
		return this.self();
	}
	
	@SuppressWarnings("unchecked")
	protected T self()
	{
		return (T)this;
	}
}
