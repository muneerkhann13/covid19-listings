package com.democracy.sample.response.builder;

import com.democracy.sample.exceptions.AbstractException;
import com.democracy.sample.response.BaseResponse;
import org.springframework.stereotype.Component;

import static com.democracy.sample.constants.ApplicationConstants.APPLICATION_NAME;
import static com.democracy.sample.constants.ApplicationConstants.HYPHEN;

@Component
public class ResponseBuilder {

	public BaseResponse baseResponse(AbstractException e) {
		return new BaseResponse(APPLICATION_NAME + HYPHEN + e.code().name());
	}

	public BaseResponse baseResponse(Exception e) {
		return new BaseResponse(APPLICATION_NAME + HYPHEN + e.getMessage());
	}

}