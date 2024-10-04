package com.onlineStore;

public class Electronics extends Product{
	Electronics(String name,float price,int qty){
		super.name=name;
		super.price=price;
		super.quantity=qty;
		
		
	}
	 @Override
	public String toString() {
		return "Electronics [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	float calculateDiscount() {
		 super.price=price-(price*0.20f*quantity);
		 return price;
	 }
   
}
