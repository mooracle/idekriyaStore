package com.idegroup.idekriyaStore.model;

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
    //TODO: yan - please define more clear definition of debitAcc and creditAcc is it String or String[]?
    private String debitAcc;
    private String creditAcc;
    //TODO: yan - is it better if we defined credit and debit in different class to define the transaction better?
    private Long debitVal;
    private Long creditVal;

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

    public Long getDebitVal() {
        return debitVal;
    }

    public void setDebitVal(Long debitVal) {
        this.debitVal = debitVal;
    }

    public Long getCreditVal() {
        return creditVal;
    }

    public void setCreditVal(Long creditVal) {
        this.creditVal = creditVal;
    }
}
