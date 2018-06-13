FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/springboot-0.0.1.jar springboot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/springboot.jar"]
