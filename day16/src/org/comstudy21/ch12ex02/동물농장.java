package org.comstudy21.ch12ex02;

public class �������� {

	public static void main(String[] args) {
		
		���� ani = new ��();
		
		ani.play();
		System.out.println(); //�ٹٲ� �뵵
		
		
//		������ m = new ������(); //�������̽��� �ν��Ͻ��� �� ���� ������ ����
		//�������̽��� �ν��Ͻ��� ���� �� ������, �͸� Ŭ���� ���·� �ν��Ͻ� ���� ����
		������ m = new ������( ){

			@Override
			public void move() {
				System.out.println("�����δ�!");
			}

			@Override
			public void stop() {
				System.out.println("�����!");
			} 
		};
		
		m.print();
		System.out.println(); //�ٹٲ� �뵵
		
		
		
		//�߻�Ŭ������ �ν��Ͻ��� ���� �� ������, �͸� Ŭ���� ���·� �ν��Ͻ� ���� ����
		���� a = new ����(){

			@Override
			public void �Դ�() {
				System.out.println("���� ����");
			}
		};
		
		a.play();
		System.out.println(); //�ٹٲ� �뵵
		
		
		
		//�͸� Ŭ������ ��ü�� ����ؼ� ��Ÿ�� (�ѹ��� ����Ҷ� ������ -> ������ ������� ����)
		( new ����() {

			@Override
			public void �Դ�() {
				System.out.println("�˼����� ������ ���̸� �Դ´�...");
			}
			
		} ).play();
		
		
		
	}
}
