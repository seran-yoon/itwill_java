package org.comstudy21.ch10ex01;

import org.comstudy21.ch10ex02.AccessSuper;

public class Ch10Ex02 {
	
	public static void showManager(AccessSuper access){ //super�� �����ϴ� �������� access ����
		System.out.println("::: showManager :::");
		access.show(); //���������� ���� show���� ������ ���
	}
	
	public static void main(String[] args) {
		showManager(new AccessSuper()); //AccessSuper access = new AccessSuper(); �� ���� ��  
		//Ÿ���� super , ��ü�� super => ��� super
		showManager(new AccessSub()); //AccessSuper access = new AccessSub(); �� ���� �� 
		//Ÿ���� super, ��ü�� sub => ��� sub
	}

	
	
	public static void test(String[] args) {
		
		//AccessSub sub = new AccessSub();
		//AccessSub sub = new AccessSuper(); //����� �����ִ� Sub�� �̷������� ����
		AccessSuper sub = new AccessSub(); //ū�ſ� ������ ���°� -> ����Ѿ��� ���������� ��ӹ��������׼� ����
		//Ÿ���� Super, ��ü�� Sub ->��ü�� ���� �����
		
//		System.out.println("a => " + sub.a); //private�̶� ����
//		System.out.println("b => " + sub.b); //default�̶� ����
//		System.out.println("c => " + sub.c); //protected�̶� ����
		//System.out.println("d => " + sub.d);
		
		sub = new AccessSuper(); //Super���� sub�� �ٲ���(�̰� �Ⱦ��� Sub���� sub�� ����)
		
		sub.show(); //AccessSub�� �ִ� show�� ����Ǵ°� -> AccessSub�� ���������̱� ������
	}
}
