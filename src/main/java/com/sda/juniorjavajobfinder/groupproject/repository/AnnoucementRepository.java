package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.Annoucement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnoucementRepository extends JpaRepository<Annoucement, Long> {
}
