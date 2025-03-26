package com.ecommerce.dto;

import lombok.Data;

@Data
public class QuantityChangeProductDto {

    private Long productId;

    private Long userId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public QuantityChangeProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuantityChangeProductDto(Long productId, Long userId) {
		super();
		this.productId = productId;
		this.userId = userId;
	}

    
	
    
}
