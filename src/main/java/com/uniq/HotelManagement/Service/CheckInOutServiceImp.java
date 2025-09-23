package com.uniq.HotelManagement.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.DTO.CheckInOutRequestDTO;
import com.uniq.HotelManagement.DTO.CheckInResponseDTO;
import com.uniq.HotelManagement.DTO.CheckOutResponseDTO;
import com.uniq.HotelManagement.Entity.Admin;
import com.uniq.HotelManagement.Entity.CheckInOut;
import com.uniq.HotelManagement.Entity.Room;
import com.uniq.HotelManagement.Enum.CheckInOutStatus;
import com.uniq.HotelManagement.Enum.RoomStatus;
import com.uniq.HotelManagement.Mapper.CheckInOutMapper;
import com.uniq.HotelManagement.Repository.AdminRepository;
import com.uniq.HotelManagement.Repository.CheckInOutRepository;
import com.uniq.HotelManagement.Repository.RoomRepository;

import jakarta.transaction.Transactional;

@Service
public class CheckInOutServiceImp implements CheckInOutService{
	
	public CheckInOutRepository checkInOutRepository;

	public AdminRepository adminRepository;
	
	public RoomRepository roomRepository;
	
	@Autowired
	public CheckInOutServiceImp(CheckInOutRepository checkInOutRepository, AdminRepository adminRepository, RoomRepository roomRepository) {
		
		this.checkInOutRepository = checkInOutRepository;
		this.adminRepository = adminRepository;
		this.roomRepository = roomRepository;
		
	}
	
	
	/* ----- UPDATE STATUS TO CHECK-IN ----- */
	
	@Transactional
	public CheckInResponseDTO checkIn(CheckInOutRequestDTO checkInDTO) {
		
		String adminEmail = checkInDTO.getAdminEmail();
		
		Integer checkInOutId = checkInDTO.getCheckInOutId();
		
		
		/* ----- VALIDATE ADMIN EMAIL ----- */
		
		Optional<Admin> adminEmailId = adminRepository.findByAdminEmail(adminEmail);
		
        if(!adminEmailId.isPresent()) {
			
			throw new RuntimeException("EmailId " + adminEmail + " is not present");
		}
		
		Admin admin = adminEmailId.get();
		
		/* ----- VALIDATE ID ----- */
		
		Optional<CheckInOut> checkId= checkInOutRepository.findById(checkInOutId);
		
        if(!checkId.isPresent()) {
			
			throw new RuntimeException("CheckInOut Id " + checkInOutId + " is not present");
		}
        
        CheckInOut checkInOut = checkId.get();
        
        /* ----- UPDATE CHECKIN STATUS ----- */
                
        checkInOut.setAdmin(admin);
        checkInOut.setCheckInOutStatus(CheckInOutStatus.CHECKEDIN);
        checkInOut.setCreatedAt(LocalDateTime.now());
        
        CheckInOut savedCheckInOut = checkInOutRepository.save(checkInOut);
        
        /* ----- UPDATE TODAY'S ROOM STATUS ----- */
        
        Room room = checkInOut.getRoom();
        
        room.setRoomStatus(RoomStatus.BOOKED);
        
        roomRepository.save(room);
        
        /* ----- x ----- */
        
        CheckInResponseDTO CheckInResponseDTO = CheckInOutMapper.toCheckInResponseDTO(savedCheckInOut);
        
        return CheckInResponseDTO;
		
	}
	
	
	/* ----- UPDATE STATUS TO CHECK-OUT ----- */
	
	@Transactional
	public CheckOutResponseDTO checkOut(CheckInOutRequestDTO checkInDTO) {
		
        String adminEmail = checkInDTO.getAdminEmail();
		
		Integer checkInOutId = checkInDTO.getCheckInOutId();
		
		
		/* ----- VALIDATE ADMIN EMAIL ----- */
		
		Optional<Admin> adminEmailId = adminRepository.findByAdminEmail(adminEmail);
		
		if(!adminEmailId.isPresent()) {
			
			throw new RuntimeException("EmailId " + adminEmail + " is not present");
			
		}
		
		Admin admin = adminEmailId.get();
		
		/* ----- VALIDATE ID ----- */
		
		Optional<CheckInOut> checkId = checkInOutRepository.findById(checkInOutId);
		
        if(!checkId.isPresent()) {
			
			throw new RuntimeException("CheckInOut Id " + checkInOutId + " is not present");
		}
        
        CheckInOut checkInOut = checkId.get();
        
        /* ----- UPDATE CKECKOUT STATUS ----- */
                
        checkInOut.setAdmin(admin);
        checkInOut.setCheckInOutStatus(CheckInOutStatus.CHECKEDOUT);
        checkInOut.setUpdatedAt(LocalDateTime.now());
        
        CheckInOut savedCheckInOut = checkInOutRepository.save(checkInOut);
        
        /* ----- UPDATE TODAY'S ROOM STATUS ----- */
        
        Room room = checkInOut.getRoom();
        
        room.setRoomStatus(RoomStatus.AVAILABLE);
        
        roomRepository.save(room);
        
        /* ----- x ----- */
        
        CheckOutResponseDTO CheckOutResponseDTO = CheckInOutMapper.toCheckOutResponseDTO(savedCheckInOut);
        
        return CheckOutResponseDTO;
		
	}
	

}