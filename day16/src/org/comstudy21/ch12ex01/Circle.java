package org.comstudy21.ch12ex01;

//�߻�Ŭ������ ��ӹ��� Ŭ������ �߻�Ŭ�����̴�
//�θ��� �߻�����  �����ϸ� �߻�Ŭ������ �ƴϰ� �ȴ�
//�θ��� �߻�޼ҵ�� ����Ŭ�������� �����ϴ� "���"!
public class Circle extends Shape {
	
	//�ʵ�
	int r;
	
	//������
	public Circle(){}
	
	public Circle(int r){
		this.r = r;
	}
	
	//�θ�Ŭ������ �߻�޼ҵ� ����
	public void area(){
		System.out.println("res => " + (Math.PI*r*r));
	}

}
