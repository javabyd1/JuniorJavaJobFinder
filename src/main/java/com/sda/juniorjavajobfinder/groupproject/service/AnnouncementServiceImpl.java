package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnouncementService;
import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.model.Devskills;
import com.sda.juniorjavajobfinder.groupproject.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementRepository announcementRepository;

    public List<Announcement> getDevskillsByName(String devName){
        return announcementRepository.findByDevskills_Name(devName);
    }

//    public Announcement getDevskillsByName(String devName) {
//        Optional<Announcement> skills = announcementRepository.findByDevskills_Name(devName);
//        return skills.get();
//
//    }


    @Override
    public List<Announcement> getAllAnnouncement() {
        return announcementRepository.findAll();
    }

    @Override
    public Announcement createAnnouncement(Announcement annoucement) {
        return announcementRepository.save(annoucement);
    }

    @Override
    public Announcement updateAnnouncement(Announcement annoucement) {
        return announcementRepository.save(annoucement);
    }

    @Override
    public void deleteAnnouncement(Announcement annoucement) {
        announcementRepository.delete(annoucement);
    }
}
