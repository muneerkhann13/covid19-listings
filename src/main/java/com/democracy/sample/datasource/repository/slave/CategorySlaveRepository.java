package com.democracy.sample.datasource.repository.slave;

import com.democracy.sample.datasource.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorySlaveRepository extends JpaRepository<Category, Long> {

}
