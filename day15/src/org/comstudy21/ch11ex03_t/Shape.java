package org.comstudy21.ch11ex03_t;

//�߻����� ������ ���� Ŭ�����̴�
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
