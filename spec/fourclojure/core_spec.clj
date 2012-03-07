(ns fourclojure.core-spec
  (use [speclj.core] [fourclojure.core]))

(describe "fourclojure.core trivial test"
  (it "adds two numbers"
    (should= 7 (adder 3 4))))
