FROM openjdk:17

COPY target/BooksAPI-0.0.1-SNAPSHOT.jar BooksAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "BooksAPI-0.0.1-SNAPSHOT.jar"]