package com.democracy.sample.controller;

import com.democracy.sample.constants.ApplicationConstants;
import com.democracy.sample.request.AddRequest;
import com.democracy.sample.response.AddResponse;
import com.democracy.sample.service.AddService;
import com.democracy.sample.service.UpdateService;
import com.democracy.sample.validator.AddValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.democracy.sample.constants.ApplicationConstants.*;

@Slf4j
@RestController
public class Controller {

	@Autowired
	private AddService addService;

	@Autowired
	private AddValidator addValidator;

	@Autowired
	private UpdateService updateService;

	@RequestMapping(value = { "/" + APPLICATION_NAME + "/add" }, method = { RequestMethod.POST },
			consumes = { "application/json" })
	public @ResponseBody AddResponse add(@Validated @RequestBody AddRequest request, @RequestParam String tracer,
			@RequestParam Long requestTimestamp, @RequestHeader Map<String, String> headers) {
		request.setHeaders(headers);
		request.setTracer(tracer);
		request.setRequestTimestamp(requestTimestamp);

		addValidator.validate(request);

		request.setRequestTimestamp(requestTimestamp);
		return addService.add(request);

	}

}
