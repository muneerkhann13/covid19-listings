package com.democracy.sample.convert;

import com.democracy.sample.datasource.model.Listings;
import com.democracy.sample.response.SearchListingsResponse;

import java.util.List;
import java.util.stream.Collectors;

public class SearchListingConverter {

	public static SearchListingsResponse convert(List<Listings> response) {
		List<com.democracy.sample.response.Listings> listingsList = response.stream()
				.map(dbResponse -> com.democracy.sample.response.Listings.convert(dbResponse))
				.collect(Collectors.toList());
		SearchListingsResponse searchListingsResponse = new SearchListingsResponse();
		searchListingsResponse.setListings(listingsList);
		return searchListingsResponse;
	}

}
