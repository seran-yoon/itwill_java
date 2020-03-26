package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import my_frame.MyFrame;


public class Ch18Ex01 extends MyFrame {

	private Label label = new Label("[���] : �ƹ��� ��ư�� ������ �ʾҴ�.");
	private Button btn1 = new Button("��ư1");
	private Button btn2 = new Button("��ư2"); 
	private Panel centerPan = new Panel(new FlowLayout());
	private Panel southPan = new Panel(new FlowLayout());
	
	public Ch18Ex01() {
		
		super(200,100);
		
		init();
		start();
		
	}

	//ȭ�� ���̾ƿ� ����
	private void init() {
		
		centerPan.add(label);
		southPan.add(btn1);
		southPan.add(btn2);

		this.add(centerPan, BorderLayout.CENTER);
		this.add(southPan, BorderLayout.SOUTH);
		
	}
	
	//�̺�Ʈ �����ʸ� ����ϴ� �Լ�
	public void start() {
		
		ActionListener l = new ButtonActionListner();
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		
	}
	
	class ButtonActionListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof Button){
				Button btn = (Button)e.getSource();
				if(btn == btn1){
					System.out.println("1�� ��ư�� ������!");

				} else if(btn == btn2){
					System.out.println("2�� ��ư�� ������!");

				} else{
					System.err.println("�� �� ���� ��ư�� ������!");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new Ch18Ex01().setVisible(true);
		
	}

}
