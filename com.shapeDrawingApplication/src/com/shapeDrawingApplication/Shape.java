package com.shapeDrawingApplication;

public class Shape {
	
void draw() {
	System.out.println("Area of:");
}
void draw(float radius) {
	
	System.out.println("Area of circle:"+Math.PI*radius*radius);
}
void draw(int length,int breadth) {
	
	System.out.println("Area of rectangle:"+length*breadth);
}
void draw(float base,float height) {
	
	System.out.println("Area of triangle:"+0.5f*base*height);
}
}
