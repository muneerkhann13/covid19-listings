package com.democracy.sample.datasource.repository.master;

import com.democracy.sample.datasource.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityMasterRepository extends JpaRepository<City, Long> {

}
