package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import my_frame.MyFrame;

//Ch18Ex01의 예제중, ButtonActionListner클래스를 내부가 아닌 외부로 해서 btn을 외부클래스에서도 사용할 수 있게 만들어보기

class ButtonActionListner implements ActionListener {
	
	private Ch18Ex02 r = new Ch18Ex02();
	
	public ButtonActionListner() { //디폴트 생성자
		
	}
	
	public ButtonActionListner(Ch18Ex02 r) { //Ch18Ex01을 받을 수 있는 생성자
		this.r = r;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof Button){
			Button btn = (Button)e.getSource();
			if(btn == r.btn1){
				System.out.println("1번 버튼을 눌렀다!");
				r.label.setText("[결과] : 1번 버튼을 눌렀다!"); //라벨창에 결과값이 보여지게 하기
			} else if(btn == r.btn2){
				System.out.println("2번 버튼을 눌렀다!");
				r.label.setText("[결과] : 2번 버튼을 눌렀다!");

			} else{
				System.err.println("알 수 없는 버튼을 눌렀다!");
				r.label.setText("[결과] : 알 수 없는 버튼을 눌렀다!");
			}
			
		}
	}
	
}

public class Ch18Ex02 extends MyFrame {

	Label label = new Label();
	Button btn1 = new Button("버튼1");
	Button btn2 = new Button("버튼2"); //외부클래스에서도 사용해야하기 때문에 private삭제함 (public을 쓰면 setget을 만들어줘야하기 때문에 그냥 생성자 삭제)
	private Panel centerPan = new Panel(new FlowLayout());
	private Panel southPan = new Panel(new FlowLayout());
	
	public Ch18Ex02() {
		
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
		
		ActionListener l = new ButtonActionListner(this);
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		
	}
	
	public static void main(String[] args) {
		
		new Ch18Ex01().setVisible(true);
		
	}

}