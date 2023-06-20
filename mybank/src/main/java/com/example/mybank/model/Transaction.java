//Model class of Transaction entity with mongoDB annotations

package com.example.mybank.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
@lombok.Getter
@lombok.Setter
@lombok.ToString
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Transaction {
    @Id
    private String id;
    private String transactionType;
    private Date transactionDate;
    private double amount;
    private String description;
    private double balance;
}