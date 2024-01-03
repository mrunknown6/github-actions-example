FROM openjdk:17-alpine
EXPOSE 8080
ADD target/github_actions_example.jar github_actions_example.jar
ENTRYPOINT ["java", "-jar", "/github_actions_example.jar"]