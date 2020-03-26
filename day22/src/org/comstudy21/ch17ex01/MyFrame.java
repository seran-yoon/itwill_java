package org.comstudy21.ch17ex01;

import java.awt.Frame;

public class MyFrame extends Frame{
	
	public MyFrame() { //����Ʈ ������
		this("My Frame", 50, 50, 640, 480);
	}
	
	public MyFrame(int width, int height) { //���� �ִ� ������
		this("no-title", 0, 0, width, height);
	}

	public MyFrame(String title, int x, int y, int w, int h) { //���� �ִ� ������
		setTitle(title);
		setSize(w, h);
		setLocation(x, y);
	}

}
