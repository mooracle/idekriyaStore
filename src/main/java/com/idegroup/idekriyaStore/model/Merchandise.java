package com.idegroup.idekriyaStore.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * This class represents and entity of Merchandise*/

@Entity
public class Merchandise {

    /*attributes of Merchandise:*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob /*<- Large object to store image files*/
    private byte[] bytes; /*<- to denotes the size of the image of merchandise*/

    private String name;
    private String description;

    @ManyToOne /*<- this mapped to Category*/
    private Category category;

//    private LocalDateTime dateUpdated = LocalDateTime.now(); /*<- in the mean time we deactivate this first*/
    private String admin = "You";
    private String hash;

    /*default constructor:*/
    public Merchandise() {}

    /*TODO: yan - please consider the need of time counter is it necessary or not? if it is then we set the timer*/

    /*methods:*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
