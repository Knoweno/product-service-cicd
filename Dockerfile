FROM openjdk:17
ADD target/Product-Service-0.0.1-SNAPSHOT.jar ProductService.jar
ENTRYPOINT ["java","-jar","/ProductService.jar"]
