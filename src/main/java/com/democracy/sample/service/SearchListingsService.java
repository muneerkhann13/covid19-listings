package com.democracy.sample.service;

import com.democracy.sample.request.SearchListingRequest;
import com.democracy.sample.response.SearchListingsResponse;

public interface SearchListingsService {

	SearchListingsResponse serach(SearchListingRequest dto);

}
