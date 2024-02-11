# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/ayhag-docker.jar /app/ayhag-docker.jar

# Expose the port that your application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "ayhag-docker.jar"]
