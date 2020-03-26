package org.comstudy21.ch11ex03_t;

public class Circle extends Shape{
	
	private int r;
	
	public Circle() {
		
	}
	
	public Circle(int r){
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void area(){
		super.setRes(Math.PI*r*r);
		System.out.println("C.res => " + super.getRes());
	}
	
	public void area(int r){
		this.r = r;
		this.area();
	}

}
