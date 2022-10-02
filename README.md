# transactions_sb-groovy

This is a sample project that demonstrates how to use Spring Boot to implement a transactional flow that takes a list of transactions and returns a list of transactions that have been processed.

## The Assignment: 

 A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
 A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction
 (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
 Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.
 ·       Solve using Spring Boot
 ·       Create a RESTful endpoint
 ·       Make up a data set to best demonstrate your solution
 ·       Check solution into GitHub

### Implementation Notes

* Simplest possible implementation of a RESTful endpoint
* The flow is implemented using a Groovy DSL.
* Calculations are done in a Groovy script when the /transactions endpoint is called.


### Running the Application

* Clone the repository
* Run `gradle build`
* Run `gradle bootRun`
* Open a browser and navigate to `http://localhost:8080/transactions`

### Preqrequisites

* Java 8
* Gradle 2.3+

### References

* [Spring Boot](http://projects.spring.io/spring-boot/)
* [Groovy](http://groovy-lang.org/)

### License

Apache 2.0

### Author

[Joseph Edward] (josephedward.vercel.app)





