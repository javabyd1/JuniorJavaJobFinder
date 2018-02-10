package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.model.Devskills;
import com.sda.juniorjavajobfinder.groupproject.repository.DevskillsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class DevskillsServiceImplTest {
    @Mock
    private DevskillsRepository devskillsRepository;

    @InjectMocks
    private DevskillsServiceImpl devskillsService;

    @Test
    public void createDevskills (){
        Devskills devskills = new Devskills();
        //When
        devskillsService.createDevskills(devskills);
        //then
        BDDMockito.then(devskillsRepository).should().save(devskills);
    }
    @Test
    public void getAllDevskills(){
        devskillsService.getAllDevskills();
        //then
        BDDMockito.then(devskillsRepository).should().findAll();
    }

}