(ns pe-clojure.core-test
  (:require [clojure.test :refer :all]
            [pe-clojure.core :refer :all]))


; Problem 1
(defn findSumOfThreeFiveMultiples
  [maxValue]
  (def values (int-array (range 1 maxValue)))
  ; (print values)
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
    (is (= 233168 (findSumOfThreeFiveMultiples 1000))))
  )

(deftest test-ten
  (testing "FIXME, I fail."
    (is (= 23 (findSumOfThreeFiveMultiples 10))))
  )


; def total = 1
; start with x = 1
; add 1 to x (def as nextVal)
; add previous to x
; check if new value is < 4mil
; if it's > 4mil add the new term to the total
;


(defn findEvenNumbers
  "Returns the only the even numbers in a given array"
  [numbers]
  (filter (fn [x] (= 0 (mod x 2))) numbers)
  )

; Problem 2
(defn sumEvenFibonacciSeriesElements
  "Add even numbers in Fibonacci series elements"
  [limitValue]
  (def total 1)
  (def index 1)
  (while (< index limitValue)
    (do
      (def nextVal (inc index))
      ;(println "next: " nextVal)
      (def amount (if (= 0 (mod nextVal 2)) nextVal 0))
      ;(println "amt" amount)
      (def total (+ amount total))
      (def index (inc index))
      (println "total/index" total index)
      )
    )
  (print "done" total)
  100
  )


(deftest find-even-fibonacci-sum
  (testing "Find sum of even elements in Fibonacci series up to 4 million"
    (def limitValue 4000000)
    (def numbers (range 0 limitValue))
    (println "COUNTING nums")
    (print ( count (findEvenNumbers numbers)))
    (is (= 100 100))
    ;   (def limitValue 100)
;    (is (= 100 (sumEvenFibonacciSeriesElements limitValue)))
    )

  )
