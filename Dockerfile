FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

COPY src ./src

ARG SPRING_DATA_MONGODB_DATABASE
ARG SPRING_DATA_MONGODB_URI

ENV SPRING_DATA_MONGODB_DATABASE=$SPRING_DATA_MONGODB_DATABASE
ENV SPRING_DATA_MONGODB_URI=$SPRING_DATA_MONGODB_URI

CMD ["./mvnw", "spring-boot:run"]