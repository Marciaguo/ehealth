#!/bin/bash

# Git pull the latest source code
#git pull origin dev:dev

# Maven build the source code to JAR
mvn clean install

# Login to IBM Container Registry
ibmcloud cr login
# delete the exist image
ibmcloud cr image-rm registry.ng.bluemix.net/cfs-registry/tcvi-user-management

# Build and push image to IBM Container Registry
docker build --tag registry.ng.bluemix.net/cfs-registry/tcvi-user-management:latest .
docker push registry.ng.bluemix.net/cfs-registry/tcvi-user-management:latest

# create or update the pod and service to Kubernete cluster
kubectl apply -f manifests/kube.deploy.yml
