package com.democracy.sample.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NonNull;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchListingRequest {

	@NonNull
	private String category;

	@NonNull
	private String state;

	@NonNull
	private String city;

	private int pageNumber = 1;

	private int pageSize = 20;

}
