package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.model.Annoucement;
import com.sda.juniorjavajobfinder.groupproject.repository.AnnoucementRepository;
import com.sda.juniorjavajobfinder.groupproject.service.AnnoucementServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AnnoucementServiceImplTest {

    @Mock
    private AnnoucementRepository annoucementRepository;

    @InjectMocks
    private AnnoucementServiceImpl annoucementService;

    @Test
    public void createAnnoucement (){
        Annoucement annoucement = new Annoucement();
        //When
        annoucementService.createAnnoucement(annoucement);
        //then
        BDDMockito.then(annoucementRepository).should().save(annoucement);
    }
    @Test
    public void getAllAnnoucment(){
        annoucementService.getAllAnnoucement();

        //then
        BDDMockito.then(annoucementRepository).should().findAll();
    }


}