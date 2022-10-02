package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class transactionController {

    @RequestMapping("/transactions")
    String transactions() {
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

        return "Customer Scores: $customerScores"
    }
}