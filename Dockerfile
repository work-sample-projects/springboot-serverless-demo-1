FROM openjdk:8-jdk-alpine

# VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ARG ENTROPY_OPT = "-Djava.security.egd=file:/dev/./urandom"

ENTRYPOINT ["java", ENTROPY_OPT, "-jar", "/app.jar"]