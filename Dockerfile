# Use a base image with OpenJDK
FROM eclipse-temurin:24-jdk

# Set the working directory
WORKDIR /app

#copying the env file
COPY .env .env

# Copy the jar file to the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your app runs on (default 8080 for Spring Boot)
EXPOSE 8080

# Command to run the jar file
#ENTRYPOINT ["java", "-jar", "/app/app.jar"]
CMD [ "java" , "-jar" , "app.jar" ]