package com.uniq.HotelManagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
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
	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	
	@PostMapping(path = "/register")
	public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO) {
		
		UserResponseDTO userResponseDTO = userService.createUser(userRequestDTO);
		
		return userResponseDTO;
		
	}
	
//	@GetMapping(path = "/index")
//	public String indexReturn() {
//		
//		return "index";
//	}
	
	
	

}
