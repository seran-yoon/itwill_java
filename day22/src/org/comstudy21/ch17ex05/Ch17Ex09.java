package org.comstudy21.ch17ex05;

import java.awt.BorderLayout;
import java.awt.Button;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex09 extends MyFrame{
	//BorderLayout 예제
	
	private Button btn01 = new Button("btn01");
	private Button btn02 = new Button("btn02");
	private Button btn03 = new Button("btn03btn03btn03btn03btn03");
	private Button btn04 = new Button("btn04");
	private Button btn05 = new Button("btn05");
	
	public Ch17Ex09() {
		init();
	}
	
	private void init(){
		//Frame의 기본 배치관리자는 BorderLayout
		
		setLayout(new BorderLayout());
		add(btn01, BorderLayout.NORTH);
		add(btn02, "South");
		add(btn03, BorderLayout.WEST);
		add(btn04, BorderLayout.EAST);
		add(btn05, BorderLayout.CENTER);

		
	}
	
	
	public static void main(String[] args) {
		new Ch17Ex09().setVisible(true);
	}

}
