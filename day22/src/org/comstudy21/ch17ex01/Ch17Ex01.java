package org.comstudy21.ch17ex01;

import java.awt.Frame;

public class Ch17Ex01 extends Frame{ //Frame��ü ��ӹ޾� ����

	public Ch17Ex01() {

		//����Ͽ� ������, ���ο��� ������ this�� ���� ��
		this.setTitle("������ �ڹ�!");
		this.setSize(640,480);
		this.setLocation(200,200);
		
	}
	
	
	public static void main(String[] args) {
		
		new Ch17Ex01().setVisible(true);; //�������� ���� �ȴ�
		
//		//Frame��ü ���� ����
//		Frame frame = new Frame();
		//�ܺο��� ������ ��������(��ü)�� ���� ���� ��
//		frame.setTitle("������ �ڹ�!");
//		frame.setBounds(100,100,640,480); //x,y,����,����
//		frame.setVisible(true);
		
		
		
		
	}
	
}
