package org.comstudy21.ch06;

public class Ch06Ex09 {
	
	static int getMax(int a, int b){ //리턴받는 변수의 타입이 int이기 때문에  void -> int로 작성
		
		if(a>b){
			return a;
		} else{
			return b;
		}
		
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 35;
		
		int max = getMax(a, getMax(b, c)); //getMax(b, c)함수를 따로 만들지 않아도 됨 ->변수가 함수로 가는게 아니라 변수의 값이 가기 때문에 변수의 이름은 상관 없음 갯수와 리턴타입만 잘 맞춰주면 됨!
		
		System.out.printf("result => %d\n", max);
	}

}
