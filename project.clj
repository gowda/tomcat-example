(defproject tomcat-example "0.1.0-SNAPSHOT"
  :description "tomcat-example: an example noir-based web application"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir "1.2.2"]]
  :dev-dependencies [[lein-ring "0.5.4"]]
  :ring {:handler tomcat-example.server/handler})

