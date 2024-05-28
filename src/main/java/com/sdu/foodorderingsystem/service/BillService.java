package com.sdu.foodorderingsystem.service;

import com.sdu.foodorderingsystem.exceptions.BillException;
import com.sdu.foodorderingsystem.exceptions.CustomerException;
import com.sdu.foodorderingsystem.exceptions.ItemException;
import com.sdu.foodorderingsystem.model.Bill;

public interface BillService {

    Bill addBill(Bill bill) throws BillException;

    Bill updateBill(Bill bill) throws BillException;

    Bill removeBill(Integer billId) throws BillException;

    Bill viewBill(Integer billId) throws BillException;

    String generateTotalBillById(Integer customerId) throws ItemException, CustomerException;
}
