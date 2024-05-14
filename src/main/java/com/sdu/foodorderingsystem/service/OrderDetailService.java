package com.sdu.foodorderingsystem.service;

import java.util.List;

import com.sdu.foodorderingsystem.exceptions.CustomerException;
import com.sdu.foodorderingsystem.exceptions.OrderException;
import com.sdu.foodorderingsystem.model.Item;
import com.sdu.foodorderingsystem.model.OrderDetails;

public interface OrderDetailService {
	
	public OrderDetails addOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails updateOrder(OrderDetails order)throws OrderException;
	
	public OrderDetails removeOrder(Integer orderId)throws OrderException;
	
	public OrderDetails viewOrder(Integer orderId)throws OrderException;
	
	public List<Item> viewAllOrdersByCustomer(Integer customerId)throws OrderException,CustomerException;

}
