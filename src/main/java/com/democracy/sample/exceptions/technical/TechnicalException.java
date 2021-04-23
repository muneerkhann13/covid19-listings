package com.democracy.sample.exceptions.technical;

import com.democracy.sample.exceptions.AbstractException;
import com.democracy.sample.response.RespCodes.RespCode;
import lombok.Data;

@Data
public class TechnicalException extends AbstractException {

	private RespCode respCode;

	public TechnicalException(RespCode s) {
		super(s);
		this.respCode = s;
	}

	public String getRespCode() {
		return respCode == null ? null : respCode.name();
	}

	@Override
	public RespCode code() {
		return respCode;
	}

}
