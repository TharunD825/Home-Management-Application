package com.uniq.HotelManagement.Service;

import java.util.List;

import com.uniq.HotelManagement.DTO.GetRoomResponseDTO;
import com.uniq.HotelManagement.DTO.RoomRequestDTO;
import com.uniq.HotelManagement.DTO.RoomResponseDTO;
import com.uniq.HotelManagement.DTO.UpdateRoomRequestDTO;

public interface RoomService {
	
	RoomResponseDTO addRoom(RoomRequestDTO roomRequestDTO);

	List<GetRoomResponseDTO> getAllRooms();

	RoomResponseDTO updateRoom(int roomId, UpdateRoomRequestDTO updateRoomRequestDTO);

}