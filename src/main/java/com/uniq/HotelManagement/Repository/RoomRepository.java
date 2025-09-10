package com.uniq.HotelManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniq.HotelManagement.Entity.Room;
import com.uniq.HotelManagement.Enum.RoomStatus;

public interface RoomRepository extends JpaRepository<Room, Integer>{
	
	List<Room> findByRoomStatus(RoomStatus roomStatus);

}
