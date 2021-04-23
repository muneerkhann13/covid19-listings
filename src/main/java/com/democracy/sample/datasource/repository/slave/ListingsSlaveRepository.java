package com.democracy.sample.datasource.repository.slave;

import com.democracy.sample.datasource.model.Listings;
import org.springframework.data.repository.CrudRepository;

public interface ListingsSlaveRepository extends CrudRepository<Listings,Long> {
}
