(ns pe-clojure.03-test
  (:require [clojure.test :refer :all]))

; Problem 3
; The prime factors of 13195 are 5, 7, 13 and 29.
; What is the largest prime factor of the number 600851475143 ?

(defn find-max-prime [num]
  (def i 2)
  (def top num)
  (while (> top i)
    (do
      (if (= 0 (mod top i))
        (def top (/ top i))
        )
      (def i (+ i 1))
      )
    )
  i
  )

(deftest find-largest-prime-of-very-large-number
  (testing "Find the largst prime of 600851475143"
    (def hugeNumber 600851475143)
    (def result (find-max-prime hugeNumber))
    (println "Max Prime" result)

    (is (= 6857 result))
    )
  )

; NOTE: IT WORKS, but mutating variables like a chump