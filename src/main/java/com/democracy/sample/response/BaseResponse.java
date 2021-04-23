package com.democracy.sample.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import static com.democracy.sample.response.RespCodes.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseResponse {

	private String respCode;

	private String data;

	public BaseResponse(String respCode) {
		this.respCode = respCode;
	}

}
