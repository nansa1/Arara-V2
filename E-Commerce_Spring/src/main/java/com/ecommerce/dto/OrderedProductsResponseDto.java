package com.ecommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderedProductsResponseDto {

    private List<OrderedProductDetails> orderedProductDetailsList;

    private Long orderAmount;

	public List<OrderedProductDetails> getOrderedProductDetailsList() {
		return orderedProductDetailsList;
	}

	public void setOrderedProductDetailsList(List<OrderedProductDetails> orderedProductDetailsList) {
		this.orderedProductDetailsList = orderedProductDetailsList;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public OrderedProductsResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderedProductsResponseDto(List<OrderedProductDetails> orderedProductDetailsList, Long orderAmount) {
		super();
		this.orderedProductDetailsList = orderedProductDetailsList;
		this.orderAmount = orderAmount;
	}

    
}
