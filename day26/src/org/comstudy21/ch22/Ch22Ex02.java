package org.comstudy21.ch22;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ch22Ex02 extends JFrame{
	
	public Ch22Ex02() {
		JOptionPane.showMessageDialog(this, "Hello World");
	}

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Hello"); //JFram������� �ʰ� �׳� ������ �ٷ� ���� �� (�˾�â�� ���°Ŷ�)
	
		new Ch22Ex02();
		
	}
}
