package com.mallika.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mallika.micro.Bussiness.RegistrationService;
import com.mallika.micro.model.UserRegistrationAccount;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;
@PostMapping("/add")
UserRegistrationAccount addUser(@RequestBody UserRegistrationAccount registrationAccount) {
	
	registrationService.addUser(registrationAccount);
	
	return registrationAccount;
}

	
	
}
