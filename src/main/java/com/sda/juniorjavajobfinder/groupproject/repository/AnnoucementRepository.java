package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnoucementRepository extends JpaRepository<Announcement, Long> {
}
