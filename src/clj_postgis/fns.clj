(ns clj-postgis.fns
  (:use [korma.sql.engine :only [infix group-with sql-func trinary wrapper]]))

(defn as-geojson [_query_ v] (sql-func "ST_AsGeoJSON" v))
