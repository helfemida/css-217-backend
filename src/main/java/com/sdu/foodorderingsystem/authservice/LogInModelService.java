package com.sdu.foodorderingsystem.authservice;

import com.sdu.foodorderingsystem.authexceptions.AuthorizationException;
import com.sdu.foodorderingsystem.authmodels.LogInModel;

public interface LogInModelService {
	
	public String LogIn(LogInModel login) throws AuthorizationException;
	
	public String LogOut(String key) throws AuthorizationException;

}
