package com.idegroup.idekriyaStore.model;

import java.util.ArrayList;
import java.util.List;

/**
 * this class define */
public class Category {

    /*the attributes for a Category:*/

    private Long id;
    private String name;
    private List<Merchandise> merchandises = new ArrayList();

    /*Default constructor:*/

    public Category() {}

    /*methods:*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Merchandise> getMerchandises() {
        return merchandises;
    }
}
