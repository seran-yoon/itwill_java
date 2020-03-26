package org.comstudy21.animal_abstract;

public class 동물농장 {
	
	
	public static void addAnimal(동물[] aniArr, 동물 ani){  //동물들을 배열에 넣어주기 위한 함수를 만듬 
		
		for(int i=0;i<aniArr.length;i++){
			if(aniArr[i] == null){
				aniArr[i] = ani;
				break;
			}
		}
	}
	
	public static void playAnimal(동물[] aniArr){ //배열을 출력해주기 위한 함수를 만듬
		for(동물 ani : aniArr){
			ani.play();
			if(ani instanceof 닭){
				((닭)ani).날다();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		동물[] aniArr = new 동물[3];
		
		addAnimal(aniArr, new 닭("옥수수")); //생성자를 생성하고, 리턴받는 타입과 변수를 꼭 써줬는지 확인! 그래야 작성한 옥수수값을 리턴받을 수 있음
		addAnimal(aniArr, new 고양이("츄르"));
		addAnimal(aniArr, new 뱀("쥐"));
		
		playAnimal(aniArr);
	}
	
	
	

//	-------------------------------------------------------------------------------------
	
	
	
	public static void case01(String[] args) {
		
		동물 ani = new 닭();
		ani.play();
//		ani.날다(); //동물 클래스에는 날다 메소드가 없기 때문에 호출이 안됨
		((닭)ani).날다(); //다운캐스팅
		
		ani = new 고양이();
		ani.play();
		((고양이)ani).뛰다();
		
		ani = new 뱀();
		ani.play();
		((뱀)ani).기다();
		
	}

}
