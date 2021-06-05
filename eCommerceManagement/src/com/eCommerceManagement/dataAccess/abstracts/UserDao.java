package com.eCommerceManagement.dataAccess.abstracts;

import java.util.List;

import com.eCommerceManagement.entities.concretes.User;

public interface UserDao {
	
	
	User getById(int id);
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	String getEmail(User user);
	String getPassword(User user);
	
}
