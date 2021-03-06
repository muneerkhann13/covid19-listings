package com.democracy.sample.httpclient.model;

import com.democracy.sample.httpclient.template.properties.RestTemplatePropertiesSpecification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpClientPropertiesVo {

	private String clientName;

	private RestTemplatePropertiesSpecification templateProperties;

	private RestTemplate restTemplate;

	private PoolingHttpClientConnectionManager connManager;

}