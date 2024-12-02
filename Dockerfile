#Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

#Information around who maintains the image
MAINTAINER Shubham_Ashtaputre

# Add the application's jar to the container
COPY target/TrackingNumberGenerator-0.0.1.jar TrackingNumberGenerator-0.0.1.jar

#execute the application
ENTRYPOINT ["java","-jar","/TrackingNumberGenerator-0.0.1.jar"]