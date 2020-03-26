package org.comstudy21.ch11ex03_t;

public class ChapeClient {
	
	
	public static void test02(String[] args) { //�迭�� ��Ƽ� ����ϱ�
	
		Shape[] array = new Shape[3];
		
		array[0] = new Circle(10);
		array[1] = new Rectangle(10,10);
		array[2] = new Triangle(10,10);
		
		for(int i=0;i<array.length;i++){
			if (array[i] instanceof Circle){
				((Circle)array[i]).area(5);
			}
			if (array[i] instanceof Rectangle) {
				((Rectangle)array[i]).area(5,5);
			}
			if (array[i] instanceof Triangle) {
				((Triangle)array[i]).area(5,5);
			}
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Shape shape = new Circle(10);
		shape.area();
		if(shape instanceof Circle){
			//Circle���� �����ϴ� �޼ҵ�� ĳ���� �ؾ� ��� ����
			((Circle)shape).area(1);
		}
		
		shape = new Rectangle(10,10);
		shape.area();
		if(shape instanceof Rectangle){
			((Rectangle)shape).area();
		}
		
		shape = new Triangle(10,10);
		shape.area();
		if(shape instanceof Triangle){
			((Triangle)shape).area();
		}
	}
	
	
}
