(ns fourclojure.intro-to-vectors-spec
  (use [speclj.core][fourclojure.intro-to-vectors]))

(describe "Intro to vectors"
    (it "should create a vector"
        (should= [:a :b :c](create-vector :a :b :c))))
