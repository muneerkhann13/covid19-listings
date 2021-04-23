package com.democracy.sample.datasource.dataservice;

import com.democracy.sample.datasource.model.Sample;
import com.democracy.sample.datasource.repository.master.SampleMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleDataService {

	@Autowired
	private SampleMasterRepository sampleMasterRepository;

	public void add(Sample sample) {
		sampleMasterRepository.save(sample);
	}

}