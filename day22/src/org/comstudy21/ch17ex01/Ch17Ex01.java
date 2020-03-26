package org.comstudy21.ch17ex01;

import java.awt.Frame;

public class Ch17Ex01 extends Frame{ //Frame객체 상속받아 생성

	public Ch17Ex01() {

		//상속하여 생성시, 내부에서 생성시 this를 쓰면 됨
		this.setTitle("위대한 자바!");
		this.setSize(640,480);
		this.setLocation(200,200);
		
	}
	
	
	public static void main(String[] args) {
		
		new Ch17Ex01().setVisible(true);; //프레임이 실행 된다
		
//		//Frame객체 직접 생성
//		Frame frame = new Frame();
		//외부에서 생성시 참조변수(객체)를 통해 쓰면 됨
//		frame.setTitle("위대한 자바!");
//		frame.setBounds(100,100,640,480); //x,y,가로,세로
//		frame.setVisible(true);
		
		
		
		
	}
	
}
