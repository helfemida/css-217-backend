package com.sdu.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.model.Item;


@Repository
public interface ItemDAO extends JpaRepository<Item, Integer>{

}
