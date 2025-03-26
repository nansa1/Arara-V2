package com.ecommerce.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrderDto {

    private float amount;

    private Date date;

    private String OrderDescription;

    private Long orderId;

	public ResponseOrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseOrderDto(float amount, Date date, String orderDescription, Long orderId) {
		super();
		this.amount = amount;
		this.date = date;
		OrderDescription = orderDescription;
		this.orderId = orderId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrderDescription() {
		return OrderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		OrderDescription = orderDescription;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
    
    
    

}
