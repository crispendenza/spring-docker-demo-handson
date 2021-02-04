FROM openjdk:15
ADD target/spring-boot-docker-handson-0.0.1-SNAPSHOT.jar spring-boot-docker-handson-0.0.1-SNAPSHOT.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "spring-boot-docker-handson-0.0.1-SNAPSHOT.jar"]

#FROM mysql:5.6 as mysql-stand
