FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER Paulo Trindade
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package -Dmaven.test.skip=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/APIcoletora-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "APIcoletora-0.0.1-SNAPSHOT.jar"]
