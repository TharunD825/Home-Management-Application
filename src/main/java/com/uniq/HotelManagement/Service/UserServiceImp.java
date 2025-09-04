package com.uniq.HotelManagement.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.DTO.UserRequestDTO;
import com.uniq.HotelManagement.DTO.UserResponseDTO;
import com.uniq.HotelManagement.Mapper.UserMapper;
import com.uniq.HotelManagement.Entity.User;
import com.uniq.HotelManagement.Repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImp(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	
	/* ----- POST ----- */
	
	public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
		
		
		User user = UserMapper.toEntity(userRequestDTO); //converting RequestDTO to Entity(User)
		user.setCreatedAt(LocalDateTime.now()); // setting the local time
		
		User savedUser = userRepository.save(user); // Saving data in Entity(User)
		
		UserResponseDTO userResponseDTO = UserMapper.toUserResponseDTO(savedUser); //coverting Entity(User) to ResponseDTO 

		
		return userResponseDTO;
		
	}
	

}
