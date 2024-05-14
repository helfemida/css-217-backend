package com.sdu.foodorderingsystem.authservice;

import com.sdu.foodorderingsystem.authexceptions.AuthorizationException;
import com.sdu.foodorderingsystem.authmodels.SignUpModel;
import com.sdu.foodorderingsystem.authmodels.UserSession;

public interface UserSessionService {
	
	public UserSession getUserSession(String key) throws AuthorizationException;
	
	public Integer getUserSessionId(String key) throws AuthorizationException;
	
	public SignUpModel getSignUpDetails(String key) throws AuthorizationException;
	

}
