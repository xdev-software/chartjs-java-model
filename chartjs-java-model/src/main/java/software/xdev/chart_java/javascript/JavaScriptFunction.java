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
package software.xdev.chart_java.javascript;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize(using = JavaScriptFunction.Serializer.class)
public class JavaScriptFunction
{
	private final String function;
	
	public JavaScriptFunction(final String function)
	{
		this.function = function;
	}
	
	public String getFunction()
	{
		return this.function;
	}
	
	public static class Serializer extends JsonSerializer<JavaScriptFunction>
	{
		@Override
		public void serialize(
			final JavaScriptFunction value,
			final JsonGenerator gen,
			final SerializerProvider serializers) throws IOException
		{
			gen.writeRawValue(value.function);
		}
	}
}
