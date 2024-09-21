FROM openjdk:11
LABEL authors="baselhannoush"
VOLUME /tmp
COPY target/FxDealProcessor-1.0-SNAPSHOT.jar app.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "/app.jar"]
