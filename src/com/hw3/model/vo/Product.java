package com.hw3.model.vo;

public class Product {
	
	private int pld; // 제품 번호
	private String pName; // 제품명
	private int price; // 제품 가격
	private double tax; // 제품 세금
	
	//기본생성자
	public Product() {}
	// 매개변수 생성자로 Product 객체 생성시마다 ProductController의 객체 수 카운트를 1 증가
	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}

	public int getPld() {
		return pld;
	}

	public void setPld(int pld) {
		this.pld = pld;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String information() {
		return "제품번호 : " + pld + "\n제품명 : " + pName + "\n제품 가격 : " 
										+ price + "\n제품 세금 : " + tax;
	}
	
	
	
}
