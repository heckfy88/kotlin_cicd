FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /kotlin_cicd

# Copy the application JAR file to the container
COPY target/cicd-1.0-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]