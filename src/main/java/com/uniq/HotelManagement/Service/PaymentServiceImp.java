package com.uniq.HotelManagement.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniq.HotelManagement.DTO.PaymentRequestDTO;
import com.uniq.HotelManagement.DTO.PaymentResponseDTO;
import com.uniq.HotelManagement.Entity.Booking;
import com.uniq.HotelManagement.Entity.Payment;
import com.uniq.HotelManagement.Repository.BookingRepository;
import com.uniq.HotelManagement.Repository.PaymentRepository;

@Service
public class PaymentServiceImp implements PaymentService{
	
	 private final PaymentRepository paymentRepository;
	    private final BookingRepository bookingRepository;

	    public PaymentServiceImp(PaymentRepository paymentRepository, BookingRepository bookingRepository) {
	        this.paymentRepository = paymentRepository;
	        this.bookingRepository = bookingRepository;
	    }

	    @Override
	    public PaymentResponseDTO addPayment(PaymentRequestDTO requestDTO) {
	        Booking booking = bookingRepository.findById(requestDTO.getbookingId())
	                .orElseThrow(() -> new RuntimeException("Booking not found"));

	        Payment payment = new Payment();
	        payment.setBooking(booking);
	        payment.setAmount(requestDTO.getAmount());
	        payment.setMethod(requestDTO.getmethod());
	        payment.setStatus("SUCCESS"); // In real life: integrate with gateway
	        payment.setPaymentDate(LocalDateTime.now());

	        Payment saved = paymentRepository.save(payment);

	        return mapToResponseDTO(saved);
	    }

	    @Override
	    public List<PaymentResponseDTO> getAllPayments() {
	        return paymentRepository.findAll()
	                .stream()
	                .map(this::mapToResponseDTO)
	                .toList();
	    }

	    @Override
	    public PaymentResponseDTO getPaymentById(Long id) {
	        Payment payment = paymentRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Payment not found"));
	        return mapToResponseDTO(payment);
	    }

	    private PaymentResponseDTO mapToResponseDTO(Payment entity) {
	        return new PaymentResponseDTO(
	        );
	    }
}

