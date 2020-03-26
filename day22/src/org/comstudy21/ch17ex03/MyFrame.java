package org.comstudy21.ch17ex03;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	
	public MyFrame() {
		this("My Frame", 0, 0, 300, 400);
	}

	public MyFrame(String title, int x, int y, int width, int heigth) {
		setTitle(title);
		
		if(x==0 && y==0){
			Dimension sc = Toolkit.getDefaultToolkit().getScreenSize(); //���� ��ũ���� ����� �˱� ����
			x = (int)(sc.getWidth()/2 - width/2); //getWidth�� double���̱� ������ int�� ����ȯ
			y = (int)(sc.getHeight()/2 - heigth/2);
		}
		setBounds(x, y, width, heigth);
		
		//�͸�Ŭ������ �̺�Ʈ ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				dispose(); //Frame�� ����
				System.exit(0); //�ý��� ��ü�� �ƿ� ����
			}
		});
		
	}
}


