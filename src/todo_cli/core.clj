(ns todo-cli.core
  (:gen-class)
  (:require [clojure.tools.cli :refer [parse-opts]]))

(defn -main
  [& args]
  (println args))
