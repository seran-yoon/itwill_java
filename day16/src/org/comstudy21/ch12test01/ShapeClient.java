package org.comstudy21.ch12test01;

public class ShapeClient {

	public static void main(String[] args) {
		
		//Shape 타입(Shape를 참조)의 참조 변수 shape 선언 
		Shape shape = new Circle(10); //Circle클래스('Shape'슈퍼클래스에서 상속받은 서브클래스)에서 출력 값 받아옴 
		shape.area(); //참조변수 shape를 이용해 각각의 클래스에서 리턴값을 받아옴 (여기서는 위에서 인스턴스를 하며 값 10을 입력해주었기 때문에 Circle클래스의 area메소드에서 10을 넣은 결과값을 리턴받아옴!)
		
		shape = new Rectangle(10,5); //Rectangle클래스('Shape'슈퍼클래스에서 상속받은 서브클래스)에서 출력 값 받아옴
		shape.area();
		
		shape = new Triangle(10,5); //Triangle클래스('Shape'슈퍼클래스에서 상속받은 서브클래스)에서 출력 값 받아옴
		shape.area();
		
	}

}
