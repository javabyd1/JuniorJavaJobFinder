package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018-01-28.
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
