package org.comstudy21.review2;

//����Ŭ����
class Shape{
	public Shape next; //ShapeŸ���� ���� -> ShapeŬ������ ����Ŭ����(�θ�Ŭ����)�̱⶧���� ����Ŭ�������� ��� ��ӹް� �ȴ�
	
	public Shape() { //������
	}
	
	public void draw(){ //ShapeŬ������ draw�޼ҵ�
	System.out.println("Shape");	
	}
}

class Line extends Shape{
	public void draw(){ //LineŬ������ draw�޼ҵ�
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void draw(){ //CircleŬ������ draw�޼ҵ�
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	public void draw(){ //RectŬ������ draw�޼ҵ�
		System.out.println("Rect");
	}
}

public class Exam {
	
	public static void main(String[] args) {
		Shape start;
		Shape last;
		Shape obj;
		
		start = new Line(); //start = Line 
		last = start; //last = Line(������ start�� Line�� �־���� ����)
		//start, last ��� Line�� �� ����
		
		obj = new Rect(); //obj = Rect
		last.next = obj; //last.next(Line�� next) = Rect(������ obj�� Rect�� �־���� ����)
		last = obj; //last = Rect
		//start�� ���Ծ��� Line, obj�� Rect, last�� Line���� Rect�� �ٲ�
		
		obj = new Line(); //obj = Line
		last.next = obj; //last.next(Rect�� next) = Line(������ obj�� Line�� �־���� ����)
		last = obj; //last = Line
		//start�� ���Ծ��� Line, obj�� Rect���� Line���� �ٲ�, last�� Rect���� Line�� �ٲ�
		
		obj = new Circle(); // obj = Circle
		last.next = obj; //last.next(Line�� next) = Circle(������ obj�� Circle�� �־���� ����)
		//start�� ���Ծ��� Line, obj�� Line���� Circle�� �ٲ�, last�� ���Ծ��� Line
		
		Shape p = start; //ShapeŸ���� ShapeŬ������ �����ϴ� �������� p�� ������, �ʱ�ȭ�ϸ� start���� �־���
		
		while(p != null){ //p�� ���� �ƴϸ� �ݺ����� ��� ������ next�� �ִ� ��(������ ���� �־��� Ŭ������ ���� �ִ� draw�޼ҵ�)�� ������
			p.draw();
			p = p.next;
		}
	}

}
