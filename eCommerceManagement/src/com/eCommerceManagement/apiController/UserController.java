package com.eCommerceManagement.apiController;

import com.eCommerceManagement.business.abstracts.UserService;
import com.eCommerceManagement.entities.concretes.User;

public class UserController {

	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	public User getById(int id) {
		return this.service.getById(id);
	}
	
	void addUser(User user) {
		this.service.addUser(user);
	}
	void updateUser(User user) {
		this.service.updateUser(user);
	}
	void deleteUser(User user) {
		this.service.deleteUser(user);
	}
	void login(User user) {
		this.service.login(user);
		}
	void signIn(User user) {
		this.service.signIn(user);
	}
}
