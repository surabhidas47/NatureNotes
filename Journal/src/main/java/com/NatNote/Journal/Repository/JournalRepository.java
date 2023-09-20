package com.NatNote.Journal.Repository;

import com.NatNote.Journal.Entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<Entry,Long> {
}
