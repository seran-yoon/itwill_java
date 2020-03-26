package org.comstudy21.ch17ex04;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex06 extends MyFrame implements Runnable{
	
	private int x = 0;
	Button btn = new Button("오늘은 회식");
	
	public Ch17Ex06() {
	
	}
	
	public Ch17Ex06(int width, int height) {
		super(width, height);
		setTitle("배치 관리자 연습");
		
		setLayout(null);
		
		btn.setBounds(x, 120, 100, 22);
		this.add(btn);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
			}
		});
		//----------------------------------------여기까지만 하면 버튼 생성만 함
		//----------------------------------------쓰레드를 생성해주면 버튼을 움직일 수 있음
		
		Thread thread = new Thread(this); //쓰레드를 생성해주려면 implements Runnable 해야 함
		thread.start(); //쓰레드 메소드 시작
	}
	
	@Override
	public void run() {
		int spped = 10;
		
	}
	

	public static void main(String[] args) {
		new Ch17Ex06(640, 480).setVisible(true);
	}


	
}
