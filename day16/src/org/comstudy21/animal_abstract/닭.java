package org.comstudy21.animal_abstract;

public class 닭 extends 동물{
	
	String 먹이;
	
	//생성자는 리턴값을 받아야 할때 꼭 생성해줘야 함 -> 동물농장 클래스에서 new 닭("옥수수")이라고 리턴해주는 값을 지정해줬기 때문에 생성자 필요
	public 닭(){}
	
	public 닭(String 먹이){
		this.먹이 = 먹이;
	}

	@Override
	public void 소리내다() {
		System.out.println("꼬끼오~");
	}

	@Override
	public void 먹다() {
		System.out.println("닭이 "+먹이+"를 먹다");
		System.out.println("구구구구 콕콕콕!");
	}

	@Override
	public void 움직이다() {
		날다();
		System.out.println("푸드득~");
	}
	
	public void 날다() {
		System.out.println("*닭이 난다*");
	}

	
	
}
