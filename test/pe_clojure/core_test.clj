(ns pe-clojure.core-test
  (:require [clojure.test :refer :all]
            [pe-clojure.core :refer :all]))


(defn findSumOfThreeFiveMultiples
  [maxValue]
  (def values (int-array (range 1 maxValue)))
  ; (print values)
  (reduce (fn [acc cur]
            (def isMultiple
              (or
                (= 0 (mod cur 3))
                (= 0 (mod cur 5))
              ))
            (if isMultiple (+ acc cur) acc)
            )
          0
          values
          ))

(deftest test-thousand
  (testing "FIXME, I fail."
    (is (= 233168 (findSumOfThreeFiveMultiples 1000))))
  )

(deftest test-ten
  (testing "FIXME, I fail."
    (is (= 23 (findSumOfThreeFiveMultiples 10))))
  )

