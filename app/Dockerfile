FROM maven:3.6-jdk-11-slim as BUILD
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package spring-boot:repackage

FROM openjdk:11.0-jre
EXPOSE 8085
COPY --from=BUILD /usr/src/app/target/marvel.restassured-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]