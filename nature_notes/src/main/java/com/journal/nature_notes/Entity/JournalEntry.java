package com.journal.nature_notes.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private Date date;
    //need to figure out how to incoperate location
    @Lob
    private byte [] image;


    public JournalEntry() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
