(defproject interop-blog "0.1.0-SNAPSHOT"
  :description "Example code for blog on Java interop pitfalls"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :java-source-paths ["src-java"]
  :aot [interop-blog.core])
