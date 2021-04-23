package com.democracy.sample.service.impl;

import com.democracy.sample.convert.SearchListingConverter;
import com.democracy.sample.datasource.dataservice.ListingsDataService;
import com.democracy.sample.datasource.model.Listings;
import com.democracy.sample.dto.SearchListingsDto;
import com.democracy.sample.response.SearchListingsResponse;
import com.democracy.sample.service.SearchListingsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSearchListingsService implements SearchListingsService {

    private final ListingsDataService listingsDataService;

    public DefaultSearchListingsService(ListingsDataService listingsDataService) {
        this.listingsDataService = listingsDataService;
    }

    @Override
    public SearchListingsResponse serach(SearchListingsDto dto) {
        List<Listings> response =  listingsDataService.search(dto);
        return SearchListingConverter.convert(response);
    }
}
