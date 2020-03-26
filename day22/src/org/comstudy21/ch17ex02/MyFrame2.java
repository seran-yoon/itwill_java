package org.comstudy21.ch17ex02;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame2 extends Frame{

	public MyFrame2() {
		this("My Frame2", 50 ,50 ,640 ,480);
	}

	public MyFrame2(String title, int x, int y, int w, int h) {
		setTitle(title);
		setBounds(x, y, w, h);
		
		// Inner class 
		class WindowAdapterImpl extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		}
		addWindowListener(new WindowAdapterImpl());
	}	
	
}
