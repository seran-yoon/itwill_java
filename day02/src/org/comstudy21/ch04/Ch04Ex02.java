package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result = null;
		
		if(num>0){
			result = "���";
		}else if(num<0){
			result = "����";
		}
		else{
			result = "0";
		}

		System.out.println(result);
		
	}
}

