package com.sdu.foodorderingsystem.authrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.authmodels.SignUpModel;

@Repository
public interface SignUpModelDAO extends JpaRepository<SignUpModel, Integer> {
	
	Optional<SignUpModel> findByEmail(String email);
}
