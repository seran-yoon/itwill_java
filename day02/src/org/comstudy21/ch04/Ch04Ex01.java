package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex01 {

	public static void main(String[] args) {
		//������ �Է¹޾Ƽ� Ȧ��-¦�� �Ǻ��ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int integer = sc.nextInt();
		
		if(integer%2==0){
			System.out.println("¦��");
		}else{
			System.out.println("Ȧ��");
		}

		/* ���ڿ� ������ �����ؼ� ����� ���� �� ���߿� �ѹ��� ���
		 String result = ""; 
		 
		 if(integer%2==0){
			result = "¦��";
		}else{
			result = "Ȧ��";
		}
		
		System.out.println(result);
		 */
		
		
		/* ���ڿ� ������ ����, Ȧ�� ������� �̸� �����ϰ� if���� ����
		 String result = "Ȧ��"; 
		 
		 if(integer%2==0){
			result = "¦��"; }
		
		System.out.println(result);
		 */
		
	}
}
