package org.comstudy21.calculator;

import java.awt.Frame;

public class MyFrame extends Frame {

	public MyFrame() {
		this("°è»ê±â", 50, 50, 300, 450);
	}
	
	public MyFrame(int width, int height) {
		this("Calculator", 0, 0, width, height);
	}
	
	public MyFrame(String title, int x, int y, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocation(x, y);
	}
	
}
