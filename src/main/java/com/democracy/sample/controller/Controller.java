package com.democracy.sample.controller;

import com.democracy.sample.constants.ApplicationConstants;
import com.democracy.sample.datasource.model.Category;
import com.democracy.sample.datasource.model.City;
import com.democracy.sample.request.AddRequest;
import com.democracy.sample.response.AddResponse;
import com.democracy.sample.service.AddService;
import com.democracy.sample.service.CategoryService;
import com.democracy.sample.service.CityDataService;
import com.democracy.sample.service.UpdateService;
import com.democracy.sample.validator.AddValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

	@Autowired
	private CityDataService cityDataService;

	@Autowired
	private CategoryService categoryService;

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

	@RequestMapping(value = { "/city" }, method = { RequestMethod.GET })
	public @ResponseBody List<City> getAllCities() {

		return cityDataService.getAllCities();
	}

	@RequestMapping(value = { "/category" }, method = { RequestMethod.GET })
	public @ResponseBody List<Category> getAllCategory() {

		return categoryService.getAll();
	}

}
