package org.comstudy21.ch12test01;

public class Triangle extends Shape {
	
	//��� �ʵ�
	int w;
	int h;
	
	//������
	public Triangle(){}
	
	public Triangle(int w, int h){
		this.w = w;
		this.h = h;
	}

	//�θ� Ŭ������ �߻�޼ҵ带 ����! -> ��ӹ��� �ڽ�Ŭ������ ���̻� �߻�Ŭ������ �ƴϰ� ��
	public void area() {
		System.out.println("Triangle res => " + (w*h/2));
	}

}
