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
package software.xdev.chartjs.model.container;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.rnorth.ducttape.timeouts.Timeouts;
import org.rnorth.ducttape.unreliables.Unreliables;

import software.xdev.testcontainers.selenium.containers.browser.CapabilitiesBrowserWebDriverContainer;


public class SeleniumBrowserWebDriverContainer
	extends CapabilitiesBrowserWebDriverContainer<SeleniumBrowserWebDriverContainer>
{
	protected RemoteWebDriver webDriver;
	protected Capabilities capabilities;
	
	public SeleniumBrowserWebDriverContainer(final Capabilities capabilities)
	{
		super(capabilities);
		this.capabilities = capabilities;
	}
	
	public synchronized RemoteWebDriver webDriver()
	{
		if(this.webDriver == null)
		{
			this.webDriver = Unreliables.retryUntilSuccess(
				2,
				() -> Timeouts.getWithTimeout(
					20,
					TimeUnit.SECONDS,
					() -> new RemoteWebDriver(this.getSeleniumAddressURI().toURL(), this.capabilities, false)
				)
			);
		}
		
		return this.webDriver;
	}
}
