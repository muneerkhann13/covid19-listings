package com.democracy.sample.datasource.repository.master;

import com.democracy.sample.datasource.model.Sample;
import org.springframework.data.repository.CrudRepository;

public interface SampleMasterRepository extends CrudRepository<Sample, Long> {

}