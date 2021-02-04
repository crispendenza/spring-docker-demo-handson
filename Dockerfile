FROM maven:3-openjdk-15 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src src
RUN mvn clean package -DskipTests

# PROD stage
FROM openjdk:15
ARG BUILD_DIR=/app/target
COPY --from=builder ${BUILD_DIR} /app
EXPOSE 8089
WORKDIR /app
ENTRYPOINT ["java","-jar", "spring-docker-handson-0.0.1-SNAPSHOT.jar"]


