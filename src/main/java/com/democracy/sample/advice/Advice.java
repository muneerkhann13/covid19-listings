package com.democracy.sample.advice;

import com.democracy.sample.controller.Controller;
import com.democracy.sample.controller.SearchListingsController;
import com.democracy.sample.exceptions.business.BusinessException;
import com.democracy.sample.exceptions.technical.TechnicalException;
import com.democracy.sample.response.BaseResponse;
import com.democracy.sample.response.builder.ResponseBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.converter.HttpMessageConversionException;

@RestControllerAdvice(assignableTypes = { Controller.class, SearchListingsController.class})
@Slf4j
public class Advice {

	@Autowired
	ResponseBuilder responseBuilder;

	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(BusinessException.class)
	public BaseResponse handleException(BusinessException exception) {
		return responseBuilder.baseResponse(exception);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageConversionException.class)
	public BaseResponse handleException(HttpMessageConversionException exception) {
		return responseBuilder.baseResponse(exception);
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(TechnicalException.class)
	public BaseResponse handleException(TechnicalException exception) {
		return responseBuilder.baseResponse(exception);
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public BaseResponse handleException(Exception exception) {
		return responseBuilder.baseResponse(exception);
	}

}