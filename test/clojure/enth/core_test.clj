(ns enth.core-test
  (:refer-clojure :exclude [nth])
  (:require [clojure.test :refer :all]
            [enth.core :refer :all]))

(deftest nth-test
  (testing "GIVEN an empty Collection
            AND 0 as Index
            IT SHOULD return nil as value"
    (is (nil? (nth [] 0)))))
