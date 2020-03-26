package org.comstudy21.ch05;

import java.util.Scanner;


public class Ch05Ex01 {

	public static void main(String[] args) {
		//구구단
		
		Scanner sc = new Scanner(System.in);

		int startDan;
		int endDan;

		System.out.print("시작하는 단 : ");
		startDan = sc.nextInt();
		System.out.print("끝나는 단 : ");
		endDan = sc.nextInt();

		while (startDan < 2 || endDan < 2 || startDan > 9 || endDan > 9) {
			System.out.println("잘못된 범위입니다. 다시 입력해주세요!");
			
			System.out.print("시작하는 단 : ");
			startDan = sc.nextInt();
			System.out.print("끝나는 단 : ");
			endDan = sc.nextInt();
		}

		// startDan~endDan까지 출력한다
		// 단, startDan이 endDan보다 큰 수가 입력되어도 같은 결과 나오도록
		// 입력은 2~9사이만 입력 받도록 유효성 체크되도록 한다
		
		
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int dan = startDan; dan <= endDan; dan++) {
			System.out.println("**" + dan + "단**");
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.println(dan+"*"+cnt+"="+dan*cnt);
			}
			System.out.println();
		}
	}
		
		
	
	
	public static void test02(String[] args) {
		//열 우선 증가
		
		for(int cnt=0;cnt<=9;cnt++){
			for(int dan=2;dan<=9;dan++){
				System.out.print(cnt==0?"**" + dan + "단**\t":dan+"*"+cnt+"="+dan*cnt+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	public static void test03(String[] args) {
		//구구단이 3행 3열로 출력되도록
	
		int i = 2; //2단부터 시작

		for(int j=1;j<=3;j++){
			for(int cnt=0;cnt<=9;cnt++) {
				for(int dan=i;dan<=i+2 && dan<=9;dan++) { //dan이 i단부터 i+2단까지 출력되고(2~4단/5~7단/8~10단), 9단까지가 마지막
					System.out.print(cnt==0?"**" + dan + "단**\t":dan+"*"+cnt+"="+dan*cnt+"\t");
				}
				System.out.println();
			}
			System.out.println();
			i += 3;
		}
		
	}
	
	
	
	public static void test04(String[] args) {
		//test01과 test03을 합치기
		
		Scanner sc = new Scanner(System.in);

		int startDan;
		int endDan;

		System.out.print("시작하는 단 : ");
		startDan = sc.nextInt();
		System.out.print("끝나는 단 : ");
		endDan = sc.nextInt();

		while (startDan < 2 || endDan < 2 || startDan > 9 || endDan > 9) {
			System.out.println("잘못된 범위입니다. 다시 입력해주세요!");

			System.out.print("시작하는 단 : ");
			startDan = sc.nextInt();
			System.out.print("끝나는 단 : ");
			endDan = sc.nextInt();
		}
		
		
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for(int j=1;j<=3;j++){
			for(int cnt=0;cnt<=9;cnt++) {
				for(int dan=startDan;dan<=startDan+2 && dan<=endDan;dan++) {
					System.out.print(cnt==0?"**" + dan + "단**\t":dan+"*"+cnt+"="+dan*cnt+"\t");
				}
				System.out.println();
			}
			System.out.println();
			startDan += 3;
		}
		
		
	}
	
	

}
