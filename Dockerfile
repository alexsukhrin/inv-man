FROM openjdk:8-alpine

COPY target/uberjar/inv-man.jar /inv-man/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/inv-man/app.jar"]
