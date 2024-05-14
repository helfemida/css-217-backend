package com.sdu.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.model.Customer;


@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
