# Use a lightweight JRE base image for running the application
FROM openjdk:27-ea-oraclelinux9

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file from your local target directory into the container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the port your Spring Boot app listens on (default is 8080)
EXPOSE 8080

# Define the command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
