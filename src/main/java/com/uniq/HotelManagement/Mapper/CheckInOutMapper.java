package com.uniq.HotelManagement.Mapper;

import com.uniq.HotelManagement.DTO.CheckInResponseDTO;
import com.uniq.HotelManagement.DTO.CheckOutResponseDTO;
import com.uniq.HotelManagement.Entity.CheckInOut;

public class CheckInOutMapper {
	
//	public static CheckInOut toEntity(CheckInOutRequestDTO checkInOutDTO) {
//		
//		if(checkInOutDTO == null) {
//			
//			return null;
//		}
//		
//		CheckInOut checkInOut = new CheckInOut();
//		
//		return checkInOut;
//		
//	}
	
	
	public static CheckInResponseDTO toCheckInResponseDTO(CheckInOut checkInOut) {
		
		if(checkInOut == null) {
			
			return null;
		}
		
		return new CheckInResponseDTO(
				checkInOut.getAdmin().getAdminId(), 
				checkInOut.getUser().getUserId(),
				checkInOut.getBooking().getBookingId(),
				checkInOut.getRoom().getRoomId(),
				checkInOut.getCheckInDate(),
				checkInOut.getCheckOutDate(),
				checkInOut.getCheckInOutStatus(),
				checkInOut.getCreatedAt()
				);
		
	}
	
	
    public static CheckOutResponseDTO toCheckOutResponseDTO(CheckInOut checkInOut) {
		
		if(checkInOut == null) {
			
			return null;
		}
		
		return new CheckOutResponseDTO(
				checkInOut.getAdmin().getAdminId(), 
				checkInOut.getUser().getUserId(),
				checkInOut.getBooking().getBookingId(),
				checkInOut.getRoom().getRoomId(),
				checkInOut.getCheckInDate(),
				checkInOut.getCheckOutDate(),
				checkInOut.getCheckInOutStatus(),
				checkInOut.getCreatedAt()
				);
		
	}

	

}
