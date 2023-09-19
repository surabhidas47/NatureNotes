package com.journal.nature_notes.controller;

import com.journal.nature_notes.Entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JournalController {

    @GetMapping("/journalEntry")
    public List<JournalEntry> getJournalEntry () {
        return (List<JournalEntry>) journalRe
    }
}
