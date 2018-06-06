(ns enth.core)

(defn- make-nth-fn
  ([index]
   (make-nth-fn index identity))
  ([index nth-fn]
   (if (<= index 0)
     (comp first nth-fn)
     (recur (- index 1) (comp rest nth-fn)))))

(defn nth
  "Returns the value at the index. get returns nil if index out of bounds.
   nth also works for Strings and Lists, and, in O(n) time, for sequences."
  [collection index]
  (let [nth-fn (make-nth-fn index)]
    (nth-fn collection)))
