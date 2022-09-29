FROM openjdk:11
COPY ./target/hello-world-1.0-SNAPSHOT.jar /opt/hello/app.jar
WORKDIR /opt/hello
ENTRYPOINT ["java","-jar","app.jar"]