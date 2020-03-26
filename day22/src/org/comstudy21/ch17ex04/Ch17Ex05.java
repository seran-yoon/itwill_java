package org.comstudy21.ch17ex04;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.comstudy21.ch17ex01.MyFrame;

public class Ch17Ex05 extends MyFrame implements Runnable{

	private int x = 0; //x 고정
	Button btn = new Button("오늘은 회식"); //버튼 생성
	
	//디폴트 생성자
	public Ch17Ex05(){
		
	}
	
	public Ch17Ex05(int width, int height){
		super(width, height);
		setTitle("배치 관리자 연습");
		
		setLayout(null); //배치관리자(Layout)를 아예 비워두고 새로 내가 다 설정하기 위함
		
		btn.setBounds(x, 120, 100, 22); //버튼의 크기 설정
		this.add(btn); //
		
		Thread thread = new Thread(this); // 버튼이 움직이게 하려고 쓰레드 생성함
		thread.start();
		
		//창 닫기 이벤트
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				dispose(); //Frame을 종료
				System.exit(0); //시스템 자체를 아예 종료
			}
		});
	}
	

	@Override
	public void run() {
		int speed = 10;
		//무한반복문으로 생성
		for(;;){
			try{
				Thread.sleep(28);
				x += speed;
				int width = getWidth();
				
				if(x>=width-btn.getWidth() || x<=0){
					speed = speed*(-1);
				}
				btn.setBounds(x, getHeight()-btn.getHeight()-10, 100, 22);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new Ch17Ex05(640, 480).setVisible(true);
	}

	
}
