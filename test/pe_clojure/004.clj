(ns pe-clojure.004
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [pe-clojure.core :refer :all]))

; Problem 4
; A palindromic number reads the same both ways. The largest palindrome
; made from the product of two 2-digit numbers is 9009 = 91 × 99.
; Find the largest palindrome made from the product of two 3-digit numbers.


(defn is-palindrome [num]
  (def str-num (str num))
  (def top-index (Math/ceil (/ (count str-num) 2)))
  (def bottom-index (Math/floor (/ (count str-num) 2)))

  (def first-digit (subs str-num 0 bottom-index))
  (def second-digit (subs str-num top-index))
  (= first-digit (str second-digit)))

(defn range-reverse [] 
  (reverse (range 100 999)))

(deftest find-palindrome-three-digit-factors
  (testing "Find palindrome's largest three digit factors"
    (def current-value 0)
    (doseq [x (range-reverse)] 
      (doseq [y (range-reverse)] 
        (if 
          (and (is-palindrome (* x y)) (> (* x y) current-value))
          (do 
            (def current-value (* x y))))))
    (printf "Answer: %d" current-value)))
