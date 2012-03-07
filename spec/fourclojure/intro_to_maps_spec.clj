(ns fourclojure.intro-to-maps-spec
  (use [speclj.core][fourclojure.intro-to-maps]))

(describe "Intro to maps"
  (it "should access a value in a map from a key"
    (should= 20(map-accessor :b {:a 10 :b 20 :c 30}))))
