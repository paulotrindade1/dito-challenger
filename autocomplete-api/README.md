# autocomplete API
API for dito challenger
## Website example
Autocomplete website: http://localhost:8080/

## Rest API - endpoints
  GET method to suggestions: http://localhost:8080/autocompleteAPI/suggestion
  
    Example: http://localhost:8080/autocompleteAPI/suggestion?keyword=sh
    
  POST method to add an event: http://localhost:8080/autocompleteAPI/addEvent
  
    JSON example:
    { 
      event: "shopping",
      timestamp: "2019-12-11T11:17:17.905-04:00"
    }

## Database
  - MySQL database was used to storage events from users.
  - database name: db_event
  - You can use the data.sql file to populate the database
  
## IDE, technologies and tools                  
  - IDE: IntelliJ IDEA
  - Spring boot and Thymeleaf
  - Postman was used for testing
  
## Running
  
  After created the database, you can run this application from your IDE as a simple Java application or you can execute it by running the following command on target directory after maven install:
  
    $ java -jar target/APIcoletora-0.0.1-SNAPSHOT.jar
  
  

