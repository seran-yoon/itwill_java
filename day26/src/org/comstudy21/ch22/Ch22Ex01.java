package org.comstudy21.ch22;

import javax.swing.JFrame;

//Swing�� AWT�� ȥ���ؼ� ������� ����!
public class Ch22Ex01 extends JFrame {

	public Ch22Ex01() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE -> �ڿ��� �ݳ��ϰ� ����
//		setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE -> ���� ����
		setSize(640,480);
	}
	
	public static void main(String[] args) {
		new Ch22Ex01().setVisible(true);
	}

}
