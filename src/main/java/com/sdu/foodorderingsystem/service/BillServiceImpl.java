package com.sdu.foodorderingsystem.service;

import com.sdu.foodorderingsystem.exceptions.BillException;
import com.sdu.foodorderingsystem.exceptions.CustomerException;
import com.sdu.foodorderingsystem.exceptions.ItemException;
import com.sdu.foodorderingsystem.model.Item;
import com.sdu.foodorderingsystem.model.Bill;
import com.sdu.foodorderingsystem.model.Customer;
import com.sdu.foodorderingsystem.repository.BillDAO;
import com.sdu.foodorderingsystem.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BillServiceImpl implements BillService {
    @Autowired
    BillDAO billDAO;

    @Autowired
    CustomerDAO cusDAO;

    @Override
    public Bill addBill(Bill bill) throws BillException {
        Optional<Bill> opt = billDAO.findById(bill.getBillId());
        if (opt.isPresent()) {
            throw new BillException("Bill already exists..");
        } else {
            return billDAO.save(bill);
        }
    }

    @Override
    public Bill updateBill(Bill bill) throws BillException {
        Optional<Bill> opt = billDAO.findById(bill.getBillId());
        if (opt.isPresent()) {
            return billDAO.save(bill);
        } else {
            throw new BillException("Bill doesn't exists..");
        }
    }

    @Override
    public Bill removeBill(Integer billId) throws BillException {
        Optional<Bill> opt = billDAO.findById(billId);
        if (opt.isPresent()) {
            Bill bill = opt.get();
            billDAO.delete(bill);
            return bill;
        } else {
            throw new BillException("Bill not found with ID: " + billId);
        }

    }

    @Override
    public Bill viewBill(Integer billId) throws BillException {
        Optional<Bill> opt = billDAO.findById(billId);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new BillException("Bill not found with ID: " + billId);
        }
    }

    @Override
    public String generateTotalBillById(Integer customerId) throws ItemException, CustomerException {
        Optional<Customer> cOpt = cusDAO.findById(customerId);
        if (cOpt.isPresent()) {
            Customer customer = cOpt.get();
            List<Item> items = customer.getFoodCart().getItemList();
            if (items.size() > 0) {
                Double total = 0.0;
                for (Item item : items) {
                    total += (item.getCost() * item.getQuantity());
                }
                return "The total bill for " + customer.getFullName() + " is " + total;

            } else {
                throw new ItemException("No order items found for " + customer.getFullName());
            }
        } else {
            throw new CustomerException("No Customer found with ID: " + customerId);
        }
    }
}
