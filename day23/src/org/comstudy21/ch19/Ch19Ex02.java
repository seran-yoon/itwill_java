package org.comstudy21.ch19;

import java.awt.Graphics;
import java.awt.Image;

import my_frame.MyFrame;

public class Ch19Ex02 extends MyFrame{

	Image image;
	
	public Ch19Ex02() {
		image = getToolkit().getImage("img01.jpg");
	}
	
	@Override
	public void paint(Graphics g){
		g.drawImage(image, 50, 50, 400, 300, this);
	}
	
	public static void main(String[] args) {
		new Ch19Ex02().setVisible(true);

	}

}
