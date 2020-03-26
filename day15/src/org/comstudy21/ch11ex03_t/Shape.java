package org.comstudy21.ch11ex03_t;

//추상적인 개념이 강한 클래스이다
public class Shape {
	//field
	private double res;
	
	//constructor
	public Shape(){
		
	}
	
	public Shape(double res){
		this.res = res;
	}

	//Setters & Getters
	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	
	//method
	public void area(){
		System.out.println("res => " + res);
	}
	

	
}
