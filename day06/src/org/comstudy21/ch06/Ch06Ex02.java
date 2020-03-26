package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex02 {

	public static void main(String[] args) {
		String[] names = new String[3];
		Scanner sc = new Scanner(System.in);
		
		//names 배열의 3명의 이름을 각각 입력받아서 출력하라

		System.out.print("3명의 이름을 입력해주세요 >>> ");
		
		for(int i=0;i<names.length;i++){
			names[i] = sc.next();
		}
		for(int i=0;i<names.length;i++){
			System.out.println((i+1)+".이름 : " + names[i]);
		}
		
		/*
		for(int i=0;i<names.length;i++){
			System.out.print("이름을 입력해주세요 >>> ");
			names[i] = sc.next();
		}
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		 */
		
	}

	
	
}
