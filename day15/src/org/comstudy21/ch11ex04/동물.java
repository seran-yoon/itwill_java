package org.comstudy21.ch11ex04;

public class 동물 {
	
	private String 이름;
	
	public 동물(){
		
	}
	
	public 동물(String 이름){
		this.이름 = 이름;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	public void 소리내다(){
		System.out.println("소리내다 => " + 이름);
	}
	
	public void 먹다() {
		System.out.println("먹다 => " + 이름);
	}
	
	public void 움직이다(){
		System.out.println("움직이다 => " + 이름);
	}

}
