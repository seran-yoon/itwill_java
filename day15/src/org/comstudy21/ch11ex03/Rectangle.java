package org.comstudy21.ch11ex03;

public class Rectangle extends Shape {
	int W;
	int h;
	
	void area(int W, int h){
		
		double area = W*h;
		
		System.out.print("Rectangle >>> ");
		System.out.println(area);
	}

	
}
