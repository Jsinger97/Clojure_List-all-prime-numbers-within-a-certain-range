(import java.lang.Math)
;;------------TASK 1
;return all number between 2 - sqrt of n
(defn get-divisors [n]
    (range 2 (inc (Math/round (Math/sqrt n))))
    )
;;------------TASK 2
;return true if x divides n 

(defn divides? [x n]
    (zero? (rem x n))
    )
;;------------TASK 3
;return true if none of the numbers between get 
;dividors divide by n false otherwise

(defn no-divisors? [n]
    (= (count (filter (partial divides? n) (get-divisors n)))
       0)
    )
;;------------TASK4 
;return true if n is prime false otherwise calling 
;no divisors
(defn is-prime? [n]
    (cond (= n 1) false (= n 2) true :else (no-divisors? n))
    )
;;------------TASK5
;range from and to filer prime numbers inclusive
(defn prime-seq [from to]
    (filter is-prime? (range from to))
    )
;;------------TASK6

(defn print-top-primes [from to]
    ;reverse the prime seq function
    (run! println (reverse (prime-seq from to)))
    ;print the total use reduce to add the prime seq collection together
    (printf "Total = %d\n" (reduce + (prime-seq from to)))
    )
   

(println (get-divisors 4))
(println (get-divisors 101))
(println(divides? 2 10))
(println (divides? 4 10))
(println (no-divisors? 7))
(println "----IS PRIME----")
(println (is-prime? 1))
(println (is-prime? 2))
(println (is-prime? 3))
(println (is-prime? 4))
(println (is-prime? 101))
(println (prime-seq 2 19))
(println (prime-seq 50 100))
(println (print-top-primes 2 19))
(println (print-top-primes 50 100))


