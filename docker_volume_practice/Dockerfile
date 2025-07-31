FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/docker_volume_practice-0.0.1-SNAPSHOT.jar docker_volume_practice-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker_volume_practice-0.0.1-SNAPSHOT.jar"]
