package org.comstudy21.ch11ex03_t;

public class Triangle extends Shape {
	
	private int w;
	private int h;
	
	public Triangle(){
		
	}
	
	public Triangle(int w, int h){
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public void area(){
		setRes(w*h/2);
		System.out.println("T.res => " + getRes());
	}
	
	public void area(int w, int h){
		this.w = w;
		this.h = h;
		this.area();
	}
}
