package org.comstudy21.review3;

abstract class Shape {
	public Shape next;
	
	abstract void draw(); //�߻�޼ҵ�� ���ܵΰ�, ����Ŭ���� �ֵ��� �����ϰ� ����� ����

}

class Line extends Shape {

	@Override
	void draw() {
		System.out.println("Line �׸���~");
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Circle �׸���~");
	}

}

class Rect extends Shape {

	@Override
	void draw() {
		System.out.println("Rect �׸���~");
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
