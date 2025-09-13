package com.uniq.HotelManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniq.HotelManagement.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	Users findByUserName(String username);

}
