(defproject clj-facebook-graph "0.4.0"
  :description "A Clojure client for the Facebook Graph API."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.1.3"]
                 [ring/ring-core "1.1.6"]
                 [clj-http "0.5.8"]
                 [clj-oauth2 "0.1.0"]]
  :dev-dependencies [[ring/ring-devel "1.1.6"]
                     [ring/ring-jetty-adapter "1.1.6"]
                     [compojure "1.0.1"]]
  :aot [clj-facebook-graph.FacebookGraphException])
