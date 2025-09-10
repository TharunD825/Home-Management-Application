package com.uniq.HotelManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniq.HotelManagement.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
