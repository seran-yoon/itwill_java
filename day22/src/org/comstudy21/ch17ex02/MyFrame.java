package org.comstudy21.ch17ex02;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame implements WindowListener{

	public MyFrame() {
		this("My Frame", 50 ,50 ,640 ,480);
	}

	public MyFrame(String title, int x, int y, int w, int h) {
		setTitle(title);
		setBounds(x, y, w, h);
		
		addWindowListener(this); //이벤트 리스너 등록(잠복근무 또는 CCTV와 같음)
	}

	
	//이벤트를 발생시키려면 인터페이스 WindowListener를 implements를 해줘야 하는데, 다 사용하지 않아도 7개 모두 오버라이딩 해줘야 한다
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	
	
}
