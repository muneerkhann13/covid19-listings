package com.democracy.sample.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Listings {

	private String category;

	private String state;

	private String city;

	private String info;

	private String address;

	private String contactNumbers;

	public static Listings convert(com.democracy.sample.datasource.model.Listings listings) {
		return Listings.builder().category(listings.getAddress()).state(listings.getState()).city(listings.getCity())
				.info(listings.getInfo()).address(listings.getAddress()).contactNumbers(listings.getContactNumber())
				.build();
	}

}
