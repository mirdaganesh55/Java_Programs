package com.java.oops;

enum OrderStatus {
	
	PENDING, ACCEPTED, REJECTED, DELIVERED
}

public class EnumEx1 {

	public static void main(String[] args) {
		OrderStatus status = OrderStatus.PENDING;
		System.out.println(status);
	}
}
