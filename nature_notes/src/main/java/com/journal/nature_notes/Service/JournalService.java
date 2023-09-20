package com.journal.nature_notes.Service;

import com.journal.nature_notes.Entity.Entry;
import com.journal.nature_notes.repository.journalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalService {

    @Autowired
    private journalRepository journalRepository;

    public Entry createEntry (Entry entry){
        return journalRepository.save(entry);

    }

}
