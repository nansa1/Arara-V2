package com.ecommerce.dto;

import com.ecommerce.enums.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Data
public class OrderDto {

    private String orderDescription;

    private List<CartItemsDto> cartItems;

    private Long id;

    private Date date;

    private UUID trackingId;

    private Long amount;

    private String address;

    private OrderStatus status;

    private String payment;

    private String userName;

    private Long totalAmount;

    private Long discount;
    private String couponName;
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public List<CartItemsDto> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItemsDto> cartItems) {
		this.cartItems = cartItems;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UUID getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(UUID trackingId) {
		this.trackingId = trackingId;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDto(String orderDescription, List<CartItemsDto> cartItems, Long id, Date date, UUID trackingId,
			Long amount, String address, OrderStatus status, String payment, String userName, Long totalAmount,
			Long discount, String couponName) {
		super();
		this.orderDescription = orderDescription;
		this.cartItems = cartItems;
		this.id = id;
		this.date = date;
		this.trackingId = trackingId;
		this.amount = amount;
		this.address = address;
		this.status = status;
		this.payment = payment;
		this.userName = userName;
		this.totalAmount = totalAmount;
		this.discount = discount;
		this.couponName = couponName;
	}
    
    
    
}
