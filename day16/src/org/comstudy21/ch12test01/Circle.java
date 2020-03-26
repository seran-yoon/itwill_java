package org.comstudy21.ch12test01;

public class Circle extends Shape{
	
	//멤버 필드
	int r;
	
	//생성자
	public Circle(){}
	
	public Circle(int r){
		this.r = r;
	}
	
	//부모 클래스의 추상메소드를 구현! -> 상속받은 자식클래스는 더이상 추상클래스가 아니게 됨
	public void area(){
		System.out.println("Circle res => " + (Math.PI*r*r));
	}

}
