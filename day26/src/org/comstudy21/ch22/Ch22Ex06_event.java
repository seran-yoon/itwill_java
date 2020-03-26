package org.comstudy21.ch22;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ch22Ex06_event extends JFrame implements ItemListener {

	
	private JPanel contentPane;
	
	JRadioButton rb01 = new JRadioButton("남성", false); //true인 버튼이 먼저 활성화
	JRadioButton rb02 = new JRadioButton("여성", false);
	JRadioButton rb03 = new JRadioButton("우수회원", false);
	JRadioButton rb04 = new JRadioButton("일반회원", false);
	
	ButtonGroup gr01 = new ButtonGroup();
	ButtonGroup gr02 = new ButtonGroup();
	
	public Ch22Ex06_event() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(640, 480);
		
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		init();
		
		start();
		
	}
	
	private void start(){
		rb01.addItemListener(this);
		rb02.addItemListener(this);
		rb03.addItemListener(this);
		rb04.addItemListener(this);
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
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		System.out.print("선택 : ");
		
		JRadioButton btn = (JRadioButton)e.getSource();
				
		if(btn == rb01 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("남성을 선택했습니다");
		} else if(btn == rb02 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("여성을 선택했습니다");
		}
		
		if(btn == rb03 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("우수회원입니다");
		} else if(btn == rb04 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("일반회원입니다");
		}
		
		
		
	}

	public static void main(String[] args) {
	
		new Ch22Ex06_event().setVisible(true);
		
	}
	
}
