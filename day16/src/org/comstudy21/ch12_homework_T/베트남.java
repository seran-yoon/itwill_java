package org.comstudy21.ch12_homework_T;

public class 베트남 {

public static void main(String[] args) {
		
		람보 man = new 람보();

		man.실행(new 무기(){
			public void play(){
				System.out.println("람보가 칼을 휘두른다!");
			}
		});
		
		
		man.실행(new 탈것(){
			public void play(){
				System.out.println("람보가 탱크를 탄다!");
			}
		});
		
	
		man.실행(new 전투식량(){
			public void eat(){
				System.out.println("람보가 2형 전투식량을 먹는다!");
			}
		});
	
		
	}
}
