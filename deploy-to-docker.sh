#!/bin/bash

# Git pull the latest source code
git pull origin dev:dev

# Maven build the source code to JAR
mvn clean install

# Build and run image to Container locally
docker build --tag tcvi-user-management:latest .
docker stop tcvi-user-management
docker rm tcvi-user-management
docker run -m 512M -p 8001:8001 --name tcvi-user-management --link mysql5.7:cfs-mysql-service -d tcvi-user-management:latest
