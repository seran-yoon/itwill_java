package org.comstudy21.ch17ex05;

import java.awt.Button;
import java.awt.GridLayout;


import org.comstudy21.myframe.MyFrame;

public class Ch17Ex11 extends MyFrame {
	//키패드 예제

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
	
//	private Button btn01 = new Button("7");
//	private Button btn02 = new Button("8");
//	private Button btn03 = new Button("9");
//	private Button btn04 = new Button("4");
//	private Button btn05 = new Button("5");
//	private Button btn06 = new Button("6");
//	private Button btn07 = new Button("1");
//	private Button btn08 = new Button("2");
//	private Button btn09 = new Button("3");
//	private Button btn10 = new Button("*");
//	private Button btn11 = new Button("0");
//	private Button btn12 = new Button("#");
	
	public Ch17Ex11() {
		super(300,400);
		init();
	}
	
	public void init(){
		
//		setLayout(new GridLayout(4,3)); //4행 3열
//		add(btn01);
//		add(btn02);
//		add(btn03);
//		add(btn04);
//		add(btn05);
//		add(btn06);
//		add(btn07);
//		add(btn08);
//		add(btn09);
//		add(btn10);
//		add(btn11);
//		add(btn12);
		
		setLayout(new GridLayout(4,3));
		for(int i=0;i<MAX;i++){
			add(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new Ch17Ex11().setVisible(true);
	}
	
}
