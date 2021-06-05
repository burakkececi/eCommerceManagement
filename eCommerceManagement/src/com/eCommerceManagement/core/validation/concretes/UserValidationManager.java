package com.eCommerceManagement.core.validation.concretes;

import com.eCommerceManagement.core.validation.abstracts.UserValidationService;
import com.eCommerceManagement.entities.concretes.User;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean isPasswordValid(User user) {
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}";
		if(pattern.matches(user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isEmailValid(User user) {
		String pattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
		if(pattern.matches(user.getEmail())) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean isNameValid(User user) {
		String pattern = ".{2,}";
		if(pattern.matches(user.getName())) {
			return true;
		}else
			return false;
	}

	@Override
	public boolean isSurnameValid(User user) {
		String pattern = ".{2,}";
		if(pattern.matches(user.getSurname())) {
			return true;
		}else
			return false;
		
	}

}
