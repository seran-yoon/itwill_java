package org.comstudy21.ch17ex05;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import org.comstudy21.myframe.MyFrame;

public class Ch17Ex13 extends MyFrame {
	
	private Panel pan01 = new Panel();
	private Panel pan02 = new Panel(new GridLayout(1,4));
	private Panel pan03 = new Panel(new GridLayout(2,1));

	private Label lbl = new Label("버튼을 누르세요", Label.CENTER); //Label.CENTER -> 글씨 가운데로 오게 하기
	private Button btn02 = new Button("Play");
	private Button btn03 = new Button("Stop");
	private Button btn04 = new Button("Pause");
	private Button btn05 = new Button("Back");
	private Button btn06 = new Button("Blank");
	
	public Ch17Ex13() {
		init();
	}
	
	public void init(){
		
		setLayout(new BorderLayout());
		add(pan01, "Center");
		pan01.add(lbl);
		
		add(pan02, BorderLayout.SOUTH);
		pan02.add(btn02);
		pan02.add(btn03);
		pan02.add(btn04);
		pan02.add(pan03);
		
		pan03.add(btn05);
		pan03.add(btn06);
		
	} 
	
	public static void main(String[] args) {
		new Ch17Ex13().setVisible(true);
	}
	
}
