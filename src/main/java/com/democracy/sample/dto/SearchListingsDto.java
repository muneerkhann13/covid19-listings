package com.democracy.sample.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SearchListingsDto {

    private String category;
    private String state;
    private String city;
    private int pageNumber;
    private int pageSize;

}
