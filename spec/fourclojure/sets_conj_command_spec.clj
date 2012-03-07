(ns fourclojure.sets-conj-command-spec
  (use [speclj.core][fourclojure.sets-conj-command]))

(describe "Sets conj command"
   (it "adds keys tp a set"
       (should= #{1 2 3 4} (set-conj #{1 4 3} 2))))

