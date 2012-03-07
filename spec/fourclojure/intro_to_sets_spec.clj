(ns fourclojure.intro-to-sets-spec
  (use [speclj.core][fourclojure.intro-to-sets]))

(describe "Intro to sets"
  (it "should create a set"
      (should= #{:a :b :c :d}(set-maker '(:a :a :b :c :c :c :c :d :d)))))
