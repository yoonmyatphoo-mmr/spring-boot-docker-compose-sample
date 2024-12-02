FROM openjdk:17-jdk-alpine
WORKDIR /opt/app
COPY target/spring-boot-docker-compose-sample-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
