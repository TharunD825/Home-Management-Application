package com.uniq.HotelManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniq.HotelManagement.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	Optional<Admin> findByAdminEmail(String adminEmail);

	Admin findByAdminId(Integer adminId);


}
