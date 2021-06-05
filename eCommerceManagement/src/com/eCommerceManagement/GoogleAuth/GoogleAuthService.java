package com.eCommerceManagement.GoogleAuth;

public interface GoogleAuthService <T> {

	void googleAuthLogin(T user);
	void googleAuthSignIn(T user);

	
}
