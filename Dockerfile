FROM openjdk:19
EXPOSE 8080
ADD target/dummyapi.jar dummyapi.jar
ENTRYPOINT ["java", "-jar", "/dummyapi.jar"]