package com.ecommerce.dto;

import lombok.Data;

@Data
public class PlaceOrderDto {

    private Long userId;

    private String address;

    private String orderDescription;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public PlaceOrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceOrderDto(Long userId, String address, String orderDescription) {
		super();
		this.userId = userId;
		this.address = address;
		this.orderDescription = orderDescription;
	}

    
    

}
