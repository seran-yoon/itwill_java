package org.comstudy21.ch11ex03;

public class Triangle extends Shape{
	int W;
	int h;
	
	void area(int W, int h) {
		
		double area = W*h*1/2;
		
		System.out.print("Triangle >>> ");
		System.out.println(area);
	}

}
