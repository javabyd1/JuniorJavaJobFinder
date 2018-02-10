package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.model.Announcement;
import com.sda.juniorjavajobfinder.groupproject.repository.AnnouncementRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AnnouncementServiceImplTest {

    @Mock
    private AnnouncementRepository annoucementRepository;

    @InjectMocks
    private AnnouncementServiceImpl annoucementService;

    @Test
    public void createAnnoucement (){
        Announcement announcement = new Announcement();
        //When
        annoucementService.createAnnouncement(announcement);
        //then
        BDDMockito.then(annoucementRepository).should().save(announcement);
    }
    @Test
    public void getAllAnnoucment(){
        annoucementService.getAllAnnouncement();

        //then
        BDDMockito.then(annoucementRepository).should().findAll();
    }


}