package org.comstudy21.ch17ex02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame3 extends Frame{

	public MyFrame3() {
		this("MyFrame3", 10, 10, 600, 400);
	}
	public MyFrame3 (int w, int h) {
		this("MyFrame3", 0, 0 , w, h);
	}
	public MyFrame3(String title, int x, int y, int w, int h) {
		setTitle(title);
		setBounds(x, y, w, h);
		
		// ¿Õ∏Ì Inner class 
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
}
