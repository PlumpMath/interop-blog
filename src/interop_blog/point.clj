(ns interop-blog.point)

(defprotocol TranslatePoint
  (moveX [this delta] "Translate a point along the X axis."))

(defrecord Point [x y]
  TranslatePoint
  (moveX [this delta] (Point. (+ x delta) y)))
