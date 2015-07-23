This example describes how to communicate different WAR modules over RMI.

The documentation could be found here: http://docs.spring.io/spring/docs/current/spring-framework-reference/html/remoting.html

How to build:

1. get sources of this project from github

2. set "tomcat.home.dir" environment variable pointing to TOMCAT_HOME directory
For example add following settings to the Maven settings.xml file
      <profile>
          <id>programmador.info</id>
          <properties>
              <tomcat.home.dir>/my/programs/tomcat</tomcat.home.dir>
          </properties>
      </profile>

3. go to directory "inter-module-communication-parent" and build the project:
mvn clean install

if tomcat.home.dir variable was set currectly, then you can find project builds in TOMCAT_ROOT/webapps/ directory:
TOMCAT_ROOT/webapps/book-service.war
TOMCAT_ROOT/webapps/book-client.war

If WAR artifacts is not appeared inside TOMCAT_ROOT/webapps, just copy them manually:
 ......./inter-module-communication-client/target/book-client.war    ->  TOMCAT_ROOT/webapps/
 ......./inter-module-communication-client/target/book-service.war   ->  TOMCAT_ROOT/webapps/


4. run tomcat and open URL:
http://localhost:8080/book-client/

The client side code (client side WAR) will show you UUID code received from book service (service side WAR)
For example:
Received book id: 96e8b20e-ffbd-4c6b-8647-6cd1ea58d07f