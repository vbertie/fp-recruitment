FROM openjdk:8
ADD target/future-stock.jar future-stock.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=container", "future-stock.jar"]