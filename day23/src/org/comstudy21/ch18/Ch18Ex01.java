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

	private Label label = new Label("[결과] : 아무런 버튼도 눌리지 않았다.");
	private Button btn1 = new Button("버튼1");
	private Button btn2 = new Button("버튼2"); 
	private Panel centerPan = new Panel(new FlowLayout());
	private Panel southPan = new Panel(new FlowLayout());
	
	public Ch18Ex01() {
		
		super(200,100);
		
		init();
		start();
		
	}

	//화면 레이아웃 설정
	private void init() {
		
		centerPan.add(label);
		southPan.add(btn1);
		southPan.add(btn2);

		this.add(centerPan, BorderLayout.CENTER);
		this.add(southPan, BorderLayout.SOUTH);
		
	}
	
	//이벤트 리스너를 등록하는 함수
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
					System.out.println("1번 버튼을 눌렀다!");

				} else if(btn == btn2){
					System.out.println("2번 버튼을 눌렀다!");

				} else{
					System.err.println("알 수 없는 버튼을 눌렀다!");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new Ch18Ex01().setVisible(true);
		
	}

}
