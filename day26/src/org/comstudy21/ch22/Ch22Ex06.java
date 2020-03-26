package org.comstudy21.ch22;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ch22Ex06 extends JFrame {

	private JPanel contentPane;
	
	JRadioButton rb01 = new JRadioButton("남성", true); //true인 버튼이 먼저 활성화
	JRadioButton rb02 = new JRadioButton("여성", false);
	JRadioButton rb03 = new JRadioButton("우수회원", true);
	JRadioButton rb04 = new JRadioButton("일반회원", false);
	
	ButtonGroup gr01 = new ButtonGroup();
	ButtonGroup gr02 = new ButtonGroup();
	
	public Ch22Ex06() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(640, 480);
		
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		init();
		
	}
	
	private void init(){
		
		gr01.add(rb01);
		gr01.add(rb02);
		
		gr02.add(rb03);
		gr02.add(rb04);
		
		contentPane.add(rb01);
		contentPane.add(rb02);
		contentPane.add(rb03);
		contentPane.add(rb04);
	}
	
	public static void main(String[] args) {
	
		new Ch22Ex06().setVisible(true);
		
	}
	
}
