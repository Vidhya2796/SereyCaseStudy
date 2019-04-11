package com.mallika.micro.dao;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.mallika.micro.model.UserRegistrationAccount;

public class RegDaoClass {
	RestTemplate restTemplate = new RestTemplate();
	
	public UserRegistrationAccount addProduct(UserRegistrationAccount registrationAccount) {
		 return restTemplate.getForEntity("http://reg/add", 
				UserRegistrationAccount.class)
				.getBody();
		 //return new UserRegistrationAccount();
	}
}
