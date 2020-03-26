package org.comstudy21.ch12test01;

public class Triangle extends Shape {
	
	//멤버 필드
	int w;
	int h;
	
	//생성자
	public Triangle(){}
	
	public Triangle(int w, int h){
		this.w = w;
		this.h = h;
	}

	//부모 클래스의 추상메소드를 구현! -> 상속받은 자식클래스는 더이상 추상클래스가 아니게 됨
	public void area() {
		System.out.println("Triangle res => " + (w*h/2));
	}

}
