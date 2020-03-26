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
	
	JRadioButton rb01 = new JRadioButton("����", false); //true�� ��ư�� ���� Ȱ��ȭ
	JRadioButton rb02 = new JRadioButton("����", false);
	JRadioButton rb03 = new JRadioButton("���ȸ��", false);
	JRadioButton rb04 = new JRadioButton("�Ϲ�ȸ��", false);
	
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
		
		System.out.print("���� : ");
		
		JRadioButton btn = (JRadioButton)e.getSource();
				
		if(btn == rb01 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("������ �����߽��ϴ�");
		} else if(btn == rb02 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("������ �����߽��ϴ�");
		}
		
		if(btn == rb03 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("���ȸ���Դϴ�");
		} else if(btn == rb04 && e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("�Ϲ�ȸ���Դϴ�");
		}
		
		
		
	}

	public static void main(String[] args) {
	
		new Ch22Ex06_event().setVisible(true);
		
	}
	
}
