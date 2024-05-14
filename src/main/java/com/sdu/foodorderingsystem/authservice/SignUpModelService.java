package com.sdu.foodorderingsystem.authservice;

import com.sdu.foodorderingsystem.authexceptions.AuthorizationException;
import com.sdu.foodorderingsystem.authmodels.SignUpModel;

public interface SignUpModelService {
	
	public SignUpModel newSignUp(SignUpModel signUp) throws AuthorizationException;;
	
	public SignUpModel updateSignUp(SignUpModel signUp, String key) throws AuthorizationException;;
}
