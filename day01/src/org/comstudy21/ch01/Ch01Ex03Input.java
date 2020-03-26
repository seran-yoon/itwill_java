package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex03Input {

	public static void main(String[] args) throws IOException {
		//키보드에서 데이터 입력받기
		
		System.out.print("입력 >>> ");
		int data = System.in.read();
		System.out.println(data - '0');
		
		//순차적  => 절차적으로 실행한다
		//함수 내에서 실행되는 방식은 위에서 아래로 순차적으로 실행된다

	}
	//ASCII(아스키)값 -> 유니코드
	//0 : 48
	//1 : 49
	//a : 97
	//A : 65
}
