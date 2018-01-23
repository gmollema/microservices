# microservices

This project contains a limits-service microservice. 
This service is a RESTful web service which can be called to retrieved the mimimum and maximum value (uri /limits)

These properties 
- 1st step: hardcoded: In the first place directly hard coded from the RESTful controller
- 2nd step: read from application.properties: They were moved to the application.properties, a new Configuration class with @ConfigurationProperties annotation read them (Spring boot way) and the Rest Controller used this Configuration class to retrieve the values.
- TODO - 3rd step: Create Git repo for storing properties of all microservices.
- TODO - 4th step: Profile the property values for different environments
- TODO - 5th step: Implement a Spring cloud service and connect to the Git microservices properties repo
- TODO - 6th step: Connect the Limit Service to the Spring cloud service
