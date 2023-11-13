FROM openjdk:17
ADD target/entrypoint-0.0.1-SNAPSHOT.jar entrypoint-0.0.1-SNAPSHOT.jar
WORKDIR /system
COPY ./target/entrypoint-0.0.1-SNAPSHOT.jar /system/entrypoint-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "entrypoint-0.0.1-SNAPSHOT.jar"]
