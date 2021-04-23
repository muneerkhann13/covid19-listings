package com.democracy.sample.datasource.dataservice;

import com.democracy.sample.datasource.model.Listings;
import com.democracy.sample.dto.SearchListingsDto;

import java.util.List;

public interface ListingsDataService {

    List<Listings> search(SearchListingsDto dto);
}
