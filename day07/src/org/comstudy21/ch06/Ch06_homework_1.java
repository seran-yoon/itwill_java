package org.comstudy21.ch06;

import java.util.Arrays;
import java.util.Random;

public class Ch06_homework_1 {

	static Random rand = new Random();
	static final int MAX = 6;

	public static void case01(String[] args) {
		// 로또번호 생성기
		// lotto 배열에 중복이 안들어가게 해야 함
		// 두가지 버전 이상으로 만들기

		int[] lotto = new int[6];
		int cnt = 0;

		while (cnt<6) {
			lotto[cnt]=1+rand.nextInt(45); 
			
			for(int i=1;i<=cnt;i++) { //현재 cnt인덱스 이전의 배열들 값을 현재 cnt인덱스 배열 값과 비교
				if(lotto[cnt]==lotto[i-1]){
					lotto[cnt]=1+rand.nextInt(45); //cnt인덱스 배열에 랜덤값을 다시 넣고 for문을 다시 돌려 비교 검사
					i=0;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto)); // 배열 안의 값들을 묶어서 문자로 한번에 출력
	}
	
	
	
	
	
	public static void case02(String[] args) {
		
		int[] lotto = new int[6];
		int cnt = 0;

		while (cnt<6) {
			lotto[cnt]=1+rand.nextInt(45); 
			
			for(int i=1;i<=cnt;i++) { 
				if(lotto[cnt]==lotto[i-1]){
					cnt--; //cnt를 다시 감소시켜 while문을 다시 돌림
				}
			}
			
			cnt++;
		}
		System.out.println(Arrays.toString(lotto)); 
	}
	
	
	
	
	public static void case03(String[] args) {
		
		int[] lotto = new int[6];
		int cnt = 0;

		aa : while (cnt<6) {
			lotto[cnt]=1+rand.nextInt(45); 
			
			for(int i=1;i<=cnt;i++) { 
				if(lotto[cnt]==lotto[i-1]){
					continue aa; // 그냥 continue만 쓰면 가장 가까운 반복문으로 다시 돌아가기 때문에 해당 과제에서는 while문으로 돌아가야 하기 때문에 while문에 생성자 이름을 정해주고 continue 뒤에 while문의 이름을 넣어주어 while문으로 돌아가게 만든다
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto)); 
		
	}

	
	
	
	
	public static void case04(String[] args) { 
		
		int[] lotto = new int[6];
		int cnt = 0;

		while (cnt<6) {
			lotto[cnt]=1+rand.nextInt(45); 
			
			for(int i=1;i<=cnt;i++) { 
				if(lotto[cnt]==lotto[i-1]){
					lotto[cnt]=1+rand.nextInt(45); 
					i=0;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto)); 
		
	}
	
	
	
	
	public static void case05(String[] args) {
		
		int[] lotto = new int[6];
		int cnt = 0;
		
		while(cnt<6) {
			int number = 1 + rand.nextInt(6);
			boolean flag = true;
			
			for(int i=0; i<cnt; i++) {
				if(number == lotto[i]){
					flag = false;
					break;
				}
			}
			if(flag) {
				lotto[cnt] = number;
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	
	
	public static void caxe06(String[] args) {
		
		int[] balls = new int[MAX];
		int[] lotto = new int[6];
		int cnt = 0;
		
		for(int i=0; i<MAX; i++) {
			balls[i] = i+1;
		}
		//out.println(Arrays.toString(balls));
		
		while(cnt<lotto.length) {
			int idx = rand.nextInt(MAX);
			
			if(balls[idx] != 0) {
				lotto[cnt] = balls[idx];
				balls[idx] = 0;
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	
	public static void case07(String[] args) {
		
		boolean[] flags = new boolean[MAX];
		int[] lotto = new int[6];
		int cnt = 0;
		
		while(cnt<lotto.length) {
			int idx = rand.nextInt(MAX);
			
			if(flags[idx] != true) {
				lotto[cnt] = idx + 1;
				flags[idx] = true;
				cnt++;
			}
		}
		//System.out.println(Arrays.toString(flags));
	}
	
	
	public static void case08(String[] args) {
		int[] balls = new int[MAX];
		int cnt = 0;
		
		while(cnt<6) {
			int idx = rand.nextInt(MAX);
			
			if(balls[idx] == 0) {
				balls[idx] = idx+1;
				cnt++;
			}
		}
		
		for(int i=0; i<MAX; i++) {
			if(balls[i] != 0) {
				System.out.print(balls[i] + "\t");
			}
		}
	}
	
	
	
	
	

}
