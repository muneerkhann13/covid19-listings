package com.democracy.sample.controller;

import com.democracy.sample.request.AddRequest;
import com.democracy.sample.request.SearchListingRequest;
import com.democracy.sample.response.AddResponse;
import com.democracy.sample.response.SearchListingsResponse;
import com.democracy.sample.service.SearchListingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.democracy.sample.constants.UriConstants.SEARCH_LISTINGS;

@Slf4j
@RestController
public class SearchListingsController {

	private final SearchListingsService searchListingsService;

	public SearchListingsController(SearchListingsService searchListingsService) {
		this.searchListingsService = searchListingsService;
	}

	@RequestMapping(value = SEARCH_LISTINGS, method = { RequestMethod.POST },
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody SearchListingsResponse searchV1(@RequestBody SearchListingRequest request,
			@RequestParam String tracer, @RequestParam Long requestTimestamp) {

		SearchListingsResponse response =  searchListingsService.serach(request);
		log.info("{}",response);
		return response;
	}

}
