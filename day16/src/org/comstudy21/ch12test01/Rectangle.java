package org.comstudy21.ch12test01;

public class Rectangle extends Shape {
	
	//��� �ʵ�
	int w;
	int h;
	
	//������
	public Rectangle(){}
	
	public Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	
	//�θ� Ŭ������ �߻�޼ҵ带 ����! -> ��ӹ��� �ڽ�Ŭ������ ���̻� �߻�Ŭ������ �ƴϰ� ��
	public void area() {
		System.out.println("Rectangle res => " + (w*h));
	}

}
