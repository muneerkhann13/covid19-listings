package com.democracy.sample.service.impl;

import com.democracy.sample.datasource.model.Category;
import com.democracy.sample.datasource.model.City;
import com.democracy.sample.datasource.repository.slave.CategorySlaveRepository;
import com.democracy.sample.datasource.repository.slave.CitySlaveRepository;
import com.democracy.sample.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategorySlaveRepository categorySlaveRepository;

    public CategoryServiceImpl(CategorySlaveRepository categorySlaveRepository) {
        this.categorySlaveRepository = categorySlaveRepository;
    }

    private static List<Category> categoryList;


    @Override
    public List<Category> getAll() {

        if(categoryList == null || categoryList.isEmpty()){
            categoryList = categorySlaveRepository.findAll();
        }
        return categoryList;
    }
}
