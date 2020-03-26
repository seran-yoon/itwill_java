package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex01 {

	public static void main(String[] args) {
		//변수를 선언하고 값을 할당한다 (초기화)
		String name = "홍길동";
		int age = 25;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성명입력 <<< ");
		name = sc.next();
		System.out.print("나이입력 <<< ");
		age = sc.nextInt();
		
		System.out.println("성명 >>> "+name);
		System.out.println("나이 >>> "+age);

	}

}
