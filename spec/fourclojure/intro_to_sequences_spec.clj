(ns fourclojure.intro-to-sequences-spec
  (use [speclj.core][fourclojure.intro-to-sequences]))

(describe "Intro to sequences"
    (it "should perform sequencing operations"
      (should= 3(find-first '(3 2 1)))
        (should= 3(find-second [2 3 4]))
          (should= 3(find-last (list 1 2 3)))))
