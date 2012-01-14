(ns tomcat-example.server
  (:require [noir.server :as server]
            tomcat-example.views.welcome))

(def handler (server/gen-handler {:mode :dev ;; can be :prod for production
                                  :ns 'tomcat-example}))

