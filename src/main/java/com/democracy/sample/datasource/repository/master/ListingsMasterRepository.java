package com.democracy.sample.datasource.repository.master;

import com.democracy.sample.datasource.model.Listings;
import org.springframework.data.repository.CrudRepository;

public interface ListingsMasterRepository extends CrudRepository<Listings,Long> {
}
