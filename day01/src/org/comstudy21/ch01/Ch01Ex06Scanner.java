package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex06Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner를 이용한 데이터 입출력
		//Scanner 객체를 먼저 선언한다 -> import java.util.Scanner;
		
		System.out.print("성명입력 >>> ");
		String name = sc.next();
		
		System.out.print("나이입력 >>> ");
		int age = sc.nextInt();
		
		System.out.println("Name => " + name);
		System.out.println("Age => " + age);

	}

}
