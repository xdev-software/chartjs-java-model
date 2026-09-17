package software.xdev.chartjs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Desktop;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import software.xdev.chartjs.model.charts.Chart;
import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.datapoint.XYDataPoint;
import software.xdev.chartjs.model.dataset.BarDataset;
import software.xdev.chartjs.model.options.LegendOptions;
import software.xdev.chartjs.model.options.LineOptions;
import software.xdev.chartjs.model.options.Plugins;
import software.xdev.chartjs.model.options.Title;
import software.xdev.chartjs.model.options.scale.Scales;
import software.xdev.chartjs.model.options.scale.Scales.ScaleAxis;
import software.xdev.chartjs.model.options.scale.cartesian.linear.LinearScaleOptions;
import software.xdev.chartjs.model.options.scale.cartesian.linear.LinearTickOptions;
import software.xdev.chartjs.model.options.scale.cartesian.time.TimeScaleOptions;
import software.xdev.chartjs.model.options.scale.cartesian.time.TimeScaleOptions.DisplayFormats;
import software.xdev.chartjs.model.options.scale.cartesian.time.TimeScaleOptions.TimeOptions;
import software.xdev.chartjs.model.xydataset.XYLineChart;
import software.xdev.chartjs.model.xydataset.XYLineData;
import software.xdev.chartjs.model.xydataset.XYLineDataSet;
import software.xdev.chartjs.model.options.scale.cartesian.time.TimeScaleTickOptions;
import tools.jackson.databind.ObjectMapper;

public class TimeSeriesLineChartTest {

    
    /**
     * Goal rebuild time series chart from https://jsfiddle.net/escay/y9j3x5cf/6/
     * 
     * The fiddle contains some errors like barchart leftovers.
     * 
     * """
     * {
        "data": {
            "datasets": [
                {
                    "backgroundColor": "rgba(40, 180, 99, 0.3)",
                    "borderColor": "rgb(40, 180, 99)",
                    "borderWidth": 1,
                    "data": [
                        {
                            "x": 1699457269877,
                            "y": 20
                        },
                        {
                            "x": 1700047109694,
                            "y": 20
                        }
                    ],
                    "hidden": false,
                    "label": "Device Id: 524967 Register: A- total Wh",
                },
                {
                    "backgroundColor": "rgba(218, 117, 255, 0.3)",
                    "borderColor": "rgb(218, 117, 255)",
                    "borderWidth": 1,
                    "data": [
                        {
                            "x": 1699457267847,
                            "y": 10
                        },
                        {
                            "x": 1700047108397,
                            "y": 234
                        }
                    ],
                    "hidden": false,
                    "label": "Device Id: 524967 Register: A+ total Wh",
                }
            ]
        },
        "options": {
            "plugins": {
                "legend": {
                    "display": true,
                    "fullWidth": true,
                    "position": "top",
                    "reverse": false,
                    "rtl": false
                },
                "title": {
                    "display": true,
                    "text": "Values from the meter"
                }
            },
            "scales": {
                "x": {
                    "beginAtZero": false,
                    "offset": true,
                    "reverse": false,
                    "stacked": true,
                    "ticks": {
                        "autoSkip": true,
                        "maxRotation": 0,
                        "minRotation": 0,
                        "mirror": false,
                        "source": "data"
                    },
                    "time": {
                        "displayFormats": {
                            "minute": "dd.LL T"
                        },
                        "round": "minute",
                        "stepSize": "60",
                        "unit": "minute"
                    },
                    "type": "time"
                },
                "y": {
                    "beginAtZero": false,
                    "offset": false,
                    "reverse": false,
                    "stacked": true,
                    "ticks": {
                        "autoSkip": true,
                        "mirror": false
                    }
                }
            },
            "showLine": true,
            "spanGaps": false
        },
        "type": "line"
    }
     * """
     */
    @Test
    public void testXYTimeSeries() {
        XYLineChart chart = new XYLineChart(new XYLineData()
                .addDataset(new XYLineDataSet()
                        .addData(new XYDataPoint(1699457269877L, 20))
                        .addData(new XYDataPoint(1700047109694L, 20))
                        .setBackgroundColor("rgba(40, 180, 99, 0.3)")
                        .setBorderColor("rgb(40, 180, 99)")
                        .setBorderWidth(1)
                        .setHidden(false)
                        .setLabel("Device Id: 524967 Register: A- total Wh"))
                .addDataset(new XYLineDataSet()
                        .addData(new XYDataPoint(1699457267847L, 10))
                        .addData(new XYDataPoint(1700047108397L, 234))
                        .setBackgroundColor("rgba(218, 117, 255, 0.3)")
                        .setBorderColor("rgb(218, 117, 255)")
                        .setBorderWidth(1)
                        .setHidden(false)
                        .setLabel("Device Id: 524967 Register: A+ total Wh")))
                .setOptions(new LineOptions()
                        .setPlugins(new Plugins()
                                .setLegend(new LegendOptions()
                                        .setDisplay(true)
                                        .setFullSize(true) // was fullWidth ?
                                        .setPosition("top")
                                        .setReverse(false)
                                        .setRtl(false))
                                 .setTitle(new Title()
                                         .setDisplay(true)
                                         .setText("Values from the meter")))
                        .setScales(new Scales()
                            .addScale(ScaleAxis.X,
                                new TimeScaleOptions()
                                    // .setBeginAtZero(false) probably not relevant for time scale, would mean 1970
                                    .setOffset(true)
                                    .setReverse(false)
                                    .setStacked(true)
                                    .setTicks(new TimeScaleTickOptions()
                                            .setAutoSkip(true)
                                            .setMaxRotation(0)
                                            .setMinRotation(0)
                                            .setMirror(false)
                                            .setSource("data")
                                            .setStepSize(60)) // Was time.stepSize before 4.x
                                    .setTime(new TimeOptions()
                                        .setDisplayFormats(new DisplayFormats().setMinute("dd.LL T"))
                                        .setRound("minute")
                                        //.setStepSize(60)) // Moved to ticks.stepSize in 4.x
                                        .setUnit("minute")))
                           .addScale(ScaleAxis.Y, new LinearScaleOptions()
                                .setBeginAtZero(false)
                                .setOffset(false)
                                .setReverse(false)
                                .setStacked(true)
                                .setTicks(new LinearTickOptions()
                                        .setAutoSkip(true)
                                        .setMirror(false))))
                        .setShowLine(true)
                        .setSpanGaps(false));

        String jsonResult = prettyPrint(chart.toJson());

        // Make sure TimeScaleTickOptions().setSource("data") is converted
        assertTrue(jsonResult.contains("\"source\" : \"data\""));
        
        // Test the ChartJs result
        String expectedResult = """
{
  "data" : {
    "datasets" : [ {
      "backgroundColor" : "rgba(40, 180, 99, 0.3)",
      "borderColor" : "rgb(40, 180, 99)",
      "borderWidth" : 1,
      "data" : [ {
        "x" : 1699457269877,
        "y" : 20
      }, {
        "x" : 1700047109694,
        "y" : 20
      } ],
      "hidden" : false,
      "label" : "Device Id: 524967 Register: A- total Wh"
    }, {
      "backgroundColor" : "rgba(218, 117, 255, 0.3)",
      "borderColor" : "rgb(218, 117, 255)",
      "borderWidth" : 1,
      "data" : [ {
        "x" : 1699457267847,
        "y" : 10
      }, {
        "x" : 1700047108397,
        "y" : 234
      } ],
      "hidden" : false,
      "label" : "Device Id: 524967 Register: A+ total Wh"
    } ]
  },
  "options" : {
    "plugins" : {
      "legend" : {
        "display" : true,
        "fullSize" : true,
        "position" : "top",
        "reverse" : false,
        "rtl" : false
      },
      "title" : {
        "display" : true,
        "text" : "Values from the meter"
      }
    },
    "scales" : {
      "x" : {
        "offset" : true,
        "reverse" : false,
        "stacked" : true,
        "ticks" : {
          "autoSkip" : true,
          "maxRotation" : 0,
          "minRotation" : 0,
          "mirror" : false,
          "source" : "data",
          "stepSize" : 60
        },
        "time" : {
          "displayFormats" : {
            "minute" : "dd.LL T"
          },
          "round" : "minute",
          "unit" : "minute"
        },
        "type" : "time"
      },
      "y" : {
        "beginAtZero" : false,
        "offset" : false,
        "reverse" : false,
        "stacked" : true,
        "ticks" : {
          "autoSkip" : true,
          "mirror" : false
        },
        "type" : "linear"
      }
    },
    "showLine" : true,
    "spanGaps" : false
  },
  "type" : "line"
}\
                """;
        
        expectedResult = expectedResult.replace("\r", "");
        jsonResult = jsonResult.replace("\r", "");
        assertEquals(expectedResult, jsonResult);
        
        
        final BarData data = new BarData();
        data.addLabels("A", "B", "C");
        data.addDataset(new BarDataset()
            .setLabel("Dataset1")
            .setData(1, 3, 2));
        
        createAndOpenTestFile(chart);
    }

    private static void createAndOpenTestFile(final Chart<?, ?, ?> chart)
    {
        try
        {
            final Path tmp = Files.createTempFile("chart_test_", ".html");
            
            Files.writeString(
                tmp,
                String.format("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "\t<head>\n"
                    + "\t\t<meta charset='UTF-8'>\n"
                    + "\t\t<script src=\"https://cdn.jsdelivr.net/npm/chart.js@4.5.0/dist/chart.umd.js\"></script>\n"
                    + "\t\t<script src=\"https://cdn.jsdelivr.net/npm/luxon@3.0\"></script>\n"
                    + "\t\t<script src=\"https://cdn.jsdelivr.net/npm/chartjs-adapter-luxon@1.1.0\"></script>\n"
                    + "\t</head>\n"
                    + "\t<body>\n"
                    + "\t\t<canvas id='c' style='border:1px solid #555;'></canvas>\n"
                    + "\t\t<script>\n"
                    + "\t\t\tnew Chart(document.getElementById('c').getContext('2d'), %s);\n"
                    + "\t\t</script>\n"
                    + "\t</body>\n"
                    + "</html>", chart.toJson())
            );
            
            Desktop.getDesktop().browse(tmp.toUri());
        }
        catch(final IOException e)
        {
            throw new UncheckedIOException(e);
        }
    }
    
    private String prettyPrint(String json) {
        // Pretty print and test entire object
        ObjectMapper mapper = new ObjectMapper();
        Object jsonObject = mapper.readValue(json, Object.class);
        String prettyJson = mapper.writerWithDefaultPrettyPrinter()
                                  .writeValueAsString(jsonObject);
        return prettyJson;
    }
}
