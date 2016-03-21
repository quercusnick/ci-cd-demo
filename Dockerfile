FROM tomcat:8.0

ADD ./target/CounterWebApp.war /usr/local/tomcat/CounterWebApp.war
#WORKDIR  /usr/local/tomcat
