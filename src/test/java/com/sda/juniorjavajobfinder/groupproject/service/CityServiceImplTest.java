package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.model.City;
import com.sda.juniorjavajobfinder.groupproject.repository.CityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class CityServiceImplTest {
    @Mock
    private CityRepository cityRepository;

    @InjectMocks
    private CityServiceImpl cityService;

    @Test
    public void createCity() {
        City city = new City();
        //When
        cityService.createCity(city);

        //then
        BDDMockito.then(cityRepository).should().save(city);
    }

    @Test
    public void getAllCity() {
        //when
        cityService.getAllCity();

        //then
        BDDMockito.then(cityRepository).should().findAll();
    }

}