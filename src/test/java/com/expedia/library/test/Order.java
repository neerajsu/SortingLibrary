package com.expedia.library.test;

public class Order {
	public Order(Integer orderNo, String orderName) {
		super();
		this.orderNo = orderNo;
		this.orderName = orderName;
	}
	private Integer orderNo;
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	private String orderName;
}
