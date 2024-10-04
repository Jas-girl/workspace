package com.shapeDrawingApplication;

import java.util.Scanner;

public class Mainclass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Shape shape=new Shape();
	System.out.println("Enter the radius");
	shape.draw(sc.nextFloat());
	System.out.println("enter the length");
	System.out.println("enter the breadth");
	shape.draw(sc.nextInt(),sc.nextInt());
	System.out.println("enter the base");
	System.out.println("enter the height");
	shape.draw(sc.nextFloat(),sc.nextFloat());
	
}
}
