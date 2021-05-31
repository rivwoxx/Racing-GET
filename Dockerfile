FROM maven:3.5-jdk-11 AS build  
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:11.0.11-jdk
COPY --from=build /usr/src/app/target/racing-0.0.1.jar /usr/app/racing-0.0.1.jar 
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/racing-0.0.1.jar"]