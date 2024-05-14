package com.sdu.foodorderingsystem.service;

import com.sdu.foodorderingsystem.exceptions.CartException;
import com.sdu.foodorderingsystem.exceptions.ItemException;
import com.sdu.foodorderingsystem.model.FoodCart;

public interface FoodCartService {
	
	public FoodCart saveCart(FoodCart cart)throws CartException;
	
	public FoodCart addItem(Integer cartId, Integer itemId)throws CartException,ItemException;
	
	public FoodCart clearCart(Integer cartId)throws CartException;
	
	public FoodCart viewCart(Integer cartId)throws CartException;

}
