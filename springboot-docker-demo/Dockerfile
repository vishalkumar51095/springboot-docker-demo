#define base docker image
FROM openjdk:8
LABEL maintainer="vishal"
ADD target/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springboot-docker-demo-0.0.1-SNAPSHOT.jar"]