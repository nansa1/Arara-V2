package com.ecommerce.entity;

import com.ecommerce.dto.OrderDto;
import com.ecommerce.enums.OrderStatus;
import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderDescription;

    private Date date;

    private Long amount;

    private String address;

    private String payment;

    private OrderStatus status;

    private Long totalAmount;

    private Long discount;

    private UUID trackingId;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "coupon_id", referencedColumnName = "id")
    private Coupon coupon;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<CartItems> cartItems;

    
    public Order(Long id, String orderDescription, Date date, Long amount, String address, String payment,
			OrderStatus status, Long totalAmount, Long discount, UUID trackingId, Coupon coupon, User user,
			List<CartItems> cartItems) {
		super();
		this.id = id;
		this.orderDescription = orderDescription;
		this.date = date;
		this.amount = amount;
		this.address = address;
		this.payment = payment;
		this.status = status;
		this.totalAmount = totalAmount;
		this.discount = discount;
		this.trackingId = trackingId;
		this.coupon = coupon;
		this.user = user;
		this.cartItems = cartItems;
	}


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getOrderDescription() {
		return orderDescription;
	}


	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
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


	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
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


	public UUID getTrackingId() {
		return trackingId;
	}


	public void setTrackingId(UUID trackingId) {
		this.trackingId = trackingId;
	}


	public Coupon getCoupon() {
		return coupon;
	}


	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<CartItems> getCartItems() {
		return cartItems;
	}


	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}


	public OrderDto getOrderDto() {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(id);
        orderDto.setOrderDescription(orderDescription);
        orderDto.setAddress(address);
        orderDto.setTrackingId(trackingId);
        orderDto.setAmount(amount);
        orderDto.setDate(date);
        orderDto.setPayment(payment);
        orderDto.setStatus(status);
        orderDto.setUserName(user.getName());
        if(coupon != null){
            orderDto.setCouponName(coupon.getName());
        }
        return orderDto;
    }

}
