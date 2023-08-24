package com.solera.userlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.userlogin.entities.UserData;
import com.solera.userlogin.repository.UserRepository;
@Service
public class UserServImpl implements UserService {
	@Autowired
	UserRepository userrepo;

	@Override
	public UserData registeruser(UserData user) {
		return userrepo.save(user);

	}

}
