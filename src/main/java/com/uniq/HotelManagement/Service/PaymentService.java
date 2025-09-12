package com.uniq.HotelManagement.Service;

import java.util.List;

import com.uniq.HotelManagement.DTO.PaymentRequestDTO;
import com.uniq.HotelManagement.DTO.PaymentResponseDTO;

public interface PaymentService {
	
	 PaymentResponseDTO addPayment(PaymentRequestDTO requestDTO);

	    List<PaymentResponseDTO> getAllPayments();

	    PaymentResponseDTO getPaymentById(Long id);

}
