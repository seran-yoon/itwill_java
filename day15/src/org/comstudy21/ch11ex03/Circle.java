package org.comstudy21.ch11ex03;

public class Circle extends Shape {
	int r;
	
	void area(int r){
		
		double area = r*r*3.14;
		
		System.out.print("Circle >>> ");
		System.out.println(area);
	}
	

}
