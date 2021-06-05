package com.eCommerceManagement.business.concretes;

import com.eCommerceManagement.business.abstracts.UserService;
import com.eCommerceManagement.core.validation.concretes.UserValidationManager;
import com.eCommerceManagement.dataAccess.abstracts.UserDao;
import com.eCommerceManagement.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserValidationManager validationManager;
	
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
		
	}

	@Override
	public User getById(int id) {
		
		return this.userDao.getById(id);
	}

	@Override
	public void addUser(User user) {
		
		this.userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		
		this.userDao.updateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		
		this.userDao.deleteUser(user);
	}

	@Override
	public void login(User user) {
		
		if(validationManager.isEmailValid(user) && validationManager.isPasswordValid(user)) {
			
			if(this.userDao.getEmail(user) == user.getEmail() && this.userDao.getPassword(user) == user.getPassword()) {
				System.out.println("Welcome "+ user.getName() +" "+ user.getSurname());
				
			}else if(this.userDao.getEmail(user) != user.getEmail() || this.userDao.getPassword(user) != user.getPassword()) {
				System.out.println("Invalid username or password. Please try again.");
				
			}
		}
		
	}

	@Override
	public void signIn(User user) {
		
		if(validationManager.isNameValid(user) && validationManager.isSurnameValid(user)
				&& validationManager.isEmailValid(user) && validationManager.isPasswordValid(user)) 
		{
			if(this.userDao.getEmail(user) != user.getEmail()) {
				sendEmail(user.getEmail());
				if(verificationEmail())
					this.userDao.addUser(user);
				else
					System.out.println("Please verify your e-mail adress.");
				
		}else
				System.out.println("This email already used.");
		}
		
	}
	private boolean verificationEmail() {
		
		return false;
	}

	public void sendEmail(String userEmail) {
		
	}

}
