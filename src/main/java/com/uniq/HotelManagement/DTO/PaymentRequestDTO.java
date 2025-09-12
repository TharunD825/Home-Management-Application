package com.uniq.HotelManagement.DTO;

public class PaymentRequestDTO {
	
	private int bookingId;
	private Double amount;
	private String method; //cash , upi
	
	public PaymentRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentRequestDTO(int bookingId, Double amount, String method) {
		super();
		this.bookingId = bookingId;
		this.amount = amount;
		this.method = method;
	}
	@Override
	public String toString() {
		return "PaymentRequestDTO [bookingId=" + bookingId + ", amount=" + amount + ", method=" + method + "]";
	}
	public int getbookingId() {
		return bookingId;
	}
	public void setPaymentId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getmethod() {
		return method;
	}
	public void setPaymentMethod(String method) {
		this.method = method;
	}

}
