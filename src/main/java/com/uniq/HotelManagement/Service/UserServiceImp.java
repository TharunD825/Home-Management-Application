package com.uniq.HotelManagement.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.DTO.UserRequestDTO;
import com.uniq.HotelManagement.DTO.UserResponseDTO;
import com.uniq.HotelManagement.Mapper.UserMapper;
import com.uniq.HotelManagement.Entity.Admin;
import com.uniq.HotelManagement.Entity.User;
import com.uniq.HotelManagement.Enum.UserRole;
import com.uniq.HotelManagement.Repository.AdminRepository;
import com.uniq.HotelManagement.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImp implements UserService {
	
	private UserRepository userRepository;
	
	private AdminRepository adminRepository;
	
    private PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserServiceImp(UserRepository userRepository, AdminRepository adminRepository, PasswordEncoder passwordEncoder) {
		
		this.userRepository = userRepository;
		this.adminRepository = adminRepository;
		this.passwordEncoder = passwordEncoder;
		
	}
	
	
	/* ----- POST ----- */
	
	@Transactional
	public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
		
		
		User user = UserMapper.toEntity(userRequestDTO); //converting RequestDTO to Entity(User)
		
		/* ----- PASSWORD ENCRYPTION ----- */
		
		String password = userRequestDTO.getUserPassword();
		
		String encodedPassword = passwordEncoder.encode(password);
		
		/* ----- x ----- */
		
		user.setUserPassword(encodedPassword);
		
		user.setCreatedAt(LocalDateTime.now()); // setting the local time
		
		
		User savedUser = userRepository.save(user); // Saving data in Entity(User)
		
		
		/* ----- SAVING ADMIN DETAILS IN ADMIN ----- */
		
		if(savedUser.getUserRole() == UserRole.ADMIN) {  //checking condition from entity
			
			Admin admin = new Admin();
			
			admin.setUser(savedUser); //saves userdetails( userId) in admin table
			
			admin.setAdminName(savedUser.getUserName());
			admin.setAdminEmail(savedUser.getUserEmail());
			admin.setAdminPassword(savedUser.getUserPassword());
			admin.setAdminRole(UserRole.ADMIN);
			admin.setCreatedAt(LocalDateTime.now());
			
			adminRepository.save(admin);   // getting admin details from user and saving in admin details
			
		}
		
		/* ----- x ----- */
		
		
		UserResponseDTO userResponseDTO = UserMapper.toUserResponseDTO(savedUser); //coverting Entity(User) to ResponseDTO 

		
		return userResponseDTO;
		
	}
	

}