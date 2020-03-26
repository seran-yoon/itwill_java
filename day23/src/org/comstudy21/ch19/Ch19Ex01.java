package org.comstudy21.ch19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import my_frame.MyFrame;

public class Ch19Ex01 extends MyFrame{

	public Ch19Ex01() {
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		//자동 호출되는 함수
		
		System.out.println("paint 함수 호출");
		
		setBackground(Color.GRAY);
		g.setColor(Color.ORANGE);
		Font font = new Font("궁서체", Font.ITALIC, 48);
		g.setFont(font);
		g.drawString("Hello Java World", 50, 100);
	
		g.drawRect(50, 200, 150, 150);
		g.setColor(Color.RED);
		g.fillRect(50, 200, 150, 150);

	}
	
	public static void main(String[] args) {
		new Ch19Ex01().setVisible(true);
	}
	
}
