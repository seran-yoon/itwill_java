package org.comstudy21.ch11ex04;

public class 고양이 extends 동물 {

private String 먹이;
	
	public 고양이(){
		
	}
	
	public 고양이(String 먹이){
		this.먹이 = 먹이;
	}

	public String get먹이() {
		return 먹이;
	}

	public void set이름(String 먹이) {
		this.먹이 = 먹이;
	}

	public void 소리내다(){
		super.set이름("야옹");
		System.out.println("고양이 => " + super.get이름());
	}

	public void 움직이다(){
		super.set이름("뛰다");
		System.out.println("고양이 => " + super.get이름());
	}
	
	public void 먹다(){
		super.set이름("츄르");
		System.out.println("고양이 => " + super.get이름());
	}
	
//	public void 소리내다(String 먹이){
//		this.먹이 = 먹이;
//		this.소리내다();
//	}
//	
//	public void 움직이다(String 먹이){
//		this.먹이 = 먹이;
//		this.움직이다();
//	}
//	
//	public void 먹다(String 먹이){
//		this.먹이 = 먹이;
//		this.먹다();
//	}
}
