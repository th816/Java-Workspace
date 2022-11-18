package com.kh.chap03_class.model.vo;

public class Product {

	//클래스 선언 구문에 사용 가능한 접근 제한자 : public, default
	//public으로해야 다른 패키지에서 접근 가능
	//default로 설정한 경우 같은 패키지에서만 접근 가능 / 다른패키지에서 접근 불가
	
	//상품명, 상품가격, 브랜드
	
	private String pName;
	private int price;
	private String brand = "애플";
	
	public void setpName(String pName) {
		
		
		this.pName = pName;
	}
	
	
	
	public void setPrice(int price) {
		
		this.price = price;
		
	}
	
	
	public void setBrand(String brand) {
		
		this.brand = brand;
		
	}
	
	
	public String getpName() { 
		
		return pName; // 
	
	}
	

	
	public int getPrice() {
		return price;
		
		
	}
	
	
	public String getBrand() { 
		
		return brand; // 
	
	}
	
	
	public String information() {
		
		
		return pName+"의 가격은"+price+"원이고 브랜드는"+brand+"입니다.";
	

}
}
