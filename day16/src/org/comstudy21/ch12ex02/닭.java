package org.comstudy21.ch12ex02;

public class �� extends ���� implements ������ {

	//���� Ŭ������ �߻�޼ҵ� ����
	@Override
	public void �Դ�() {
		System.out.println("���� ���̸� �Դ´�!");
	}

	//������ �������̽��� �߻�޼ҵ� ����
	@Override
	public void move() {
		System.out.println("���� ���ư���~ Ǫ���");
	}

	@Override
	public void stop() {
		System.out.println("���� �״�� �����");
	}

	//������ interface�� ����� ����Ʈ �޼ҵ�
	@Override
	public void play() {
		super.play();
		print(); 
	}
	
}
