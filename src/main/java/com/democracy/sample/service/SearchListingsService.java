package com.democracy.sample.service;

import com.democracy.sample.dto.SearchListingsDto;
import com.democracy.sample.response.SearchListingsResponse;

public interface SearchListingsService {

    SearchListingsResponse serach(SearchListingsDto dto);
}
