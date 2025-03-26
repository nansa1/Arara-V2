package com.ecommerce.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class SecondProductDto {

    private Long id;

    private String name;

    private String rating;

    private Long availableQuantity;

    private Long price;

    private String description;

    private MultipartFile img;

    private byte[] returnedImg;

    private String categoryId;

	public SecondProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondProductDto(Long id, String name, String rating, Long availableQuantity, Long price, String description,
			MultipartFile img, byte[] returnedImg, String categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.availableQuantity = availableQuantity;
		this.price = price;
		this.description = description;
		this.img = img;
		this.returnedImg = returnedImg;
		this.categoryId = categoryId;
	}

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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Long getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImg() {
		return img;
	}

	public void setImg(MultipartFile img) {
		this.img = img;
	}

	public byte[] getReturnedImg() {
		return returnedImg;
	}

	public void setReturnedImg(byte[] returnedImg) {
		this.returnedImg = returnedImg;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

    
    
    
}
