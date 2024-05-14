package com.sdu.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.model.Restaurant;


@Repository
public interface RestaurantDAO extends JpaRepository<Restaurant, Integer>{

}
