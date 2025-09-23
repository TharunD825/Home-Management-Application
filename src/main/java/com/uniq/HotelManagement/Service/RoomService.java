package com.uniq.HotelManagement.Service;

import com.uniq.HotelManagement.DTO.RoomRequestDTO;
import com.uniq.HotelManagement.DTO.RoomResponseDTO;

public interface RoomService {
	
	RoomResponseDTO addRoom(RoomRequestDTO roomRequestDTO);

}