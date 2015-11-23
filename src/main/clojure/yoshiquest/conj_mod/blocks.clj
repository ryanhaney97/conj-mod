(ns yoshiquest.conj-mod.blocks
  (:require
   [forge-clj.blocks :refer [defblock]])
  (:import
   [net.minecraft.block Block]
   [net.minecraft.creativetab CreativeTabs]))
(defblock conj-block
  :block-name "conj-block"
  :block-texture-name "conj-mod:conj-block"
  :creative-tab CreativeTabs/tabBlock)
