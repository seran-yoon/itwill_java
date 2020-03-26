package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {

	public static void main(String[] args) throws IOException {
		//문자 하나 입력 받아 출력하기
		System.out.println("문자입력 >>> ");
		int ch = System.in.read();
		//형변환 기능을 이용해서 문자 출력
		System.out.println((char)ch);

	}

}
