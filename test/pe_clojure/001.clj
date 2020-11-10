(ns pe-clojure.001
  (:require [clojure.test :refer :all]
            [pe-clojure.core :refer :all]))

; Problem 1
(defn sum-multiples-three-and-five
  [maxValue]
  (def values (int-array (range 1 maxValue)))
  (reduce
    (fn [acc cur]
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
    (is (= 233168 (sum-multiples-three-and-five 1000))))
  )

(deftest test-ten
 (testing "FIXME, I fail."
   (is (= 23 (sum-multiples-three-and-five 10))))
 )


