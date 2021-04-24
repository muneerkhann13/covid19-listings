package com.democracy.sample.datasource.repository.slave;

import com.democracy.sample.datasource.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitySlaveRepository extends JpaRepository<City,Long> {
}
