## 2.0.0
* Scales have been reworked and are now nearly identical to the types defined in ChartJS
* The use of ``Color`` is no longer required. It's also possible to use strings now.

## 1.5.0
* Added ``JsonIgnore`` to certain fields to help prevent infinite loops #174
* Corrected model for ``Title`` and ``Font`` #175

## 1.4.1
* Use ``Number`` instead of ``BigDecimal`` in some additional places #159 (@aripddev)

## 1.4.0
* Simplify API by using ``Number`` instead of ``BigDecimal``, ``int`` and ``double`` for ``Datapoints`` #154 (@aripddev)

## 1.3.1
* Add subtitle option #141 (@aripddev)
* Add ``PointStyle#rectRounded`` #143 (@aripddev)
* Add ``BubbleDataset#pointStyle`` #144 (@aripddev)
* ``reverse`` property should be on the ``Scale`` object #145
* Added all available properties for ``Legend``

## 1.3.0
* Allows creation of mixed charts #128
  * New chart class: ``MixedChart``
  * Some classes have been renamed
    * ``Data`` -> ``HomogeneousData``
    * ``AbstractChart`` -> ``HomogeneousChart``
* Slim down test dependencies

## 1.2.0
* Add TimeScale and TimeTicks to allow building linear time charts #90 (@astappiev)
* Add options for the [Zoom plugin](https://www.chartjs.org/chartjs-plugin-zoom/latest/) #117 (@astappiev)
* Updated dependencies

## 1.1.3
* Add ``toJsonNative`` method which doesn't run the ``isDrawable`` check #91

## 1.1.2
* ⚠️ GroupId changed from ``com.xdev-software`` to ``software.xdev``

## 1.1.1
* ``AngleLines#lineWidth`` now uses ``BigDecimal`` #76
* Updated dependencies

## 1.1.0
* Added support for more [data structures](https://www.chartjs.org/docs/4.4.0/general/data-structures.html) inside ``Dataset#data``
  * ``Dataset#data`` can now contain ``Object``s

## 1.0.2
* Support Java 11
* Updated dependencies

## 1.0.1
* Added support for [stacked bar chart with groups](https://www.chartjs.org/docs/4.4.0/samples/bar/stacked-groups.html) (@dlemaignent)

## 1.0.0
Initial release

Support for Chart.js v4

Noteworthy changes compared to [Chart.java](https://github.com/mdewilde/chart):
* Changed the package to ``software.xdev.chartjs.model``
* All charts (e.g. ``BarChart``, ``LineChart``, ...) are now inside the ``charts`` package
* Breaking API changes due to compatibility with Chart.js v4; You may checkout the migration guides
  * [3.x Migration Guide](https://www.chartjs.org/docs/4.3.0/migration/v3-migration.html)
  * [4.x Migration Guide](https://www.chartjs.org/docs/4.3.0/migration/v4-migration.html)
* JSON is no longer pretty printed by default due to performance reasons
* Implemented integration tests
* Requires Java 17
