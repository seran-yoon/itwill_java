package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex04 {

	public static void main(String[] args) throws IOException {
		//Sysout.in.read()�� �̿��Ͽ� �� ������ �Է¹޾� �� ���� ���� ���
		
		System.out.print("����1 �Է� >>> ");
		int num1 = System.in.read() - '0';
		
		System.in.read(); System.in.read(); //���� ����
		
		System.out.print("����2 �Է� >>> ");
		int num2 = System.in.read() - '0';
		
		System.out.println("��� : " + (num1+num2));

	}
}
