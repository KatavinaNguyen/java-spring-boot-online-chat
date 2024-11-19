FROM maven:3.9.6-eclipse-temurin-22-jammy as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:22-jdk
COPY --from=build /target/onlinechat-0.0.1-SNAPSHOT.jar onlinechat.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "onlinechat.jar"]