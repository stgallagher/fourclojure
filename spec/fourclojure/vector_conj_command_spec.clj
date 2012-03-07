(ns fourclojure.vector-conj-command-spec
  (use [speclj.core][fourclojure.vector-conj-command]))

(describe "Vector conj command"
  (it "should join together a vector with elements"
      (should= [1 2 3 4](vector-conj [1 2] 3 4))))
