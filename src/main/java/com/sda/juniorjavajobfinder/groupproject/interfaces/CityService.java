package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.City;

import java.util.List;

public interface CityService {
    List<City> getAllCity();
    City createCity(City city);
    City updateCity(City city);
    void deleteCity(City city);

}
