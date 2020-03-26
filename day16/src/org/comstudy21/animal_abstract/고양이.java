package org.comstudy21.animal_abstract;

public class 고양이 extends 동물 {
	
	String 먹이;
	
	public 고양이(){}
	
	public 고양이(String 먹이){
		this.먹이 = 먹이;
	}

	@Override
	public void 소리내다() {
		System.out.println("야옹~");
	}

	@Override
	public void 먹다() {
		System.out.println("고양이가 "+먹이+"를 먹다");
		System.out.println("냠냠냠");
	}

	@Override
	public void 움직이다() {
		System.out.println("캬옹!");
	}
	
	public void 뛰다() {
		움직이다();
		System.out.println("*고양이가 뛴다*");
	}

}
