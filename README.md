# Weather API

This is a solution for the Weather API project on https://roadmap.sh/projects/weather-api-wrapper-service

## Requirements

* Java 23 or higher

## How to use

This is a Spring Boot Application with a maven wrapper so you can easily run it with:

```bash
./mvnw spring-boot:run
```
## Endpoints (Assuming localhost:8080):

localhost:8080/api/weather?lat={latitude}&lon={longitude}

Retrieves today's weather status for the specified coordinates in JSON format.

Example:
http://localhost:8080/api/weather?lat=35.68&lon=51.38
