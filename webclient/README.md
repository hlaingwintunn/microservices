* Creating the consumer service
	* Create Consumers to find the Producer Service registered with Discovery Service at Step 1.
	* @EnableDiscoveryClient annotation also allows us to query Discovery server to find miroservices.
	
*Now run this consumer service application as Spring Boot application and after few seconds refresh browser to the home page of Eureka Discovery Server at http://localhost:1111/ in previous Step 1. Now one more Service registered to the Eureka registered instances with Service Name “ACCOUNTS-WEB” *


* Lets open web application which is a consumer of the account microservice registered at Eureka Discovery Server.
	* http://localhost:8080/
	* http://localhost:8080/accountList
	* http://localhost:8080/accountDetails?number=5115
	
* Load Balancing with Ribbon
```
Our smart RestTemplate automatically integrates two Netflix utilities

	* Eureka Service Discovery
	* Ribbon Client Side Load Balancer
	
___Eureka___ return the URL of all available instances
___Ribbon___ determine the best available service too use


Just inject the load balanced RestTemplate automatic lookup by logical service-name
```