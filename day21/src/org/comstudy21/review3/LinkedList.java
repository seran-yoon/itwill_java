package org.comstudy21.review3;

abstract class Shape {
	public Shape next;
	
	abstract void draw(); //추상메소드로 남겨두고, 하위클래스 애들이 지정하게 만들어 놓음

}

class Line extends Shape {

	@Override
	void draw() {
		System.out.println("Line 그리기~");
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Circle 그리기~");
	}

}

class Rect extends Shape {

	@Override
	void draw() {
		System.out.println("Rect 그리기~");
	}

}

public class LinkedList {

	Shape start, last, obj;

	public LinkedList() {
//		add();
//		print();
	}

	public void print() {
		Shape p = start;
		p.draw();
		p = p.next;

	}
	
	public void add(Shape shape) {
		
//		start = new Circle();
//		last = start;
//
//		obj = new Line();
//		last.next = obj;
//		last = last.next; // last.next=obj
//
//		obj = new Circle();
//		last.next = obj;
//		last = last.next; // last.next=obj
//
//		obj = new Rect();
//		last.next = obj;
//		last = last.next; // last.next=obj
		
		if(start == null){
			start = shape;
			last = start;
			return;
		}
		obj = shape;
		last.next = obj;
		last = last.next;

	}

	public static void main(String[] args) {
		
//		new LinkedList();
		
		 LinkedList list = new LinkedList();
		 list.add(new Circle());
		 list.add(new Line());
		 list.add(new Rect());
		 list.add(new Circle());
		 list.add(new Line());
		 list.print();
		
	}

}
