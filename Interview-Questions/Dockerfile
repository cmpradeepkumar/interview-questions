FROM openjdk:15-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} IQ.jar
ENTRYPOINT ["java", "-jar", "/IQ.jar"]