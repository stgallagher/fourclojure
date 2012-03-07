(ns fourclojure.intro-to-strings-spec
  (use [speclj.core][fourclojure.intro-to-strings]))

(describe "Intro to strings"
   (it "should convert a string to uppercase"
          (should="HELLO WORLD"(upper-caser "hello world"))))

