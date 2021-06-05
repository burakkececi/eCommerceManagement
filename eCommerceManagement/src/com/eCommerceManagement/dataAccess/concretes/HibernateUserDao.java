package com.eCommerceManagement.dataAccess.concretes;

import java.util.List;

import com.eCommerceManagement.GoogleAuth.GoogleAuthService;
import com.eCommerceManagement.dataAccess.abstracts.UserDao;
import com.eCommerceManagement.entities.concretes.User;

public class HibernateUserDao implements UserDao, GoogleAuthService<User>{
	
	private User user;

	public HibernateUserDao(User user) {
		this.user = user;
	}

	@Override
	public User getById(int id) {
		
		return user;
	}

	@Override
	public void addUser(User user) {
		
		
	}

	@Override
	public void updateUser(User user) {
		
		
	}

	@Override
	public void deleteUser(User user) {
		
		
	}

	@Override
	public String getEmail(User user) {
		
		return null;
	}

	@Override
	public String getPassword(User user) {
		
		return null;
	}

	@Override
	public void googleAuthLogin(User user) {
		
		
	}

	@Override
	public void googleAuthSignIn(User user) {
		
		
	}

}
