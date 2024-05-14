package com.sdu.foodorderingsystem.authservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdu.foodorderingsystem.authexceptions.AuthorizationException;
import com.sdu.foodorderingsystem.authmodels.SignUpModel;
import com.sdu.foodorderingsystem.authrepository.SignUpModelDAO;


@Service
public class SignUpModelServiceImpl implements SignUpModelService {


	@Autowired
	private SignUpModelDAO signUpDAO;
	
	@Autowired
	private UserSessionService userLoginSession;
	
	
	
	
	@Override
	public SignUpModel newSignUp(SignUpModel signUp) throws AuthorizationException {
		
		Optional<SignUpModel> opt = signUpDAO.findByEmail(signUp.getEmail());
		if(opt.isPresent())
		{
			throw new AuthorizationException("User Already Exists..!!");
		}
		
		return signUpDAO.save(signUp);
	}

	
	@Override
	public SignUpModel updateSignUp(SignUpModel signUp, String key) throws AuthorizationException {
		
		SignUpModel signUpDetails = userLoginSession.getSignUpDetails(key);
		
		if(signUpDetails == null)
		{
			throw new AuthorizationException("User not LoggedIn...!! Try To Login first..");
		}
		
		if(signUpDetails.getUserId() == signUp.getUserId())
			{
			signUpDAO.save(signUp);
			return signUp;
			}
		else
			throw new AuthorizationException("UserId not found..!!");
	}

}