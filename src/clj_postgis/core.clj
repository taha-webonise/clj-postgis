(ns clj-postgis.core
  (:refer-clojure :exclude [update])
  (:require [korma.core :refer :all]
            [clj-postgis.engine :as eng]
            [clj-postgis.fns :as fns])
  (:use [korma.sql.engine :only [bind-query]]))

(defmacro st
  "Use a postgis function, aliasing the results

  (select table_name
    (st (as-geojson :geom) :geom))

  Functions available: as-geojson"
  [query func alias]
  `(let [q# ~query]
     (bind-query q#
       (fields q# [(-> q# ~(eng/parse-postgis-fn func)) ~alias]))))
