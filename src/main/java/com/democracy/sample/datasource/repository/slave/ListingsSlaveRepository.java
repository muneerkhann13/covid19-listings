package com.democracy.sample.datasource.repository.slave;

import com.democracy.sample.datasource.model.Listings;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ListingsSlaveRepository extends PagingAndSortingRepository<Listings, Long> {

	List<Listings> findByCategoryAndStateAndCity(String category, String state, String city, Pageable pageable);

	List<Listings> findByCategoryAndState(String category, String state, String city, Pageable pageable);

	List<Listings> findByCategoryAndCity(String category, String state, String city, Pageable pageable);

}
