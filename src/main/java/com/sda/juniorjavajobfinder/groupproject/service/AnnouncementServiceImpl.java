package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnoucementService;
import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnoucementService {

    @Autowired
    private AnnouncementRepository annoucementRepository;

    @Override
    public List<Announcement> getAllAnnoucement() {
        return annoucementRepository.findAll();
    }

    @Override
    public Announcement createAnnoucement(Announcement annoucement) {
        return annoucementRepository.save(annoucement);
    }

    @Override
    public Announcement updateAnnoucement(Announcement annoucement) {
        return annoucementRepository.save(annoucement);
    }

    @Override
    public void deleteAnnoucement(Announcement annoucement) {
        annoucementRepository.delete(annoucement);
    }
}
