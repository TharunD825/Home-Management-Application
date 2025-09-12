package com.uniq.HotelManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.HotelManagement.DTO.PaymentRequestDTO;
import com.uniq.HotelManagement.Entity.Booking;
import com.uniq.HotelManagement.Entity.Payment;
import com.uniq.HotelManagement.Service.BookingService;
import com.uniq.HotelManagement.Service.PaymentService;

import ch.qos.logback.core.model.Model;

@RestController
public class PaymentController {
	
	private final PaymentService paymentService;
    private final BookingService bookingService;

    @Autowired
    public PaymentController(PaymentService paymentService, BookingService bookingService) {
        this.paymentService = paymentService;
        this.bookingService = bookingService;
    }
//
//    @GetMapping
//    public String listPayments(Model model) {
//        model.addAttribute("payments", paymentService.getAllPayments());
//        return "payment/payments";
//    }

    @PostMapping("/add")
    public String savePayment(@ModelAttribute PaymentRequestDTO requestDTO) {
        paymentService.addPayment(requestDTO);
        return "redirect:/payments";
    }

}
