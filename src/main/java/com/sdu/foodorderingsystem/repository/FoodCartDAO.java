package com.sdu.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.model.FoodCart;


@Repository
public interface FoodCartDAO extends JpaRepository<FoodCart, Integer>{

}
