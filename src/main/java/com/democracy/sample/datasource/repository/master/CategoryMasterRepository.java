package com.democracy.sample.datasource.repository.master;

import com.democracy.sample.datasource.model.Category;
import com.democracy.sample.datasource.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryMasterRepository extends JpaRepository<Category,Long> {
}
