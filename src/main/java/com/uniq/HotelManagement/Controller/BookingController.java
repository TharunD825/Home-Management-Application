package com.uniq.HotelManagement.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping("/register")
	public ResponseEntity<Map<String, Object>> createBooking(@RequestBody BookingRequestDTO bookingRequestDTO) {
		
		BookingResponseDTO bookingResponseDTO = bookingService.createBooking(bookingRequestDTO);
		
		/* ----- x ----- */
		
        Map<String, Object> response = new HashMap<>();
		
		response.put("data", bookingResponseDTO);
		response.put("message", "Succesfully registered!");
		response.put("status", HttpStatus.CREATED.value());
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
		
	}

}
