package org.comstudy21.ch18;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import my_frame.MyFrame;


public class Ch18Ex03 extends Frame{
	
	public Ch18Ex03() {
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new ExitHandler());
	}
	
	class ExitHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			dispose();
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		new Ch18Ex03();
		
	}

}
