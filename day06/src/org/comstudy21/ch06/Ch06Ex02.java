package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex02 {

	public static void main(String[] args) {
		String[] names = new String[3];
		Scanner sc = new Scanner(System.in);
		
		//names �迭�� 3���� �̸��� ���� �Է¹޾Ƽ� ����϶�

		System.out.print("3���� �̸��� �Է����ּ��� >>> ");
		
		for(int i=0;i<names.length;i++){
			names[i] = sc.next();
		}
		for(int i=0;i<names.length;i++){
			System.out.println((i+1)+".�̸� : " + names[i]);
		}
		
		/*
		for(int i=0;i<names.length;i++){
			System.out.print("�̸��� �Է����ּ��� >>> ");
			names[i] = sc.next();
		}
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		 */
		
	}

	
	
}
