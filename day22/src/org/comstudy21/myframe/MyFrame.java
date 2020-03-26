package org.comstudy21.myframe;

import java.awt.Frame;

public class MyFrame extends Frame{
	
	public MyFrame() { //디폴트 생성자
		this("My Frame", 50, 50, 640, 480);
	}
	
	public MyFrame(int width, int height) { //인자 있는 생성자
		this("no-title", 0, 0, width, height);
	}

	public MyFrame(String title, int x, int y, int width, int height) { //인자 있는 생성자
		setTitle(title);
		setSize(width, height);
		setLocation(x, y);
	}

}
