package org.comstudy21.ch11ex03;

public class resultMain {

	static void ����(Shape shape) {
		
		shape.area();
		
		if (shape instanceof Circle) {
			((Circle)shape).area(2);
		} else if(shape instanceof Rectangle){
			((Rectangle)shape).area(2,3);
		} else if(shape instanceof Triangle){
			((Triangle)shape).area(2,3);
		}
	}
	
	public static void main(String[] args) {
		
		����(new Circle());
		����(new Rectangle());
		����(new Triangle());
	
	}
}


// instanceof -> Ŭ���� ����ȯ