package com.idegroup.idekriyaStore.model;

/**
 * This class model entity of Debit Account:
 * 1. The id of the Debit transaction
 * 2. The AccountType name
 * 3. The Amount of value the account has in the transaction
 * 4. Transaction id
 * */

public class DebitAcc {

    /*Attributes:*/

    private Long id;
    private String accountName;
    private String description;
    private Long nominal;
    private Transaction transaction;

    /*Default constructor:*/

    public DebitAcc() {
    }

    /*Getter and Setter:*/

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

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
}
