package com.uniq.HotelManagement.Mapper;

import com.uniq.HotelManagement.DTO.UserRequestDTO;
import com.uniq.HotelManagement.DTO.UserResponseDTO;
import com.uniq.HotelManagement.Enum.UserRole;
import com.uniq.HotelManagement.Entity.User;

public class UserMapper {
	
	
	//UserRequestDTO to Entity(User)
	public static User toEntity(UserRequestDTO userDTO) {
		
		if(userDTO == null) {
			
			return null;
		}
		
		User user = new User();
		
		/* ----- x ----- */
		
		user.setUserName(userDTO.getUserName());
		user.setUserEmail(userDTO.getUserEmail());
		user.setUserPassword(userDTO.getUserPassword());
		user.setUserPhone(userDTO.getUserPhone());
		
		if(userDTO.getUserRole() != null) {
			
			user.setUserRole( UserRole.valueOf(userDTO.getUserRole()) );  //UserRole.valueOf("ADMIN") - it results the matching value
		}
		
		user.setUserAddress(userDTO.getUserAddress());
		user.setCreatedAt(userDTO.getCreatedAt());
		
		/* ----- x ----- */
		
		return user;
		
	}
	
	
	//Entity(User) to UserResponseDTO
	public static UserResponseDTO toUserResponseDTO(User user) {
		
		if(user == null) {
			
			return null;
		}
		
		//no setters in UserRequestDTO, so data is fetched through its constructor
		
		return new UserResponseDTO(
				
				user.getUserId(),
				user.getUserName(),
				user.getUserEmail(),
				user.getUserPhone(),
				
				user.getUserRole() != null ? user.getUserRole().name() : null,
						
				user.getUserAddress(),
				user.getCreatedAt()
				
				);
		
	}

}
