package com.democracy.sample.datasource.repository.slave;

import com.democracy.sample.datasource.model.Sample;
import org.springframework.data.repository.CrudRepository;

public interface SampleSlaveRepository extends CrudRepository<Sample, Long> {

}