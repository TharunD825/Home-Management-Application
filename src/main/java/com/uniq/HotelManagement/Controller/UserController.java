package com.uniq.HotelManagement.Controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.HotelManagement.DTO.UserRequestDTO;
import com.uniq.HotelManagement.DTO.UserResponseDTO;
import com.uniq.HotelManagement.Service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	private UserService userService;
	
	
	@Autowired
	public UserController(UserService userService ) {
		
		this.userService = userService;
		
	}
	
	
	@PostMapping(path = "/register")
	public ResponseEntity<Map<String, Object>> createUser(@RequestBody UserRequestDTO userRequestDTO) {
		
		UserResponseDTO userResponseDTO = userService.createUser(userRequestDTO);
		
		/* ----- x ----- */
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("data", userResponseDTO);
		response.put("message", "Succesfully registered!");
		response.put("status", HttpStatus.CREATED.value());
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}
	
	
	
//	@GetMapping(path = "/index")
//	public String indexReturn() {
//		
//		return "index";
//	}
	
	
	

}
