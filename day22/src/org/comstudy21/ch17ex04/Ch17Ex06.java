package org.comstudy21.ch17ex04;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex06 extends MyFrame implements Runnable{
	
	private int x = 0;
	Button btn = new Button("������ ȸ��");
	
	public Ch17Ex06() {
	
	}
	
	public Ch17Ex06(int width, int height) {
		super(width, height);
		setTitle("��ġ ������ ����");
		
		setLayout(null);
		
		btn.setBounds(x, 120, 100, 22);
		this.add(btn);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		});
		//----------------------------------------��������� �ϸ� ��ư ������ ��
		//----------------------------------------�����带 �������ָ� ��ư�� ������ �� ����
		
		Thread thread = new Thread(this); //�����带 �������ַ��� implements Runnable �ؾ� ��
		thread.start(); //������ �޼ҵ� ����
	}
	
	@Override
	public void run() {
		int spped = 10;
		
	}
	

	public static void main(String[] args) {
		new Ch17Ex06(640, 480).setVisible(true);
	}


	
}
