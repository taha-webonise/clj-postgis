# clj-postgis

[Postgis](http://www.postgis.net/) garnish for [Korma](https://github.com/korma/Korma).

[![Clojars Project](https://img.shields.io/clojars/v/clj-postgis.svg)](https://clojars.org/clj-postgis)

## Usage

Add clj-postgis as a dependency in your `project.clj` file.

`[clj-postgis "0.0.1-SNAPSHOT"]`

There's just one macro named `st` available which takes a function name with args and alias.

### Examples:

```clojure
(select city
    (st (as-geojson :city.geom) :city_geom))
```

## License

Copyright © 2017 Taha Husain

Distributed under the Eclipse Public License
