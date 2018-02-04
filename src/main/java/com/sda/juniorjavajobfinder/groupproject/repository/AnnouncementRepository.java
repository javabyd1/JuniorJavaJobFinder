package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
