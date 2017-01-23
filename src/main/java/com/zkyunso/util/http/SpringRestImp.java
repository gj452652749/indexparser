package com.zkyunso.util.http;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class SpringRestImp implements HttpRest{

	private RestTemplate restTemplate=null;
	
	public SpringRestImp() {
		super();
		restTemplate=new RestTemplate();
		CloseableHttpClient httpclient=HttpClientBuilder.create()
				.setMaxConnTotal(800)
				.setMaxConnPerRoute(800)
				.build();
		restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpclient));
		// TODO Auto-generated constructor stub
	}

	@Override
	public String get(String url) {
		// TODO Auto-generated method stub
		String json=restTemplate.getForObject(url, String.class);
		return json;
	}

}
