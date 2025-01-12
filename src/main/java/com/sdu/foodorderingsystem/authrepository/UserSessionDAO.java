package com.sdu.foodorderingsystem.authrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sdu.foodorderingsystem.authmodels.UserSession;


@Repository
public interface UserSessionDAO extends JpaRepository<UserSession, Integer> {
	
	Optional<UserSession> findByUserId(Integer userId);
	
	Optional<UserSession> findByUUID(String uuid);

}
