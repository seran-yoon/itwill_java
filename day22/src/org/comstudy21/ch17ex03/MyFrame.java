package org.comstudy21.ch17ex03;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	
	public MyFrame() {
		this("My Frame", 0, 0, 300, 400);
	}

	public MyFrame(String title, int x, int y, int width, int heigth) {
		setTitle(title);
		
		if(x==0 && y==0){
			Dimension sc = Toolkit.getDefaultToolkit().getScreenSize(); //현재 스크린의 사이즈를 알기 위함
			x = (int)(sc.getWidth()/2 - width/2); //getWidth가 double형이기 때문에 int로 형변환
			y = (int)(sc.getHeight()/2 - heigth/2);
		}
		setBounds(x, y, width, heigth);
		
		//익명클래스로 이벤트 생성
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				dispose(); //Frame을 종료
				System.exit(0); //시스템 자체를 아예 종료
			}
		});
		
	}
}


