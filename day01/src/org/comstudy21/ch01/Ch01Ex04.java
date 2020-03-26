package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex04 {

	public static void main(String[] args) throws IOException {
		//Sysout.in.read()를 이용하여 두 정수를 입력받아 두 수의 합을 출력
		
		System.out.print("정수1 입력 >>> ");
		int num1 = System.in.read() - '0';
		
		System.in.read(); System.in.read(); //버퍼 비우기
		
		System.out.print("정수2 입력 >>> ");
		int num2 = System.in.read() - '0';
		
		System.out.println("결과 : " + (num1+num2));

	}
}
