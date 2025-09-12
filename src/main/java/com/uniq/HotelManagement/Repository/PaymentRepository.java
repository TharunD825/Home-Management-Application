package com.uniq.HotelManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniq.HotelManagement.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
