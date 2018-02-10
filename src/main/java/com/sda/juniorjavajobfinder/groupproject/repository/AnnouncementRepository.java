package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.model.Devskills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

    List<Announcement> findByCity_Id (Long id);

    List<Announcement> findByDevskills_Id (Long id);
    List<Announcement> findByDevskills_IdAndCity_Id (Long devSkillId, Long CityId);

    List<Announcement> findByDevskills_Name(String name);
    List<Announcement> findByDevskills_NameAndCityName(String devName, String cityName);
}
