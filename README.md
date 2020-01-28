# Dito challenger
'Autocomplete' and 'Shopping Timeline' API's for dito challenger


# shoppingTimeline API
## Rest API - endpoint
  GET method to get the timeline: http://localhost:3000/timeline
 
 
# autocomplete API
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
  

## IDE, technologies and tools                  
  - IDE: IntelliJ IDEA
  - Spring boot and Docker
  - Insomnia was used for testing
  
## Running
  You can run these applications by running the following command on git repository:
  
    $ docker-compose up
 
