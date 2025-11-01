FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./target/nurvi-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} nurvi_app.jar
EXPOSE 7070
ENTRYPOINT ["java","-jar","/nurvi_app.jar"]