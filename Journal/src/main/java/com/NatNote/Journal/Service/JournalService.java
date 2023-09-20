package com.NatNote.Journal.Service;

import com.NatNote.Journal.Entities.Entry;
import com.NatNote.Journal.Repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalService {
    @Autowired
    private JournalRepository journalRepository;

    public Entry createEntry (Entry entry){
        return journalRepository.save(entry);

    }
}
