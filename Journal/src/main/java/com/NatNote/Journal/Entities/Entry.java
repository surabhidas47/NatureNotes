package com.NatNote.Journal.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
//    private Date date;
//    private String location;
//
//    @Lob
//    private byte [] image;


    public Entry() {
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public byte[] getImage() {
//        return image;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public void setImage(byte[] image) {
//        this.image = image;
//    }
}
