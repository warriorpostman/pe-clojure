(ns pe-clojure.002
  (:require [clojure.test :refer :all]
            [pe-clojure.core :refer :all]))

; Problem 2
(defn find-even-numbers 
  "Returns the only the even numbers in a given array"
  [numbers]
  (filter (fn [x] (= 0 (mod x 2))) numbers)
  )

(def fib-seq-seq
  ((fn fib [a b]
     (lazy-seq (cons a (fib b (+ a b)))))
  1 2))

(deftest sum-even-fibonacci-numbers
  (testing "Find sum of even elements in Fibonacci series up to 4 million"
    (def limit 4000000)
    (def evenNumbers (find-even-numbers (take-while #(< % 4000000) fib-seq-seq)))
    (def total (reduce + evenNumbers))
    (print "TOTAL " total)
    (is (= 4613732 total))
    )
  )


