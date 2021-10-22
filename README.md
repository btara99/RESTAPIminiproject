
# Bahir REST-API project

- [Bahir REST-API project](#bahir-rest-api-project)
	- [Project Purpose](#project-purpose)
	- [Guide](#guide)
		- [REST API plan](#rest-api-plan)
			- [Controllers](#controllers)
			- [Entities](#entities)
			- [Repositories](#repositories)
			- [DTO](#dto)
			- [Mapping](#mapping)
			- [Exceptions](#exceptions)
	- [Design process](#design-process)
		- [Agile](#agile)
		- [Retrospective](#retrospective)
	- [Main Java skills demonstrated (outside all the basics)](#main-java-skills-demonstrated-outside-all-the-basics)
	- [GIT REPO LINKS](#git-repo-links)

### Project Purpose
**To create my very own REST API using the Northwind database using the Spring framework**

## Guide
- Make sure the correct naming conventions are used as seen below (some endpoints will allow just "id=" rather then the specific id)

![MainNaming](./readMeImages/mainNamingForTable.png)

![NamingSpecific](./readMeImages/mainNaming.png)

- The output for entries is seen below(This example shows a specific query as seen above)

![allEntries](./readMeImages/outputForSpecificQuery.png)

- If you search for a value that does not exist you will get an empty array as seen below

![notExists](./readMeImages/inputIfSearchDontExists.png)

![notExistsoutput](./readMeImages/outputIfSearchDontExists.png)

- If you search for a endpoint or return an exception instead of getting the white label page you will receive the below exception

![exceptionInput](./readMeImages/inccorectInput.png)

![exceptionOutput](./readMeImages/exceptionImage.png)

### REST API plan

#### Controllers
- [x] Display the correct search
- [x] Minimal amount of code
- [x] Make sure a good amount of endpoints are included
- [x] Use the DTO and mapping for display

#### Entities
- [x] Make sure the columns are correct
- [x] Make sure I can retrieve data from the class
- [x] Return the correct information from the getters

#### Repositories
- [x] Make sure it extends the JPA Repositories
- [x] Allow for use elsewhere

#### DTO
- [x] Implement a DTO for each Entity
- [x] Only use the getters and setters that the user should see

#### Mapping
- [x] Correctly map the JSON from repos to the DTO
- [x] Set each DTO parameter and return the whole DTO

#### Exceptions
- [x] Handle exceptions when the user inputs a wrong endpoint
- [x] Display a message instead of the White label error

## Design process
#### Agile
- Individuals and Interactions Over Processes and Tools
- Working Software Over Comprehensive Documentation
- Customer Collaboration Over Contract Negotiation
- Responding to Change Over Following a Plan

I stuck to the 4 agile principles and also incorporated the SOLID principals to ensure that my development would be easy to maintain and expand for future use.

#### Retrospective
First my planning was better this project but I did waste some time with having wrong output but because I stuck to the SOLID principles it made making changes easy and effective. My table did not include any foreign keys so that did limit the search's I could implement, but it was still good overall.

I did well to implement all the requirements this helped build on my knowledge in which I have learnt so far and made me more comfortable using large scale programming tools.

Overall this project was a success as I felt I have learnt a lot and the requirements were met to a great standard.

## Main Java skills demonstrated (outside all the basics)
- OOP
- Design Patterns (DTO)
- SOLID Principles
- Spring
- REST API
- JPA
- HTTP
- Exception handling
- JSON
- Postman

## GIT REPO LINKS

**REPO** https://github.com/btara99/RESTAPIminiproject
