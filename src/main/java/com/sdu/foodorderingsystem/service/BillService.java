package com.sdu.foodorderingsystem.service;

import com.sdu.foodorderingsystem.exceptions.BillException;
import com.sdu.foodorderingsystem.exceptions.CustomerException;
import com.sdu.foodorderingsystem.exceptions.ItemException;
import com.sdu.foodorderingsystem.model.Bill;

public interface BillService {
	
	public Bill addBill(Bill bill) throws BillException;
	
	public Bill updateBill(Bill bill)throws BillException;
	
	public Bill removeBill(Integer billId)throws BillException;
	
	public Bill viewBill(Integer billId)throws BillException;
	
	public String generateTotalBillById(Integer customerId)throws ItemException, CustomerException;
	

}
