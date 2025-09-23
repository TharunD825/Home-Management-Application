package com.uniq.HotelManagement.Service;

import com.uniq.HotelManagement.DTO.BookingRequestDTO;
import com.uniq.HotelManagement.DTO.BookingResponseDTO;

public interface BookingService {
	
	BookingResponseDTO createBooking(BookingRequestDTO bookingRequestDTO);

}