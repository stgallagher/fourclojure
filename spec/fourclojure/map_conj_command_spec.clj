(ns fourclojure.map-conj-command-spec
  (use [speclj.core] [fourclojure.map-conj-command]))

(describe "Map conj command"
  (it "should join key value pairs to a map"
    (should= {:a 1 :b 2 :c 3}(map-conj {:a 1} {:b 2} {:c 3}))))
