## URL_Hit_Counter 
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run User Management System 
 * Download the source code and import in intellijIDEA.
 * Go to localhost:8080/
 * Type endpoints in url
 
### In this counter feature there is - 
 * count, variable to count url hits
 
when the user will hit the url he will get the number of counts hit - 
##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/v1/Visitor-count-app/count
  * The value of the count will keep incrementing as long as the user keeps hitting the URL.

![hitCount1](https://user-images.githubusercontent.com/117101699/217328828-1a9735a6-69fa-4db3-a51f-388e2a11c6df.png)


### In addition, we also have the username and counts hit when the particular user hits the URL he will get a number of counts with the username.

In this we have -
 * A HashMap of username and count
##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/v1/Visitor-count-app/countby/visitor/{username}
 
 ![countbyname](https://user-images.githubusercontent.com/117101699/217330720-3e9da0d7-4c82-4e92-b0a2-de5fcca702f9.png)

### Note
* You can change server port by setting properties in application.properties file i.e.

        server.port=8081
 
