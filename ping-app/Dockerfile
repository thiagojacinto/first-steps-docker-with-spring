FROM openjdk

WORKDIR /ping-app

COPY target/ping-app-0.0.1-SNAPSHOT.jar /ping-app/ping-app.jar

ENTRYPOINT ["java", "-jar", "ping-app.jar"]