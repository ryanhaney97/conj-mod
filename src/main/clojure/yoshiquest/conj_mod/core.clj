(ns yoshiquest.conj-mod.core
  (:require
   [forge-clj.core :refer [defmod]]
   [yoshiquest.conj-mod.common]))

(defmod yoshiquest.conj-mod.core conj-mod "0.0.1"
  :common {:init yoshiquest.conj-mod.common/common-init})
