package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex08 {
	
	public static void main(String[] args) {
		int total = 0;
		//1~10���� ����ϰ� total�� 1~10���� �����Ѵ�
		
		for(int i=1;i<=10;i++){
			total += i;
			System.out.print(i + (i==10?"=":"+") );
		}
			System.out.println(total);
	
	}
	
	public static void test03(String[] args) {
		for(int i=1;i<=10;i++){
			if(i%2!=0){
			//System.out.println(i);
			System.out.print(i+" ");
			}//end of if
		}//end of for
	}//end of main
	
	public static void test02(String[] args) {
		//1~10������ Ȧ���� ����Ѵ�
		for(int i=1; i<=10; i+=2){
			System.out.print(i + " ");
		}
	}

	public static void test01(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=5; i++){ //2�� �����Ϸ��� �����Ŀ� i+=2 ���ָ� ��
			System.out.println("ȫ�浿");
		}
	}

}
