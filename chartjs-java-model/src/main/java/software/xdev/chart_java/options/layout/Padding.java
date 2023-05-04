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
package software.xdev.chart_java.options.layout;

public class Padding
{
	protected int left;
	protected int right;
	protected int top;
	protected int bottom;
	
	public int getLeft()
	{
		return this.left;
	}
	
	public Padding setLeft(final int left)
	{
		this.left = left;
		return this;
	}
	
	public int getRight()
	{
		return this.right;
	}
	
	public Padding setRight(final int right)
	{
		this.right = right;
		return this;
	}
	
	public int getTop()
	{
		return this.top;
	}
	
	public Padding setTop(final int top)
	{
		this.top = top;
		return this;
	}
	
	public int getBottom()
	{
		return this.bottom;
	}
	
	public Padding setBottom(final int bottom)
	{
		this.bottom = bottom;
		return this;
	}
}
