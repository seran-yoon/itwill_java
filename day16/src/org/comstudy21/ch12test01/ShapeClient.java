package org.comstudy21.ch12test01;

public class ShapeClient {

	public static void main(String[] args) {
		
		//Shape Ÿ��(Shape�� ����)�� ���� ���� shape ���� 
		Shape shape = new Circle(10); //CircleŬ����('Shape'����Ŭ�������� ��ӹ��� ����Ŭ����)���� ��� �� �޾ƿ� 
		shape.area(); //�������� shape�� �̿��� ������ Ŭ�������� ���ϰ��� �޾ƿ� (���⼭�� ������ �ν��Ͻ��� �ϸ� �� 10�� �Է����־��� ������ CircleŬ������ area�޼ҵ忡�� 10�� ���� ������� ���Ϲ޾ƿ�!)
		
		shape = new Rectangle(10,5); //RectangleŬ����('Shape'����Ŭ�������� ��ӹ��� ����Ŭ����)���� ��� �� �޾ƿ�
		shape.area();
		
		shape = new Triangle(10,5); //TriangleŬ����('Shape'����Ŭ�������� ��ӹ��� ����Ŭ����)���� ��� �� �޾ƿ�
		shape.area();
		
	}

}
