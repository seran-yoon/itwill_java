package org.comstudy21.ch11ex04_test;

public class 고양이 extends 동물 {

//	public String 이름; //부모 클래스에 있는 필드가 자동으로 상속받음
	public String 먹이;
	
	public 고양이(){}
	
	public 고양이(String 먹이){
		this.먹이=먹이;
	}
	
	public void 소리내다(){
		System.out.println();
	}
	
	public void 먹다(){
		System.out.println();
	}
	
	public void 움직이다(){
		System.out.println();
	}


	
}
