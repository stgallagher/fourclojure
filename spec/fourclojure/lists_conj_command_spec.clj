(ns fourclojure.lists-conj-command-spec
  (use [speclj.core][fourclojure.lists-conj-command]))

(describe "Lists conj command"
  (it "should add things to the start of the list"
      (should= '(1 2 3 4)(using-conj '(3 4) 2 1))))
