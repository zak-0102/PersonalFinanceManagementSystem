//Implement the transaction service class

package com.example.mybank.service;

import java.util.List;

import com.example.mybank.model.Transaction;
import com.example.mybank.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements ITransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


   //GetAllTransaction method with proper error handling
    @Override
    public List<Transaction> getAllTransactions() {
        try {
            return transactionRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //GetTransactionById method with proper error handling
    @Override
    public Transaction getTransactionById(String id) {
        try {
            return transactionRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //AddTransaction method with proper error handling
    @Override
    public Transaction addTransaction(Transaction transaction) {
        try {
            return transactionRepository.save(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //UpdateTransaction method with proper error handling
    @Override
    public Transaction updateTransaction(Transaction transaction) {
        try {
            return transactionRepository.save(transaction);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //DeleteTransactionById method with proper error handling
    @Override
    public void deleteTransactionById(String id) {
        try {
            transactionRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}