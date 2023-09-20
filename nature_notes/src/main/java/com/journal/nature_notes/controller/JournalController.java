package com.journal.nature_notes.controller;

import com.journal.nature_notes.Entity.Entry;
import com.journal.nature_notes.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalController {

    @Autowired
    private JournalService journalService;

    @PostMapping ("/createEntry")
    public Entry createEntry(@RequestBody Entry entry){
        return journalService.createEntry(entry);

    }


}
