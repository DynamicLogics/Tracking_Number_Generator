# Tracking-Number-Generation
Repository related to new tracking number generation

#To take the docker image pull into your local docker system, run the below command
docker pull ssadoc123/dd0522fafb2c

#To the acces the docker image using the URL instead of taking the pull access the below URL: https://hub.docker.com/r/ssadoc123/dd0522fafb2c

#To run the single container image, run the command once you pulled the docker image http://localhost:8080/tng/next-tracking-number or http://localhost:8080/tng/<pulled-docker-image-id>

#To create new image file from the code repository, run the command: docker build . -t build/tracking-number-gen 

#To run the docker-compose file, run the command: docker-compose up -d (It will start the multiple continers for load-balancing as well)

#Github URL: https://github.com/DynamicLogics/Tracking_Number_Generator.git


#API access related information

1] This project runs on localhost 8080 by default and have embedd tomcat server running, thus you can direct import project into eclipse and run it, use the following URL to access it locally:
http://localhost:8080/tng/next-tracking-number

2] If you are running the project using the single docker container use following URL:
http://localhost:8080/tng/next-tracking-number

3] If you are running the docker compose image for loadbalancing use the following command:
http://localhost:8080/tng/next-tracking-number

#API request body:
use the following API parameter to pass for generating new tracking ID's:
{
	"origin_country_id":"MY",
	"destination_country_id":"ID",
	"weight":"1.234",
	"created_at":"2018-11-20T19:29:32+08:00",
	"customer_id":"de619854-b59b-425e-9db4-943979e1bd49",
	"customer_name":"RedBox Logistics",
	"customer_slug":"redbox-logistics"
}

#API response:
With respect to above request you should get the following similar response:
{
    "tracking_number": "9H0WQA9CCDAXRY",
    "created_at": "2024-12-02T10:09:00.808Z",
    "message": "Traking ID generated successfully..."
}
