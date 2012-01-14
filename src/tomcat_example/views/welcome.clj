(ns tomcat-example.views.welcome
  (:require [tomcat-example.views.common :as common])
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to tomcat-example"]))
