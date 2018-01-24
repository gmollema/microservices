# microservices

This project contains a limits-service microservice. 
This service is a RESTful web service which can be called to retrieve the mimimum and maximum value (uri /limits)
The goal of this project is to:

1 Centralize the properties of all (instances of) miscroservices for all environments in order to improve maintainability

Process of centralizing the properties (minimum and maximum values)
- 1st step: hardcoded: In the first place directly hard coded from the RESTful controller
- 2nd step: read from application.properties: They were moved to the application.properties, a new Configuration class with @ConfigurationProperties annotation read them (Spring boot way) and the Rest Controller used this Configuration class to retrieve the values.
- 3rd step: Create Git repo for storing properties of the limits-service (and all other future microservices).
- TODO - 4th step: Implement a Spring cloud service and connect to the Git microservices properties repo
- TODO - 5th step: Connect the Limit Service to the Spring cloud service
- TODO - 6th step: Profile environment fror the property files and limits-service service.
