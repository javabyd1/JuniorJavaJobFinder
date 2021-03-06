package com.sda.juniorjavajobfinder.groupproject.service;


import com.sda.juniorjavajobfinder.groupproject.interfaces.AnnouncementService;
import com.sda.juniorjavajobfinder.groupproject.model.Announcement;

import com.sda.juniorjavajobfinder.groupproject.model.City;

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

    public List<Announcement> getOffersByDevskillsAndCities(String devName, String cityName){
        return announcementRepository.findByDevskills_NameAndCityName(devName,cityName);
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

    public List<Announcement> getCityAnnouncement(Long id) {
        return announcementRepository.findByCity_Id(id);
    }
    public List<Announcement> getCityAnnouncementByName(String name) {
        return announcementRepository.findByCity_Name(name);
    }
    public List<Announcement> getDevSkillsAnnouncement(Long id) {
        return announcementRepository.findByDevskills_Id(id);
    }

    public List<Announcement> getCityOffersByDevskillsAndCities (Long devSkillId, Long cityId){
        return announcementRepository.findByDevskills_IdAndCity_Id(devSkillId, cityId);
    }

}
