package org.comstudy21.ch12ex02;

public class 닭 extends 동물 implements 움직임 {

	//동물 클래스의 추상메소드 구현
	@Override
	public void 먹다() {
		System.out.println("닭이 모이를 먹는다!");
	}

	//움직임 인터페이스의 추상메소드 구현
	@Override
	public void move() {
		System.out.println("닭이 날아간다~ 푸드득");
	}

	@Override
	public void stop() {
		System.out.println("닭이 그대로 멈췄다");
	}

	//움직임 interface에 선언된 디폴트 메소드
	@Override
	public void play() {
		super.play();
		print(); 
	}
	
}
