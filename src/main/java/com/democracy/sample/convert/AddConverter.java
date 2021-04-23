package com.democracy.sample.convert;

import com.democracy.sample.datasource.model.Sample;
import com.democracy.sample.request.AddRequest;
import org.springframework.stereotype.Component;

@Component
public class AddConverter {

	public Sample convert(AddRequest request) {
		return new Sample();
	}

}
