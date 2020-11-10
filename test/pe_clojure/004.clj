(ns pe-clojure.004
  (:require [clojure.test :refer :all]
            [clojure.string :as string]
            [pe-clojure.core :refer :all]))

; Problem 4
; A palindromic number reads the same both ways. The largest palindrome
; made from the product of two 2-digit numbers is 9009 = 91 × 99.
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn is-palindrome [num]
  (def str-num (str num))
  (def top-index (Math/ceil (/ (count str-num) 2)))
  (def bottom-index (Math/floor (/ (count str-num) 2)))

  ; (println "I" bottom-index top-index)
  (def first (subs str-num 0 bottom-index))
  (def second (subs str-num top-index))
  ;(println "first" first second)
  (= first (string/reverse second))
  )

(deftest find-palindrome-three-digit-factors
  (testing "Find palindrome's largest three digit factors"
    (println "PE 04")
    (def double-digits (range 9 100))
    ; (def upper-limit 999)
    ; (def lower-limit 100)


    ;(reduce
    ;  (fn [acc out]
    ;    (reduce
    ;      (fn [acc in]
    ;        (if (is-palindrome (* in out))
    ;          ((println "is pal! " (* in out)) {:x in :y out})
    ;          (println "noooo") acc)
    ;        )
    ;      double-digits)
    ;    )
    ;  double-digits
    ;  )
    ;)

    (println "reduction"
             (reduce (fn [n y] (if (> n 2) n y)) [1 2 3 4 5]))

    )
  )
;(print 303 (true? (is-palindrome 303)))
