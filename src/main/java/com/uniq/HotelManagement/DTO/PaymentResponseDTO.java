package com.uniq.HotelManagement.DTO;

import java.time.LocalDateTime;

public class PaymentResponseDTO {

	private String transactionId;
	private Double amount;
	private String method;
	private String status;
	private LocalDateTime paymentDate;

	public PaymentResponseDTO() {
		super();

	}

	public PaymentResponseDTO(String transactionId, Double amount, String method, String status,
			LocalDateTime paymentDate) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "PaymentResponseDTO [transactionId=" + transactionId + ", amount=" + amount + ", method=" + method
				+ ", status=" + status + ", paymentDate=" + paymentDate + "]";
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

}
