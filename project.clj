(defproject pe-clojure "0.1.0-SNAPSHOT"
  :description "Project Euler solutions using Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot pe-clojure.core
  :plugins [[lein-auto "0.1.3"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
