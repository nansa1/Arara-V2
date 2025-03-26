package com.ecommerce.dto;

import lombok.Data;

@Data
public class CartItemsDto {

    private Long id;

    private Long price;

    private Long quantity;

    private Long productId;

    private Long orderId;

    private String productName;

    private byte[] returnedImg;

    private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public byte[] getReturnedImg() {
		return returnedImg;
	}

	public void setReturnedImg(byte[] returnedImg) {
		this.returnedImg = returnedImg;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public CartItemsDto(Long id, Long price, Long quantity, Long productId, Long orderId, String productName,
			byte[] returnedImg, Long userId) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.productId = productId;
		this.orderId = orderId;
		this.productName = productName;
		this.returnedImg = returnedImg;
		this.userId = userId;
	}

	public CartItemsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
    
}
