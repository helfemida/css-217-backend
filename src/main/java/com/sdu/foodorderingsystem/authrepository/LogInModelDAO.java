package com.sdu.foodorderingsystem.authrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.authmodels.LogInModel;


@Repository
public interface LogInModelDAO extends JpaRepository<LogInModel, Integer>{

}
