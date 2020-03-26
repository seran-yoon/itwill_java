package org.comstudy21.ch17ex05;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex12 extends MyFrame {
	//키패드 예제 _ 오른쪽 옆에 연산기호있게
	
	private Panel centerPan = new Panel(new GridLayout(4,3));
	private Panel esstPan = new Panel(new GridLayout(4,1));
	
	private Button btn01 = new Button("   +   ");
	private Button btn02 = new Button("-");
	private Button btn03 = new Button("c");
	private Button btn04 = new Button("=");
	
	private static final int MAX = 12;
	private Button[] arr = new Button[MAX];
	{
		for(int i=1;i<=9;i++){
			arr[i-1] = new Button(""+i);
		}
		
		arr[9] = new Button("*");
		arr[10] = new Button("0");
		arr[11] = new Button("#");
		
	}
	
	public Ch17Ex12() {
		super(300,400);
		init();
	}
	
	public void init(){

		setLayout(new BorderLayout(5,0));
		for(int i=0;i<MAX;i++){
			centerPan.add(arr[i]);
		}
		add(centerPan, "Center");
		add(esstPan, BorderLayout.EAST);
		esstPan.add(btn01);
		esstPan.add(btn02);
		esstPan.add(btn03);
		esstPan.add(btn04);
		
	}
	
	public static void main(String[] args) {
		new Ch17Ex12().setVisible(true);
	}
	
}
