(defproject com.raeoks/enth "0.0.1"
  :description "A custom clojure.core/nth function"
  :url "https://github.com/raeoks/enth"
  :license {:name "Apache License, Version 2.0"
            :url  "https://www.apache.org/licenses/LICENSE-2.0"}
  :repl-options {:host "0.0.0.0"
                 :port 1337}
  :local-repo "vendor"
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :test-paths ["test/clojure"]
  :resource-paths ["src/resources"]
  :target-path "target/%s/"
  :dependencies [[org.clojure/clojure "1.8.0"]])
