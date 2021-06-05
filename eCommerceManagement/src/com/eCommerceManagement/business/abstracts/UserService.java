package com.eCommerceManagement.business.abstracts;

import com.eCommerceManagement.entities.concretes.User;

public interface UserService {

	public User getById(int id);
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	void login(User user);
	void signIn(User user);
}
