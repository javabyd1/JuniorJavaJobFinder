package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

    List<Announcement> findByCity_Id (Long id);

    List<Announcement> findByDevskills_Id (Long id);
    List<Announcement> findByDevskills_IdAndCity_Id (Long devSkillId, Long CityId);

    List<Announcement> findByDevskills_Name(String name);
    List<Announcement> findByDevskills_NameAndCityName(String devName, String cityName);

    List<Announcement> findByCity_Name(String name);

}
