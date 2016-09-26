Framework Training Template Microservice
========================================
Overview
--------
This is a very simple micro service that can be built and packaged into a docker image. You should use this micro service as a template for building your own micro services.

How to build and run this microservice
--------------------------------------

1. Compile and package the application

   ```
   $ mvn clean package
   ```
2. Build the docker image

   ```
   $ docker build -t template-microservice .
   ```
3. Run the container

   ```
   $ docker run -p 8080:8080 template-microservice
   ```
4. Test the micro service

   ```
   $ curl http://localhost:8080
   Success! The Framework Training template microservices is up and running
   ```
