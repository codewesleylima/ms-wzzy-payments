# Multi-stage build for ms-payments
# Stage 1: Build
FROM eclipse-temurin:21-jdk as builder
WORKDIR /app
COPY . .
RUN ./gradlew build -x test

# Stage 2: Runtime
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8005
ENTRYPOINT ["java", "-jar", "app.jar"]
