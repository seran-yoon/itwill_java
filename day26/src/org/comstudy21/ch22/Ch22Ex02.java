package org.comstudy21.ch22;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ch22Ex02 extends JFrame{
	
	public Ch22Ex02() {
		JOptionPane.showMessageDialog(this, "Hello World");
	}

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Hello"); //JFram상속하지 않고 그냥 본문에 바로 만들어도 됨 (팝업창을 띄우는거라)
	
		new Ch22Ex02();
		
	}
}
