package org.comstudy21.ch12ex01;

//추상클래스를 상속받은 클래스도 추상클래스이다
//부모의 추상멤버를  구현하면 추상클래스가 아니게 된다
//부모의 추상메소드는 서브클래스에서 구현하는 "약속"!
public class Circle extends Shape {
	
	//필드
	int r;
	
	//생성자
	public Circle(){}
	
	public Circle(int r){
		this.r = r;
	}
	
	//부모클래스의 추상메소드 구현
	public void area(){
		System.out.println("res => " + (Math.PI*r*r));
	}

}
