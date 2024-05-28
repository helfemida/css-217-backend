package com.sdu.foodorderingsystem.authexceptions;

public class AuthorizationException extends Exception{
	public AuthorizationException(String message) {
		super(message);
	}
}
