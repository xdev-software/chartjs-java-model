## 1.0.2
* Support Java 11

## 1.0.1
* Added support for [stacked bar chart with groups](https://www.chartjs.org/docs/latest/samples/bar/stacked-groups.html)

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
