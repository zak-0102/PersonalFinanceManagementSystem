//Service interface of transaction entity

package com.example.mybank.service;
import java.util.List;
import com.example.mybank.model.Transaction;

public interface ITransactionService {
    public List<Transaction> getAllTransactions();

    public Transaction getTransactionById(String id);

    public Transaction addTransaction(Transaction transaction);

    public Transaction updateTransaction(Transaction transaction);

    public void deleteTransactionById(String id);
}

