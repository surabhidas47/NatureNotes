package com.journal.nature_notes.repository;

import com.journal.nature_notes.Entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface journalRepository extends JpaRepository<Entry,Long> {
}
