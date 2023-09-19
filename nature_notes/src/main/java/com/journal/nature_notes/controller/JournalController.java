package com.journal.nature_notes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JournalController {

    @GetMapping("/getMsg")
    public String getMsg () {
        return "Sample msg";
    }
}
