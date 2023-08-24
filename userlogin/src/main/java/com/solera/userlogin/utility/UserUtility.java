package com.solera.userlogin.utility;

import org.springframework.stereotype.Component;

import com.solera.userlogin.entities.UserData;
import com.solera.userlogin.model.UserModel;
@Component
public class UserUtility {
	public UserData createUserDataFromModel(UserModel usermodel) {
		UserData user = new UserData();
		user.setName(usermodel.getName());
		user.setUsername(usermodel.getUsername());
		
		user.setPassword(usermodel.getPassword());
		return user;
	}

}
