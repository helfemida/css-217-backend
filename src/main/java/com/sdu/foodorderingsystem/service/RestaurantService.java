package com.sdu.foodorderingsystem.service;

import com.sdu.foodorderingsystem.exceptions.RestaurantException;
import com.sdu.foodorderingsystem.model.Restaurant;
import java.util.List;

public interface RestaurantService {
	
	public Restaurant addRestaurant(Restaurant restaurant)throws RestaurantException;
	
	public Restaurant updateRestaurant(Restaurant restaurant)throws RestaurantException;
	
	public Restaurant removeRestaurant(Integer restaurantId)throws RestaurantException;
	
	public Restaurant viewRestaurant(Integer restaurantId)throws RestaurantException;
	
	public List<Restaurant> getAll();

}
