package com.idegroup.idekriyaStore.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will define the model entity Transaction
 * Early stage will consist of basic definition of what transaction is
 * It consist of Debit,Credit posts
 * the numeric terms of Debit and Credit must also defined.
 * */

public class Transaction {

    /*Attributes:*/

    private Long id;
    private String description;
    private List<DebitAcc> debits = new ArrayList<>();
    private List<CreditAcc> credits = new ArrayList<>();

    /*Default Constructor:*/

    public Transaction() {}

    /*Methods*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DebitAcc> getDebits() {
        return debits;
    }

    public List<CreditAcc> getCredits() {
        return credits;
    }
}
