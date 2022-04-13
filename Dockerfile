FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-demo-1-0.0.1-SNAPSHOT.jar spring-boot-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo.jar"]