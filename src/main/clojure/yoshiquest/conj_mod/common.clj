(ns yoshiquest.conj-mod.common
  (:require
   [yoshiquest.conj-mod.blocks :refer [conj-block]]
   [forge-clj.core :refer [register]]))

(defn common-init [this event]
  (register conj-block "conj-block"))
