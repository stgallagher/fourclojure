(ns fourclojure.nothing-but-the-truth-spec
  (use [speclj.core] [fourclojure.nothing-but-the-truth]))

(describe "Nothing but the truth"
  (it "should equal true"
      (should= true (truth))))
