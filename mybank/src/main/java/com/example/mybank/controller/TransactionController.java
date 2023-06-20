//Implement the transaction controller class

package com.example.mybank.controller;

import java.util.List;

import com.example.mybank.model.Transaction;

import com.example.mybank.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")

public class TransactionController {

//initialize transaction service


private TransactionService transactionService;

@Autowired
private TransactionController(TransactionService transactionService) {
    this.transactionService = transactionService;
}

//get all transactions method with proper error handling
@GetMapping("/transactions")
public List<Transaction> getAllTransactions() {
    try {
        return transactionService.getAllTransactions();
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return null;
    }
}

    //get transaction by id method with proper error handling

    @GetMapping("/transactions/{id}")

    public Transaction getTransactionById(@PathVariable String id) {
        try {
            return transactionService.getTransactionById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //add transaction method with proper error handling

    @PostMapping("/transactions")

    public Transaction addTransaction(@RequestBody Transaction transaction) {
        try {
            return transactionService.addTransaction(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    //update transaction method with proper error handling

    @PutMapping("/transactions")

    public Transaction updateTransaction(@RequestBody Transaction transaction) {
        try {
            return transactionService.updateTransaction(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    //delete transaction by id method with proper error handling

    @DeleteMapping("/transactions/{id}")

    public void deleteTransactionById(@PathVariable String id) {
        try {
            transactionService.deleteTransactionById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}

