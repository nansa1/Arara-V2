package com.ecommerce.dto;

import lombok.Data;

import java.util.Date;


@Data
public class CouponDto {

    private Long id;

    private String name;

    private String code;


    private Long discount;

    private Date expirationDate;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getDiscount() {
		return discount;
	}

	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public CouponDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CouponDto(Long id, String name, String code, Long discount, Date expirationDate) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.discount = discount;
		this.expirationDate = expirationDate;
	}
    
    
    
}
