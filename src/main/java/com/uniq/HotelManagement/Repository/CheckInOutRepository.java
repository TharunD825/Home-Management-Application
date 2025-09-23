package com.uniq.HotelManagement.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uniq.HotelManagement.Entity.CheckInOut;

@Repository
public interface CheckInOutRepository extends JpaRepository<CheckInOut, Integer>{
	
	@Query("SELECT c FROM CheckInOut c WHERE c.room.roomId = :roomId AND :checkInDate < c.checkOutDate AND :checkOutDate > c.checkInDate ")
	List<CheckInOut> findBookings(@Param("roomId") Integer roomId, @Param("checkInDate") LocalDate checkInDate, @Param("checkOutDate") LocalDate checkOutDate);
	
	//to filter the data at which date is not booked
	

}