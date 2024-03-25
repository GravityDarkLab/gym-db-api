# gym-db-api


[![Java CI](https://github.com/GravityDarkLab/gym-db-api/actions/workflows/java-ci.yml/badge.svg?branch=main&event=push)](https://github.com/GravityDarkLab/gym-db-api/actions/workflows/java-ci.yml)
[![Docker Build and Push](https://github.com/GravityDarkLab/gym-db-api/actions/workflows/docker-build-push.yml/badge.svg?branch=main&event=push)](https://github.com/GravityDarkLab/gym-db-api/actions/workflows/docker-build-push.yml)
```bash
docker-compose up --build
```
```bash
docker pull achraflab/gym-db:latest
```
```bash
docker run -e SPRING_DATA_MONGODB_DATABASE='yourDatabaseName' -e SPRING_DATA_MONGODB_URI='yourMongoDbUri' -p 8081:8081 gym-db --name gym-db
```

