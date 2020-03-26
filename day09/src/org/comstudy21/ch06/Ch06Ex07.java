package org.comstudy21.ch06;

public class Ch06Ex07 {
	
	static void sayHello(){
		System.out.println("2. Hello World!");
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. ::: 함수 사용하기 :::");
		
		sayHello(); //함수를 호출해줄때는 함수끼리의 형식이 맞아야 한다 (main에 static형식을 써줬기 때문에 sayHello의 형식도 static으로 써줘야 함)
		
		System.out.println("3. Finish~");
	}
	
	

}
