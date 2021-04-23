package com.democracy.sample.datasource.repository.master;

import com.democracy.sample.datasource.model.Listings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ListingsMasterRepository extends PagingAndSortingRepository<Listings, Long> {

	List<Listings> findByCategoryAndStateAndCity(String category, String state, String city, Pageable pageable);

	List<Listings> findByCategoryAndState(String category, String state, String city, Pageable pageable);

	List<Listings> findByCategoryAndCity(String category, String state, String city, Pageable pageable);

}
