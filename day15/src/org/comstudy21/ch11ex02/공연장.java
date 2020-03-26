package org.comstudy21.ch11ex02;

public class 공연장 {

	public static void test01(String[] args) { //업캐스팅
		할배 p1 = new 아배();
		
		p1.나팔(); //아배 나팔
		
		p1 = new 손자();
		p1.나팔(); //손자 나팔
		
		p1 = new 할배();
		p1.나팔(); //할배 나팔
	}
	
	
	public static void test02(String[] args) { //업캐스팅
		할배[] hArr = new 할배[4];
		
		hArr[0] = new 손자();
		hArr[1] = new 할배();
		hArr[2] = new 아배();
		hArr[3] = new 손자();

		for(int i=0;i<hArr.length;i++){
			hArr[i].나팔();
		}
	}
	
	
	static void 연주자(할배 person){ //다운캐스팅
		
		person.나팔();
		person.피아노();
		
		if(person instanceof 아배){
			((아배)person).드럼();
		}
		if(person instanceof 손자){
			((손자)person).기타();
		}
		
		
	}
	public static void main(String[] args) {
	
		연주자(new 손자());
		연주자(new 할배());
		연주자(new 아배());
	
	}
}
