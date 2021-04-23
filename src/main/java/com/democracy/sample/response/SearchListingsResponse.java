package com.democracy.sample.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class SearchListingsResponse extends BaseResponse {

    List<Listings> listings;
}
