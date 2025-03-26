package com.ecommerce.dto;

import lombok.Data;

@Data
public class OrderedProductDetails {

    private Long id;

    private String name;

    private Long productPrice;

    private Long quantity;

    private byte[] returnedImg;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public byte[] getReturnedImg() {
		return returnedImg;
	}

	public void setReturnedImg(byte[] returnedImg) {
		this.returnedImg = returnedImg;
	}

	public OrderedProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderedProductDetails(Long id, String name, Long productPrice, Long quantity, byte[] returnedImg) {
		super();
		this.id = id;
		this.name = name;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.returnedImg = returnedImg;
	}
    
    

}
