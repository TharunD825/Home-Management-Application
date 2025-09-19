package com.uniq.HotelManagement.Controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.HotelManagement.DTO.GetRoomResponseDTO;
import com.uniq.HotelManagement.DTO.RoomRequestDTO;
import com.uniq.HotelManagement.DTO.RoomResponseDTO;
import com.uniq.HotelManagement.DTO.UpdateRoomRequestDTO;
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
	public ResponseEntity<Map<String, Object>> addRome(@RequestBody RoomRequestDTO roomRequestDTO) {
		
		//String adminEmail = principal.getName(); //Principal is a predefined interface in Java (java.security.Principal)
		                                         //It contains user email and name.. not password
		
		RoomResponseDTO roomResponseDTO = roomService.addRoom(roomRequestDTO);
		
		/* ----- x ----- */
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("data", roomResponseDTO);
		response.put("message", "Successfully room is added!");
		response.put("status", HttpStatus.CREATED.value());
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	 @GetMapping("/rooms")
	    public ResponseEntity<List<GetRoomResponseDTO>> getAllRooms() {
	        List<GetRoomResponseDTO> rooms = roomService.getAllRooms();
	        return ResponseEntity.ok(rooms);
	    }
	 
	 @PutMapping("room/update/{id}")
		public ResponseEntity<Map<String, Object>> updateRome(@PathVariable int roomId, @RequestBody UpdateRoomRequestDTO updateRoomRequestDTO) {
			
			RoomResponseDTO roomResponseDTO = roomService.updateRoom(roomId, updateRoomRequestDTO);
			
			/* ----- x ----- */
			
			Map<String, Object> response = new HashMap<>();
			
			response.put("data", updateRoomRequestDTO);
			response.put("message", "Successfully room is updated!");
			response.put("status", HttpStatus.CREATED.value());
			
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}


}
