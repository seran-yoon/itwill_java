package org.comstudy21.review;

import java.util.Scanner;

public class Ch02_practice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hakbun = 0;
		String addr = null;
		String name = null;
		
		System.out.print("hakbun >>> ");
		hakbun=sc.nextInt();
		System.out.print("Address >>> ");
		sc.nextLine(); //���ۺ���
		addr=sc.nextLine(); //'\n'���� ��� �Է� �ȴ�
		System.out.print("Name >>> ");
		name=sc.next();
		
		System.out.printf("%d) %s : %s\n", hakbun, name, addr);
	}

}
