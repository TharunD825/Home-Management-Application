package com.uniq.HotelManagement.Controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.HotelManagement.DTO.UserRequestDTO;
import com.uniq.HotelManagement.DTO.UserResponseDTO;
import com.uniq.HotelManagement.Entity.Users;
import com.uniq.HotelManagement.Repository.UserRepository;
import com.uniq.HotelManagement.Service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	private UserService userService;
	
	
	@Autowired
	public UserController(UserService userService ) {
		
		this.userService = userService;
		
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthenticationManager am;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@PostMapping(path = "/register")
	public UserResponseDTO createUser( @Valid @RequestBody UserRequestDTO userRequestDTO ) {
		
		UserResponseDTO userResponseDTO = userService.createUser(userRequestDTO);
		
		return userResponseDTO;
		
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Users e, HttpSession session) {
	    try {
	        UsernamePasswordAuthenticationToken token =
	                new UsernamePasswordAuthenticationToken(e.getUserName(), e.getUserPassword());

	        Authentication auth = am.authenticate(token);

	        if (auth.isAuthenticated()) {
	            Users user = userRepository.findByUserName(e.getUserName());

	            // ✅ Always set userId and role
	            session.setAttribute("userId", user.getUserId());
	            session.setAttribute("userRole", user.getUserRole().name());

	            Map<String, Object> response = new HashMap<>();
	            response.put("userId", user.getUserId());
	            response.put("userName", user.getUserName());
	            response.put("userRole", user.getUserRole().name());
	            response.put("message", "Login successful");

	            // ✅ Only set adminId for ADMIN users
	            if (user.getUserRole().name().equals("ADMIN") && user.getAdmin() != null) {
	                session.setAttribute("adminId", user.getAdmin().getAdminId());
	                response.put("adminId", user.getAdmin().getAdminId());
	            }

	            return ResponseEntity.ok(response);
	        } else {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong Credentials");
	        }
	    } catch (Exception ex) {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
	    }
	
	}
//	@GetMapping(path = "/index")
//	public String indexReturn() {
//		
//		return "index";
//	}
	
	
	

}