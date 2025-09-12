package com.uniq.HotelManagement.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.DTO.BookingRequestDTO;
import com.uniq.HotelManagement.DTO.BookingResponseDTO;
import com.uniq.HotelManagement.Entity.Booking;
import com.uniq.HotelManagement.Entity.CheckInOut;
import com.uniq.HotelManagement.Entity.Room;
import com.uniq.HotelManagement.Entity.User;
import com.uniq.HotelManagement.Enum.BookingStatus;
import com.uniq.HotelManagement.Enum.CheckInOutStatus;
import com.uniq.HotelManagement.Mapper.BookingMapper;
import com.uniq.HotelManagement.Repository.BookingRepository;
import com.uniq.HotelManagement.Repository.CheckInOutRepository;
import com.uniq.HotelManagement.Repository.RoomRepository;
import com.uniq.HotelManagement.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class BookingServiceImp implements BookingService{
	
	private UserRepository userRepository;
	
	private RoomRepository roomRepository;
	
	private BookingRepository bookingRepository;
	
	private CheckInOutRepository checkInOutRepository;
		
	
	@Autowired
	public BookingServiceImp(UserRepository userRepository, RoomRepository roomRepository, BookingRepository bookingRepository, CheckInOutRepository checkInOutRepository){
		
		this.userRepository = userRepository;
		this.roomRepository = roomRepository;
		this.bookingRepository = bookingRepository;
		this.checkInOutRepository = checkInOutRepository;
		
	}
	
	/* ----- POST ----- */
	
	@Transactional
	public BookingResponseDTO createBooking(BookingRequestDTO bookingRequestDTO) {
		
		Integer userId = bookingRequestDTO.getUserId();
		
		Integer roomId = bookingRequestDTO.getRoomId();
		
		
		Optional<User> optionaluser = userRepository.findById(userId);
		
		if(!optionaluser.isPresent()) {
			
			throw new RuntimeException("user id: "+ userId + " not present.");
		}
		
		User user = optionaluser.get(); //changes Integer to Object (complete user object - not just userId)
		
		
		
		Optional<Room> optionalRoom = roomRepository.findById(roomId);
		
		if(!optionalRoom.isPresent()) {
			
			throw new RuntimeException("room id: "+ roomId + " not present.");
			
		}
		
		Room room = optionalRoom.get(); //changes Integer to Object (complete room object - not just roomId)
		
		
		
		LocalDate checkInDate = LocalDate.parse(bookingRequestDTO.getCheckInDate());  // changes string to LocalDate
		
		LocalDate checkOutDate = LocalDate.parse(bookingRequestDTO.getCheckOutDate());
		
		
		/* ----- CHECKING PREVOUS BOOKINGS ----- */
		
		
		
		List<CheckInOut> previousCheckInOutDetails = checkInOutRepository.findBookings(roomId, checkInDate, checkOutDate);
		
		if(!previousCheckInOutDetails.isEmpty()) {
			
			throw new RuntimeException("Room is already booked for the selected dates");
			
		}
		
		
		/* ----- BOOKING ----- */
		
		
		Booking booking = BookingMapper.toEntity(bookingRequestDTO); //from BookingRequestDTO to Entity
		
		booking.setUser(user);
		
		booking.setRoom(room);
		
		booking.setCreatedAt(LocalDateTime.now());
		
		booking.setBookingStatus(BookingStatus.PENDING);

		
		Booking savedBooking = bookingRepository.save(booking); //save Entity
		
		
		/* ----- SAVE BOOKED DETAILS IN CHECKINOUT ----- */
		
		CheckInOut check = new CheckInOut();
		
		check.setCheckInDate(checkInDate);
		check.setCheckOutDate(checkOutDate);
		check.setCheckInOutStatus(CheckInOutStatus.PENDING);
		check.setBooking(savedBooking);
		check.setRoom(room);
		check.setUser(user);
		check.setAdmin(null);
		
		checkInOutRepository.save(check); //saving details in CheckInOut table		
		
		/* ----- x ----- */
		
		BookingResponseDTO bookingResponseDTO = BookingMapper.toBookingResponseDTO(savedBooking); // from Entity to BookingResponseDTO
		
		return bookingResponseDTO;
		

	}
	

	

	
}
