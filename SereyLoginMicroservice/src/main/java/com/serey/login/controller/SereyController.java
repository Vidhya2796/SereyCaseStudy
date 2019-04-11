package com.serey.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.serey.login.dao.SereyDao;
import com.serey.login.model.SereyUser;

@RestController
public class SereyController {
	@Autowired
	SereyDao sereyDao; 
	@PostMapping("/serey/users/login")
	public boolean validateUser(@RequestBody SereyUser sereyUser) {
		if(sereyDao.validateUser(sereyUser)) {
			return true;
		}
		return false;
		
	}

}
