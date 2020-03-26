package org.comstudy21.ch06;

public class Ch06Ex08 {
	
	static void horizontal(char ch, int size){ //리턴받는게 없으면 기본 타입은 void로 작성
		
		for(int i=0;i<size;i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		horizontal('+', 20);
		horizontal('*', 50);
		horizontal('#', 10);
		
	}

}
