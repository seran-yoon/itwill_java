package org.comstudy21.ch12ex02;

public interface ������ {

	//�������̽��� ����� ���� ����
	int MAX = 100; //static final ����
	public static final int MIN = 0;
	
	//�������̽��� �߻� �޼ҵ常 ���� ����
	void move(); //public abstract ����
	public abstract void stop();
	
	public static void sayHello(){
		//move();
		//stop(); //static ����� �ν��Ͻ���� ȣ�� �Ұ���
		System.out.println("Hello World!");
	}
	
	public default void print(){ //�߻�޼ҵ带 �������ֱ� ���ؼ� default�� ��� -> defult�� ����ϸ� �ٸ� Ŭ�������� �������̵��� �� �� �ֱ� ����! 
	//�߻�޼ҵ�� default�� static�� ���������ڷ� ����� �� �ִµ�, static�� ����ϸ� �������̵� �Ұ��ϱ� ������ �ٸ� Ŭ�������� �������̵��� �� ���(���� �߻�޼ҵ�� �ٸ� Ŭ�������� �������̵��� �ؾ� ��) default�� ���������ڷ� ���   
		move();
		stop();
	} 
	
}
