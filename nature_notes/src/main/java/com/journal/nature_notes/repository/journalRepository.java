package com.journal.nature_notes.repository;

import com.journal.nature_notes.Entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface journalRepository extends JpaRepository<JournalEntry,Long> {
}
