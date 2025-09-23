package com.uniq.HotelManagement.Service;

import com.uniq.HotelManagement.DTO.UserRequestDTO;
import com.uniq.HotelManagement.DTO.UserResponseDTO;

public interface UserService {
	
	UserResponseDTO createUser(UserRequestDTO userRequestDTO);

}