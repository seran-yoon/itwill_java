package org.comstudy21.ch12ex01;

public class ShapeClient {
	
	public static void main(String[] args) {
		
		Shape shape = new Circle(10); //추상클래스로 참조변수는 선언 가능
//		Shape shape = new Shape(); //추상클래스로는 인스턴스를 만들 수 없다  
		
		shape.area();
		
	}

}
