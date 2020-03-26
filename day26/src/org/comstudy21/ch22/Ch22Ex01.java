package org.comstudy21.ch22;

import javax.swing.JFrame;

//Swing과 AWT를 혼용해서 사용하지 말것!
public class Ch22Ex01 extends JFrame {

	public Ch22Ex01() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE -> 자원을 반납하고 종료
//		setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE -> 강제 종료
		setSize(640,480);
	}
	
	public static void main(String[] args) {
		new Ch22Ex01().setVisible(true);
	}

}
