package com.uniq.HotelManagement.Mapper;

import com.uniq.HotelManagement.DTO.BookingRequestDTO;
import com.uniq.HotelManagement.DTO.BookingResponseDTO;
import com.uniq.HotelManagement.Entity.Booking;

public class BookingMapper {
	
	
	public static Booking toEntity(BookingRequestDTO bookingDTO) {
		
		if(bookingDTO == null) {
			
			return null;
		}
		
		
		Booking booking = new Booking();
	
		booking.setCheckInDate(bookingDTO.getCheckInDate());
		booking.setCheckOutDate(bookingDTO.getCheckOutDate());
		
		return booking;
		
	}
	
	
	public static BookingResponseDTO toBookingResponseDTO(Booking booking) {
		
		if(booking == null) {
			
			return null;
		}
		
		
		return new BookingResponseDTO(
				
				booking.getBookingId(),
				booking.getUser().getUserId(),
				booking.getCheckInDate(),
				booking.getCheckOutDate(),
				booking.getBookingStatus(),
				booking.getCreatedAt()
				
				);
		
	}


}
