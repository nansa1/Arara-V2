package com.ecommerce.dto;

import lombok.Data;

@Data
public class AdminSingleProductDto {

   private ProductDto productDto;

public ProductDto getProductDto() {
	return productDto;
}

public void setProductDto(ProductDto productDto) {
	this.productDto = productDto;
}

public AdminSingleProductDto() {
	super();
	// TODO Auto-generated constructor stub
}

public AdminSingleProductDto(ProductDto productDto) {
	super();
	this.productDto = productDto;
}
   


}
