(ns interop-blog.core
  (:import [interop.example ICalculator]))

(defn mult [x y] (* x y))

(defrecord Calculator [operand]
  ICalculator
  (multiply [this x] (mult x operand)))

(defn new-reified-calc [operand]
  (reify
    ICalculator
    (multiply [this x] (mult x operand))))
