package com.sdu.foodorderingsystem.service;

import com.sdu.foodorderingsystem.exceptions.CustomerException;
import com.sdu.foodorderingsystem.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer)throws CustomerException;
	
	public Customer updateCustomer(Customer customer)throws CustomerException;
	
	public Customer removeCustomerById(Integer customerId)throws CustomerException;
	
	public Customer viewCustomer(Integer customerId)throws CustomerException;

}
