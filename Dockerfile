FROM openjdk:8
ADD target/async.jar async.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "async.jar"]