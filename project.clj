(defproject org.clojars.guilespi/clj-facebook-graph "0.4.2"
  :description "A Clojure client for the Facebook Graph API (upgraded for Clojure 1.4.0)"
  :url "http://github.com/guilespi/clj-facebook-graph/"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring/ring-core "1.1.6"]
                 [clj-http "0.5.8"]
                 [org.clojars.guilespi/clj-oauth2 "0.1.1"]]
  :dev-dependencies [[ring/ring-devel "1.1.6"]
                     [ring/ring-jetty-adapter "1.1.6"]
                     [compojure "1.0.1"]]
  :aot [clj-facebook-graph.FacebookGraphException])
