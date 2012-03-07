(ns fourclojure.intro-to-lists-spec
  (use [speclj.core][fourclojure.intro-to-lists]))

(describe "Intro to lists"
  (it "should generate a list"
      (should= '(:a :b :c)(make-list :a :b :c))))
