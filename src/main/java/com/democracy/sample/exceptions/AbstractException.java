package com.democracy.sample.exceptions;

import com.democracy.sample.response.RespCodes;
import com.democracy.sample.response.RespCodes.RespCode;
import lombok.Data;

@Data
public abstract class AbstractException extends RuntimeException {

	public AbstractException(RespCode s) {
		super(s.name());
	}

	public abstract RespCode code();

}
