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
package software.xdev.chartjs.model.options.plugins.zoom;

public class ZoomOptions
{
	protected WheelOptions wheel;
	protected DragOptions drag;
	protected PinchOptions pinch;
	protected String mode;
	protected String scaleMode;
	protected String overScaleMode;
	
	public WheelOptions getWheel()
	{
		return wheel;
	}
	
	public ZoomOptions setWheel(final WheelOptions wheel)
	{
		this.wheel = wheel;
		return this;
	}
	
	public DragOptions getDrag()
	{
		return drag;
	}
	
	public ZoomOptions setDrag(final DragOptions drag)
	{
		this.drag = drag;
		return this;
	}
	
	public PinchOptions getPinch()
	{
		return pinch;
	}
	
	public ZoomOptions setPinch(final PinchOptions pinch)
	{
		this.pinch = pinch;
		return this;
	}
	
	public String getMode()
	{
		return mode;
	}
	
	public ZoomOptions setMode(final String mode)
	{
		this.mode = mode;
		return this;
	}
	
	public String getScaleMode()
	{
		return scaleMode;
	}
	
	public ZoomOptions setScaleMode(final String scaleMode)
	{
		this.scaleMode = scaleMode;
		return this;
	}
	
	public String getOverScaleMode()
	{
		return overScaleMode;
	}
	
	public ZoomOptions setOverScaleMode(final String overScaleMode)
	{
		this.overScaleMode = overScaleMode;
		return this;
	}
}
