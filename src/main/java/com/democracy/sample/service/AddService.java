package com.democracy.sample.service;

import com.democracy.sample.convert.AddConverter;
import com.democracy.sample.datasource.dataservice.SampleDataService;
import com.democracy.sample.request.AddRequest;
import com.democracy.sample.response.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddService {

	@Autowired
	private SampleDataService sampleDataService;

	public AddResponse add(AddRequest request) {

		sampleDataService.add(AddConverter.convert(request));

		return createSuccessResponse();
	}

	private AddResponse createSuccessResponse() {
		return new AddResponse();
	}

}