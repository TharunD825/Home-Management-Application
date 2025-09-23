package com.uniq.HotelManagement.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.DTO.RoomRequestDTO;
import com.uniq.HotelManagement.DTO.RoomResponseDTO;
import com.uniq.HotelManagement.Entity.Admin;
import com.uniq.HotelManagement.Entity.Room;
import com.uniq.HotelManagement.Mapper.RoomMapper;
import com.uniq.HotelManagement.Repository.AdminRepository;
import com.uniq.HotelManagement.Repository.RoomRepository;

import jakarta.transaction.Transactional;

@Service
public class RoomServiceImp implements RoomService {
	
	private RoomRepository roomRepository;
	
	private AdminRepository adminRepository;
	
	@Autowired
	public RoomServiceImp(RoomRepository roomRepository, AdminRepository adminRepository) {
		
		this.roomRepository = roomRepository;
		this.adminRepository = adminRepository;
		
	}
	
	
	/* ----- POST ----- */
	
	@Transactional
	public RoomResponseDTO addRoom(RoomRequestDTO roomRequestDTO) {
		
		String adminEmail = roomRequestDTO.getAdminEmail();
		
		
		Optional<Admin> adminEmailId = adminRepository.findByAdminEmail(adminEmail);
		
		if(!adminEmailId.isPresent()) {
			
			throw new RuntimeException("EmailId " + adminEmail + " is not present");
		}
		
		Admin admin = adminEmailId.get();	
		
		/* ----- x ----- */
		
		Room room = RoomMapper.toEntity(roomRequestDTO);
		
		room.setAdmin(admin);
		
		room.setCreatedAt(LocalDateTime.now());
		
		Room savedRoom = roomRepository.save(room);
		
		/* ----- x ----- */
		
		RoomResponseDTO roomResponseDTO = RoomMapper.toRoomResponseDTO(savedRoom);
		
		return roomResponseDTO;
		
	}
	
	/* ----- GET ----- */
	
//	public void getRoom() {
//		
//		List<Room> room = roomRepository.findAll();	
//		
//	}

}