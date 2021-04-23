package com.democracy.sample.datasource.dataservice.impl;

import com.democracy.sample.datasource.dataservice.ListingsDataService;
import com.democracy.sample.datasource.model.Listings;
import com.democracy.sample.datasource.repository.master.ListingsMasterRepository;
import com.democracy.sample.datasource.repository.slave.ListingsSlaveRepository;
import com.democracy.sample.dto.SearchListingsDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DefaultListingsDataService implements ListingsDataService {

    private final ListingsMasterRepository listingsMasterRepository;
    private final ListingsSlaveRepository listingsSlaveRepository;

    public DefaultListingsDataService(ListingsMasterRepository listingsMasterRepository, ListingsSlaveRepository listingsSlaveRepository) {
        this.listingsMasterRepository = listingsMasterRepository;
        this.listingsSlaveRepository = listingsSlaveRepository;
    }

    @Override
    public List<Listings> search(SearchListingsDto dto) {
        return null;
    }
}
