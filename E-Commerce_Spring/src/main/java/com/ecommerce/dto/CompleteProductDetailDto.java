package com.ecommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompleteProductDetailDto {

    private ProductDto productDto;

    private List<FAQDto> faqDtoList;

    private List<ReviewDto> reviewDtoList;

	public ProductDto getProductDto() {
		return productDto;
	}

	public void setProductDto(ProductDto productDto) {
		this.productDto = productDto;
	}

	public List<FAQDto> getFaqDtoList() {
		return faqDtoList;
	}

	public void setFaqDtoList(List<FAQDto> faqDtoList) {
		this.faqDtoList = faqDtoList;
	}

	public List<ReviewDto> getReviewDtoList() {
		return reviewDtoList;
	}

	public void setReviewDtoList(List<ReviewDto> reviewDtoList) {
		this.reviewDtoList = reviewDtoList;
	}

	public CompleteProductDetailDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompleteProductDetailDto(ProductDto productDto, List<FAQDto> faqDtoList, List<ReviewDto> reviewDtoList) {
		super();
		this.productDto = productDto;
		this.faqDtoList = faqDtoList;
		this.reviewDtoList = reviewDtoList;
	}
    
    

}
