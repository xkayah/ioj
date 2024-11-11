FROM openjdk:8-jdk-alpine

# Copy local code to the container image.
WORKDIR /app

COPY ioj-0.0.1-SNAPSHOT.jar /app/ioj-0.0.1-SNAPSHOT.jar

EXPOSE 8121

# Run the web service on container startup.
CMD ["java", "-jar", "/app/ioj-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]