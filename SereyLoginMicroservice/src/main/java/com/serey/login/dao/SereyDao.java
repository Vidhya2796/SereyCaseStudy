package com.serey.login.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.serey.login.model.SereyUser;
import com.serey.login.repository.SereyRepository;
@Component
public class SereyDao
{
	@Autowired
	private SereyRepository sereyRepository;

	public boolean validateUser(SereyUser sereyUser) {
		// TODO Auto-generated method stub
		
		List<SereyUser> users=sereyRepository.findAll();
		for(SereyUser sereyUser2:users) {
		if(sereyUser.getEmail().equals(sereyUser2.getEmail())&&sereyUser.getPassword().equals(sereyUser2.getPassword())) {
			return true;
		}
		}
		return false;
	}

	/*
	 * public List<UserRegistrationAccount> getAllUsers() {
	 * System.out.println("Get all Users...");
	 * System.out.println(userRepository.findAll()); return
	 * userRepository.findAll(); }
	 */
}
