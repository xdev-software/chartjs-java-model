[![Latest version](https://img.shields.io/maven-central/v/software.xdev/chartjs-java-model?logo=apache%20maven)](https://mvnrepository.com/artifact/software.xdev/chartjs-java-model)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/chartjs-java-model/check-build.yml?branch=develop)](https://github.com/xdev-software/chartjs-java-model/actions/workflows/check-build.yml?query=branch%3Adevelop)
[![ChartJS Documentation](https://img.shields.io/badge/Chart.js-documentation-ff6384?logo=Chart.js)](https://www.chartjs.org/docs/latest/)

# <img src="https://www.chartjs.org/media/logo.svg" height="38" /> chartjs-java-model
Provides Java models for [Chart.js](https://www.chartjs.org/) so that e.g. a Java Server can build a chart and then instruct a JavaScript client what needs to be shown.

This repo extends the abandoned [Chart.java](https://github.com/mdewilde/chart) and adds support for Chart.js Version 4+.

> [!NOTE]
> We try our best to implement the ChartJS v4 API however there are a lot of configuration options.<br/>
> Therefore some parts might still be missing or use the outdated v2 API from the original repo.<br/>
> If you think you found a missing or incorrect API please open an issue and/or provide a pull request.

## Usage

Configuring a chart is straight forward and follows a builder like pattern:
```java
new BarChart(new BarData()
  .addLabels("A", "B")
  .addDataset(new BarDataset()
    .setLabel("X")
    .addData(1)
    .addData(2)))
  .toJson(); // Do something with the json like sending it to the client
```

If you need more examples:
* Have a look at the [demo](./chartjs-java-model-demo/) 
* or checkout how we do it in our [tests](./chartjs-java-model/src/test/java/software/xdev/chartjs/model/)
  * there are also [screenshots](./chartjs-java-model/src/test/resources/screenshotReferences/) available

## Installation
[Installation guide for the latest release](https://github.com/xdev-software/chartjs-java-model/releases/latest#Installation)

#### Compatibility with Chart.js
| Chart.js | ``chartjs-java-model`` version |
| --- | --- |
| 4.x | ``1+`` |

#### Integrations
* Vaadin - You can utilize the library in combination with our [Chart.js Wrapper for Vaadin](https://github.com/xdev-software/vaadin-chartjs-wrapper)
* [Primefaces's Charts](https://showcase.primefaces.org/ui/chart/bar.xhtml)

## Support
If you need support as soon as possible and you can't wait for any pull request, feel free to use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/chartjs-java-model/dependencies)

## Acknowledgment
* To all [contributors](https://github.com/xdev-software/chartjs-java-model/graphs/contributors) that helped to improve this library
  * Especially to the devs at [PrimeTek/PrimeFaces](https://www.primefaces.org/) that regularly provide feedback and PRs

<sub>Disclaimer: This is not an official Chart.js product and not associated</sub>
