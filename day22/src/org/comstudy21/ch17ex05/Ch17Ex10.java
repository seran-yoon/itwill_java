package org.comstudy21.ch17ex05;

import java.awt.Button;
import java.awt.GridLayout;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex10 extends MyFrame{
	//GridLayout 예제
	
	private Button btn01 = new Button("btn01");
	private Button btn02 = new Button("btn02");
	private Button btn03 = new Button("btn03");
	private Button btn04 = new Button("btn04");
	private Button btn05 = new Button("btn05");
	private Button btn06 = new Button("btn06");
	
	public Ch17Ex10() {
		init();
	}
	
	public void init(){
		
		setLayout(new GridLayout(2,3,5,5)); //2행 3열 , 가로세로 간격
		add(btn01);
		add(btn02);
		add(btn03);
		add(btn04);
		add(btn05);
		add(btn06);
		
	}
	
	public static void main(String[] args) {
		new Ch17Ex10().setVisible(true);
	}
	
}
