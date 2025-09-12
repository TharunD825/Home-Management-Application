package com.uniq.HotelManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.HotelManagement.DTO.RoomRequestDTO;
import com.uniq.HotelManagement.DTO.RoomResponseDTO;
import com.uniq.HotelManagement.Service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	private RoomService roomService;
	
	@Autowired
	public RoomController(RoomService roomService) {
		
		this.roomService = roomService;
	}
	
	@PostMapping("/add")
	public RoomResponseDTO addRome(@RequestBody RoomRequestDTO roomRequestDTO) {
		
		//String adminEmail = principal.getName(); //Principal is a predefined interface in Java (java.security.Principal)
		                                         //It contains user email and name.. not password
		
		RoomResponseDTO roomResponseDTO = roomService.addRoom(roomRequestDTO);
		
		return roomResponseDTO;
		
	}

}
