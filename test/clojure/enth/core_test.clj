(ns enth.core-test
  (:refer-clojure :exclude [nth])
  (:require [clojure.test :refer :all]
            [enth.core :refer :all]))

(deftest nth-test
  (testing "GIVEN an empty Collection
            AND 0 as Index
            IT SHOULD return nil as value"
    (let [collection []
          index      0]
      (is (nil? (nth collection index)))))

  (testing "GIVEN a Collection with an Element
            AND 0 as Index
            IT SHOULD return that Element as value"
    (let [element    "air"
          collection [element]
          index      0]
      (is (= element (nth collection index)))))

  (testing "GIVEN a Collection with more than one Elements
            AND 1 as Index
            IT SHOULD return Element at Index as value"
    (let [element    "water"
          collection ["air" element "fire" "earth"]
          index      1]
      (is (= element (nth collection index)))))

  (testing "GIVEN a String with more than one Characters
            AND 2 as Index
            IT SHOULD return Character at Index as value"
    (let [character \S
          string    "NASA"
          index     2]
      (is (= character (nth string index)))))

  (testing "GIVEN a Collection with limited Size
            AND Size + 5 as Index
            IT SHOULD return Nil as value"
    (let [size       10
          collection (range 10)
          index      (+ size 5)]
      (is (nil? (nth collection index))))))
