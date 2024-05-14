package com.sdu.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.model.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
