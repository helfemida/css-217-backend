package com.sdu.foodorderingsystem.repository;

import com.sdu.foodorderingsystem.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BillDAO extends JpaRepository<Bill, Integer>{

}
