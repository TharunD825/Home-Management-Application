package com.uniq.HotelManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniq.HotelManagement.Entity.Admin;
import com.uniq.HotelManagement.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);
	
	Optional<User> findByUserEmail(String userEmail);


}

