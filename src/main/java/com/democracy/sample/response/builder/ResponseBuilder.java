package com.democracy.sample.response.builder;

import com.democracy.sample.exceptions.AbstractException;
import com.democracy.sample.response.BaseResponse;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.stereotype.Component;

import static com.democracy.sample.constants.ApplicationConstants.*;
import static com.democracy.sample.constants.ResponseConstants.BAD_REQUEST;
import static com.democracy.sample.constants.ResponseConstants.INTERNAL_SERVER_ERROR;

@Component
public class ResponseBuilder {

	public BaseResponse baseResponse(AbstractException e) {
		return new BaseResponse(INTERNAL_SERVER_ERROR);
	}

	public BaseResponse baseResponse(Exception e) {
		return new BaseResponse(INTERNAL_SERVER_ERROR);
	}

	public BaseResponse baseResponse(HttpMessageConversionException e) {
		return new BaseResponse(BAD_REQUEST);
	}

}