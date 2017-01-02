(ns clj-postgis.engine
  (:require [korma.sql.engine :refer [bind-query]]
            [clojure.walk :as walk]))

(def fns {'as-geojson 'clj-postgis.fns/as-geojson})

(defn parse-postgis-fn
  [form]
  (if (string? form)
    form
    (walk/postwalk-replace fns form)))
