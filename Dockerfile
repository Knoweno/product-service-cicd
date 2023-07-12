FROM openjdk:17
EXPOSE 8080
ADD target/product-service-github-actions.jar product-service-github-actions.jar
ENTRYPOINT ["java","-jar","/product-service-github-actions.jar"]
