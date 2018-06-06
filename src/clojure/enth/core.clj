(ns enth.core)

(defn nth
  "Returns the value at the index. get returns nil if index out of bounds.
   nth also works for Strings and Lists, and, in O(n) time, for sequences."
  [collection index]
  (last collection))
