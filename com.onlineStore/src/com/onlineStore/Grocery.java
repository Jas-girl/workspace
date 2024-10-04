package com.onlineStore;

public class Grocery extends Product {
	Grocery(String name,float price,int qty){
		super.name=name;
		super.price=price;
		super.quantity=qty;
		
		
	}
	 @Override
	public String toString() {
		return "Grocery [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	float calculateDiscount() {
		 super.price=price-(price*0.15f*quantity);
		 return price;
	 }
}
