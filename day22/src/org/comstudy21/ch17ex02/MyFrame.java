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
		
		addWindowListener(this); //�̺�Ʈ ������ ���(�ẹ�ٹ� �Ǵ� CCTV�� ����)
	}

	
	//�̺�Ʈ�� �߻���Ű���� �������̽� WindowListener�� implements�� ����� �ϴµ�, �� ������� �ʾƵ� 7�� ��� �������̵� ����� �Ѵ�
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
