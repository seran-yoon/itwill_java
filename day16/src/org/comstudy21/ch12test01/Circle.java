package org.comstudy21.ch12test01;

public class Circle extends Shape{
	
	//��� �ʵ�
	int r;
	
	//������
	public Circle(){}
	
	public Circle(int r){
		this.r = r;
	}
	
	//�θ� Ŭ������ �߻�޼ҵ带 ����! -> ��ӹ��� �ڽ�Ŭ������ ���̻� �߻�Ŭ������ �ƴϰ� ��
	public void area(){
		System.out.println("Circle res => " + (Math.PI*r*r));
	}

}
