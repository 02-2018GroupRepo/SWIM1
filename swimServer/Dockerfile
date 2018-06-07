FROM openjdk:8
VOLUME /tmp
ADD target/swimserver-0.0.1-SNAPSHOT.jar spring.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","spring.jar"]