package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex06Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner�� �̿��� ������ �����
		//Scanner ��ü�� ���� �����Ѵ� -> import java.util.Scanner;
		
		System.out.print("�����Է� >>> ");
		String name = sc.next();
		
		System.out.print("�����Է� >>> ");
		int age = sc.nextInt();
		
		System.out.println("Name => " + name);
		System.out.println("Age => " + age);

	}

}
