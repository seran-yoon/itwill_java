package org.comstudy21.ch11ex03_t;

public class Rectangle extends Shape {
	
	private int w;
	private int h;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int w, int h){
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
		super.setRes(w*h); //setRes() 이렇게 써도 됨 이미 상속받아서 내꺼처럼 사용중이기 때문
		System.out.println("R.res => " + super.getRes());
	}
	
	public void area(int w, int h){
		this.w = w;
		this.h = h;
		this.area();
	}
	
}
