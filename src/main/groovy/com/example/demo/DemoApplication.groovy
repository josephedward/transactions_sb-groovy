// A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
// A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction
// (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
// Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.
// ·       Solve using Spring Boot
// ·       Create a RESTful endpoint
// ·       Make up a data set to best demonstrate your solution
// ·       Check solution into GitHub

package com.example.demo

// import org.springframework.boot.SpringApplication
// import org.springframework.boot.autoconfigure.SpringBootApplication

// @SpringBootApplication
class DemoApplication {

    static void main(String[] args) {        

        def file = new File('transactions.csv')
        def rows = file.readLines().tail()*.split(',')
        int total = rows.size()
        println "Total number of transactions: $total"

        def customerScores = [:]

        for (x in rows) {
            def customer = x[0]
            def month = x[1]
            def amount = x[2].toInteger()
            def points = 0

            if (amount > 100) {
                points += (amount - 100) * 2
            }
            if (amount > 50) {
                points += (amount - 50)
            }


            if (customerScores[customer] == null) {
                customerScores[customer] = 0
            }
            customerScores[customer] = customerScores[customer]+points

        }

        println "Customer Scores: $customerScores"


    }


}