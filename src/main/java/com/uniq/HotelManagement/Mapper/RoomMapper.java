package com.uniq.HotelManagement.Mapper;

import com.uniq.HotelManagement.DTO.RoomRequestDTO;
import com.uniq.HotelManagement.DTO.RoomResponseDTO;
import com.uniq.HotelManagement.Entity.Room;
import com.uniq.HotelManagement.Enum.RoomStatus;
import com.uniq.HotelManagement.Enum.RoomType;

public class RoomMapper {
	
	
	//RoomRequestDTO to Entity(Room)
	public static Room toEntity(RoomRequestDTO roomDTO) {
		
		if(roomDTO == null) {
			
			return null;
		}
		
		Room room = new Room();
		
		/* ----- x ----- */
		
		room.setRoomNumber(roomDTO.getRoomNumber());
		
		if(roomDTO.getRoomType()!= null) {
			
			room.setRoomType(RoomType.valueOf(roomDTO.getRoomType()));
		}
		
		room.setRoomPrice(roomDTO.getRoomPrice());
		room.setRoomCapacity(roomDTO.getRoomCapacity());
		
		if(roomDTO.getRoomStatus() != null) {
			
			room.setRoomStatus(RoomStatus.valueOf(roomDTO.getRoomStatus()));
		}
		
		/* ----- x ----- */
		
		return room;
		
	}
	
	
	//Entity(Room) to RoomResponseDTO
	public static RoomResponseDTO toRoomResponseDTO(Room room) {
		
		if(room == null) {
			
			return null;
		}
		
		
		return new RoomResponseDTO(
				
				room.getRoomId(),
				room.getRoomNumber(),
				room.getRoomType() != null ? room.getRoomType().name() : null,
				room.getRoomPrice(),
				room.getRoomCapacity(),
				room.getRoomStatus() != null ? room.getRoomStatus().name() : null,
				room.getCreatedAt()
				
				);
		
	}

}
