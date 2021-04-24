package com.democracy.sample.service.impl;

import com.democracy.sample.datasource.model.City;
import com.democracy.sample.datasource.repository.slave.CitySlaveRepository;
import com.democracy.sample.service.CityDataService;

import java.util.List;

public class CityDataServiceImpl implements CityDataService {

    private final CitySlaveRepository citySlaveRepository;

    public CityDataServiceImpl(CitySlaveRepository citySlaveRepository) {
        this.citySlaveRepository = citySlaveRepository;
    }

    private static List<City> cityList;

    @Override
    public List<City> getAllCities() {

        if(cityList.isEmpty()){
            cityList =  citySlaveRepository.findAll();
        }
        return cityList;
    }
}
