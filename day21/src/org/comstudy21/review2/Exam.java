package org.comstudy21.review2;

//슈퍼클래스
class Shape{
	public Shape next; //Shape타입의 변수 -> Shape클래스는 슈퍼클래스(부모클래스)이기때문에 하위클래스들이 모두 상속받게 된다
	
	public Shape() { //생성자
	}
	
	public void draw(){ //Shape클래스의 draw메소드
	System.out.println("Shape");	
	}
}

class Line extends Shape{
	public void draw(){ //Line클래스의 draw메소드
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void draw(){ //Circle클래스의 draw메소드
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	public void draw(){ //Rect클래스의 draw메소드
		System.out.println("Rect");
	}
}

public class Exam {
	
	public static void main(String[] args) {
		Shape start;
		Shape last;
		Shape obj;
		
		start = new Line(); //start = Line 
		last = start; //last = Line(위에서 start에 Line을 넣어줬기 때문)
		//start, last 모두 Line이 들어가 있음
		
		obj = new Rect(); //obj = Rect
		last.next = obj; //last.next(Line의 next) = Rect(위에서 obj에 Rect를 넣어줬기 때문)
		last = obj; //last = Rect
		//start는 변함없이 Line, obj는 Rect, last는 Line에서 Rect로 바뀜
		
		obj = new Line(); //obj = Line
		last.next = obj; //last.next(Rect의 next) = Line(위에서 obj에 Line을 넣어줬기 때문)
		last = obj; //last = Line
		//start는 변함없이 Line, obj는 Rect에서 Line으로 바뀜, last는 Rect에서 Line로 바뀜
		
		obj = new Circle(); // obj = Circle
		last.next = obj; //last.next(Line의 next) = Circle(위에서 obj에 Circle을 넣어줬기 때문)
		//start는 변함없이 Line, obj는 Line에서 Circle로 바뀜, last는 변함없이 Line
		
		Shape p = start; //Shape타입의 Shape클래스를 참조하는 참조변수 p를 선언후, 초기화하며 start값을 넣어줌
		
		while(p != null){ //p가 빈값이 아니면 반복문을 계속 돌려서 next에 있는 값(위에서 각각 넣어준 클래스에 가면 있는 draw메소드)을 꺼내옴
			p.draw();
			p = p.next;
		}
	}

}
