# Tracking-Number-Generation
Repository related to new trackinng number generation

#To take the docker image pull into your local docker system, run the below command
docker pull ssadoc123/dd0522fafb2c

#To the acces the docker image using the URL instead of taking the pull access the below URL: https://hub.docker.com/r/ssadoc123/dd0522fafb2c

#To run the single container image, run the command once you pulled the docker image http://localhost:8080/tng/next-tracking-number or http://localhost:8080/tng/<pulled-docker-image-id>

#To create new image file from the code repository, run the command: docker build . -t build/tracking-number-gen 

#To run the docker-compose file, run the command: docker-compose up -d (It will start the multiple continers for load-balancing as well)
