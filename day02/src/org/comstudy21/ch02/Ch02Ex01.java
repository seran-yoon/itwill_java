package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex01 {

	public static void main(String[] args) {
		//������ �����ϰ� ���� �Ҵ��Ѵ� (�ʱ�ȭ)
		String name = "ȫ�浿";
		int age = 25;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� <<< ");
		name = sc.next();
		System.out.print("�����Է� <<< ");
		age = sc.nextInt();
		
		System.out.println("���� >>> "+name);
		System.out.println("���� >>> "+age);

	}

}
