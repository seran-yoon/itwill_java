package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex04_test {

	public static void main(String[] args) {
		// �Է¹��� ������ŭ ������ ǥ���ϰ�, 
		// X3�� ���ϴ� -����, X7�� �̻��� +����, �� �ܿ��� 0�������� ǥ��
		// �Է¹޴� ������ 0~100�� ���̿����� ���� ���, �� ���� ���� �Է½� ���� ǥ��
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String result = " ";
		
		if(0<=score && score<=100){
			if(score>=90){
				result = "A";
			}
			else if(score>=80) {
				result = "B";
			}
			else if(score>=70) {
				result = "C";
			}
			else if(score>=60) {
				result = "D";
			}
			else {
				result = "F";
			}
			
			if(score>=60 && score%10>=7 || score==100){
				result += "+";
			} else if (score>=60 && score%10<=3){
				result += "-";
			}
			
			System.out.println(result);
		}
		else {
			System.out.println("����");
		}
		
	}
}

//String�� 2�� �̻��� ���ڿ��� �����ϱ� ������ ��ȣ ������ ���� ���� �ʰ� ���� ������ ��ȣ�� �ٿ��� ���°� ���� (���� �����ο� ��ȣ ���̱�)
//result += "+";
