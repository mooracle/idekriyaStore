package com.idegroup.idekriyaStore.model;

/**
 * This class model the entity of Credit Account:
 * 1. the Credit id
 * 2. The transaction id of the credit related to*/

public class CreditAcc {

    /*Attributes:*/

    private Long id;
    private String accountName;
    private String description;
    private Long nominal;
    private Transaction transaction;

    /*default constructor:*/

    public CreditAcc() {
    }

    /*Getter and Setter:*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getNominal() {
        return nominal;
    }

    public void setNominal(Long nominal) {
        this.nominal = nominal;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
