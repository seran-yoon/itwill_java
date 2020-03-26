package org.comstudy21.ch17ex05;

import java.awt.Button;
import java.awt.FlowLayout;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex07 extends MyFrame {
	//FlowLayout ¿¹Á¦
	
	private Button btn01 = new Button("btn01");
	private Button btn02 = new Button("btn02");
	private Button btn03 = new Button("btn03");
	private Button btn04 = new Button("btn04");
	private Button btn05 = new Button("btn05");
	
	public Ch17Ex07() {
		start();
	}
	
	public void start() {
		
		this.setLayout(new FlowLayout());
		this.add(btn01);
		this.add(btn02);
		this.add(btn03);
		this.add(btn04);
		this.add(btn05);
		
	}

	public static void main(String[] args) {
		new Ch17Ex07().setVisible(true);
	}
	
}
