package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.CityService;
import com.sda.juniorjavajobfinder.groupproject.model.City;
import com.sda.juniorjavajobfinder.groupproject.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCity() {
        return cityRepository.findAll();
    }

    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(City city) {
        cityRepository.delete(city);
    }
}