package org.comstudy21.ch08;

public class Account {

	//�ʵ� ����
	int money;
	static int total;
	
	//������ ����
	public Account(){ //����Ʈ ������
	}
	
	public Account(int money){ //�Ű����� ������
		this.money += money;
		total += money;
	}
	
	//�޼ҵ� ����
}
