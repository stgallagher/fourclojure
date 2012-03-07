(ns fourclojure.simple-math-spec
  (use [speclj.core][fourclojure.simple-math]))

(describe "Simple math"
  (it "calculates a simple equation"
      (should= 4 (simplemath))))

