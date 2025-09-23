package com.uniq.HotelManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.HotelManagement.DTO.BookingRequestDTO;
import com.uniq.HotelManagement.DTO.BookingResponseDTO;
import com.uniq.HotelManagement.Service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	private BookingService bookingService;
	
	@Autowired
	public BookingController(BookingService  bookingService) {
		
		this.bookingService =  bookingService;
		
	}
	
	@PostMapping("/roombooking")
	public BookingResponseDTO createBooking(@RequestBody BookingRequestDTO bookingRequestDTO) {
		
		BookingResponseDTO bookingResponseDTO = bookingService.createBooking(bookingRequestDTO);
		
		return bookingResponseDTO;
			
	}

}