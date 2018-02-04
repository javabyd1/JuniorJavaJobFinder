package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnouncementService;
import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.model.City;
import com.sda.juniorjavajobfinder.groupproject.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementRepository announcementRepository;

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

    public List<Announcement> getCityAnnouncement(Long id) {
        return announcementRepository.findByCity_Id(id);
    }
}
