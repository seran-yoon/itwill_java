package org.comstudy21.ch17ex05;

import java.awt.Button;
import java.awt.FlowLayout;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex08 extends MyFrame{
	//버튼 100개 만들기

	public static final int MAX = 100;
	private Button[] btnArr = new Button[MAX];
	{ //초기화
		for(int i = 0;i<MAX; i++){
			btnArr[i] = new Button(i<10?"BTNO"+i:"BTN"+i);
		}
		
	}
	
	public Ch17Ex08() {
		init();
	}
	
	public void init() {
		
		this.setLayout(new FlowLayout());
		
		for(int i=0;i<MAX;i++){
			this.add(btnArr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new Ch17Ex08().setVisible(true);
	}
	
}
