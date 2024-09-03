#!/bin/bash

cd ..
echo "Changing directory: go to project"

mvn clean package -DskipTests=true
echo "Cleaning package ... OK"

mvn clean install -DskipTests=true
echo "Building package ... OK"

docker build -t lut-discovery-service:dev-1.0.0 --force-rm=true .
echo "Building image ... OK"