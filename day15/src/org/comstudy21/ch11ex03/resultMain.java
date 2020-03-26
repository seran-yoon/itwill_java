package org.comstudy21.ch11ex03;

public class resultMain {

	static void 도형(Shape shape) {
		
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
		
		도형(new Circle());
		도형(new Rectangle());
		도형(new Triangle());
	
	}
}


// instanceof -> 클래스 형변환