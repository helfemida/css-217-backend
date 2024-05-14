package com.sdu.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.model.OrderDetails;


@Repository
public interface OrderDAO extends JpaRepository<OrderDetails, Integer>{

}
