FROM openjdk:17-jdk-alpine3.14
#MAINTAINER baeldung.com
COPY target/coursejavaexplorer-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]
