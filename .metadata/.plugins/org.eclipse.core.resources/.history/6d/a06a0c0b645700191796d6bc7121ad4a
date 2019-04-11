package com.mallika.micro;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.mallika.micro.dao.RegDaoClass;
import com.mallika.micro.model.UserRegistrationAccount;


@RestController
public class RegDatabaseController {
	
	/*@Autowired
	RegDaoClass regDaoClass;*/
/*	@PostMapping("/addUser")
	public String addUser(@RequestBody UserRegistrationAccount account) throws RestClientException, IOException {

		String baseUrl = "http://localhost:2919/add";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.POST, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(response.getBody());
		return response.getBody();
	}
	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}*/
	
	RestTemplate restTemplate = new RestTemplate();
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody UserRegistrationAccount registrationAccount) {
		System.out.println(registrationAccount);
		 return restTemplate.getForEntity("http://reg/add", 
					UserRegistrationAccount.class)
					.getBody().toString();
	}
	
	

}




/*package com.quickr.productapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductAppService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "unknown")
	public String addProduct() {
		return restTemplate.getForEntity("http://service/add", 
				String.class)
				.getBody();
	}
	
	
	@HystrixCommand(fallbackMethod = "unknown")
	public String addProduct() {
		return restTemplate.getForEntity("http://service/add", 
				String.class)
				.getBody();
	}
	
	public String unknown() {
		return "unknown vidhya";
	}
	
}
*/




