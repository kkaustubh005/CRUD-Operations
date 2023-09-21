FROM openjdk:17
EXPOSE 8080
ADD target/CRUDOperations-docker.jar CRUDOperations-docker.jar
ENTRYPOINT ["java","-jar","CRUDOperations-docker.jar"]
#############################

#
# Build stage
#
#FROM maven:3.8.3-openjdk-17 AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/home/app/target/CRUDOperations-docker.jar"]