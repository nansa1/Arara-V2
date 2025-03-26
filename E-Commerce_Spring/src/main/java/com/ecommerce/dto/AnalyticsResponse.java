package com.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class AnalyticsResponse {

    private Long currentMonthOrders;
    private Long previousMonthOrders;
    private Long currentMonthEarnings;
    private Long previousMonthEarnings;

    private Long placed;
    private Long shipped;
    private Long delivered;
    
    
    
	public AnalyticsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnalyticsResponse(Long currentMonthOrders, Long previousMonthOrders, Long currentMonthEarnings,
			Long previousMonthEarnings, Long placed, Long shipped, Long delivered) {
		super();
		this.currentMonthOrders = currentMonthOrders;
		this.previousMonthOrders = previousMonthOrders;
		this.currentMonthEarnings = currentMonthEarnings;
		this.previousMonthEarnings = previousMonthEarnings;
		this.placed = placed;
		this.shipped = shipped;
		this.delivered = delivered;
	}
	public Long getCurrentMonthOrders() {
		return currentMonthOrders;
	}
	public void setCurrentMonthOrders(Long currentMonthOrders) {
		this.currentMonthOrders = currentMonthOrders;
	}
	public Long getPreviousMonthOrders() {
		return previousMonthOrders;
	}
	public void setPreviousMonthOrders(Long previousMonthOrders) {
		this.previousMonthOrders = previousMonthOrders;
	}
	public Long getCurrentMonthEarnings() {
		return currentMonthEarnings;
	}
	public void setCurrentMonthEarnings(Long currentMonthEarnings) {
		this.currentMonthEarnings = currentMonthEarnings;
	}
	public Long getPreviousMonthEarnings() {
		return previousMonthEarnings;
	}
	public void setPreviousMonthEarnings(Long previousMonthEarnings) {
		this.previousMonthEarnings = previousMonthEarnings;
	}
	public Long getPlaced() {
		return placed;
	}
	public void setPlaced(Long placed) {
		this.placed = placed;
	}
	public Long getShipped() {
		return shipped;
	}
	public void setShipped(Long shipped) {
		this.shipped = shipped;
	}
	public Long getDelivered() {
		return delivered;
	}
	public void setDelivered(Long delivered) {
		this.delivered = delivered;
	}
    
    
    
}
