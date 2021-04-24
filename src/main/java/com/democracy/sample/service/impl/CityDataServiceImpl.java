package com.democracy.sample.service.impl;

import com.democracy.sample.datasource.model.City;
import com.democracy.sample.datasource.repository.slave.CitySlaveRepository;
import com.democracy.sample.service.CityDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityDataServiceImpl implements CityDataService {


    private final CitySlaveRepository citySlaveRepository;

    public CityDataServiceImpl(CitySlaveRepository citySlaveRepository) {
        this.citySlaveRepository = citySlaveRepository;
    }

    private static List<City> cityList;

    @Override
    public List<City> getAllCities() {

        if(cityList == null || cityList.isEmpty()){
            cityList =  citySlaveRepository.findAll();
        }
        return cityList;
    }
}
