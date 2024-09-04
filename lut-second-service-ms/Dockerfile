FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service-ms.jar
ENTRYPOINT ["java","-jar","/service-ms.jar"]