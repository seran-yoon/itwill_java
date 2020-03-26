package org.comstudy21.ch06;

public class Ch06Ex10 {
	
	static String toString(String name, int age){ //리턴받는 변수의 타입이 String이기 때문에  void -> String로 작성
		
		return name+"님 은 "+age+"세 입니다";
	}

	public static void main(String[] args) {
		
		String name  = "홍길동";
		int age = 23;
		
		String infoStr = toString(name, age);
		
		System.out.println(infoStr);
		System.out.println(toString("일지매", 15));
		
	}

}
