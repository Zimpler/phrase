(ns phrase.runner
  (:require
    [doo.runner :refer-macros [doo-tests]]
    [phrase.alpha-test]))

(doo-tests 'phrase.alpha-test)
