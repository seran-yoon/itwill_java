package org.comstudy21.animal_abstract;

public abstract class 동물 {
	
	protected String 이름;
	
	public abstract void 소리내다();
	public abstract void 먹다();
	public abstract void 움직이다();
	
	public void play(){
		//일반 메소드에서 추상메소드 호출 가능
		소리내다();
		먹다();
		움직이다();
	} //자식클래스에서 호출 가능

}
