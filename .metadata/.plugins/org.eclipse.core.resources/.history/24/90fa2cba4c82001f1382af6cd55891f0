package com.onlineStore;

public class Clothing extends Product {
	Clothing(String name,float price,int qty){
		super.name=name;
		super.price=price;
		super.quantity=qty;
		
	}
	
	float calculateDiscount() {
		 super.price=price-(price*0.1f*quantity);
		 return price;
	 }
	 @Override
		public String toString() {
			return "Clothing [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
		}
}
