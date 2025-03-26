package com.ecommerce.dto;

import lombok.Data;

@Data
public class FAQDto {

    private Long id;

    private String question;

    private String answer;

    private Long productId;

    private String productName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public FAQDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FAQDto(Long id, String question, String answer, Long productId, String productName) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.productId = productId;
		this.productName = productName;
	}

    
    
}
