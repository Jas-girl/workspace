package com.onlineStore;

public class Mymainclass {
public static void main(String[] args) {
	Electronics obj=new Electronics("Tv", 20000, 1);
	System.out.println(obj);
	System.out.println("Total price:"+obj.calculateDiscount());
	
	Clothing obj1=new Clothing("T-shirt", 1000, 2);
	System.out.println(obj1);
	System.out.println("Total price:"+obj1.calculateDiscount());
	
	Grocery obj2=new Grocery("Apples", 120, 2);
	System.out.println(obj2);
	System.out.println("Total price:"+obj2.calculateDiscount());
	
}
}
