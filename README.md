# tomcat-example

a simple web-application written in clojure using noir, to demonstrate
deployment using apache and tomcat.

## Usage

* create war-file

 $ lein ring uberwar

* copy war-file to tomcat lib directory as ROOT.war
  (/var/lib/tomcat/tomcat-example - default)

* restart tomcat


## License

Copyright (C) 2011 Basavanagowda Kanur

Distributed under the Eclipse Public License, the same as Clojure.

