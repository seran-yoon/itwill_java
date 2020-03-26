package org.comstudy21.ch06;

import java.util.Arrays;
import java.util.Random;

public class Ch06_homework_1 {

	static Random rand = new Random();
	static final int MAX = 6;

	public static void case01(String[] args) {
		// �ζǹ�ȣ ������
		// lotto �迭�� �ߺ��� �ȵ��� �ؾ� ��
		// �ΰ��� ���� �̻����� �����

		int[] lotto = new int[6];
		int cnt = 0;

		while (cnt<6) {
			lotto[cnt]=1+rand.nextInt(45); 
			
			for(int i=1;i<=cnt;i++) { //���� cnt�ε��� ������ �迭�� ���� ���� cnt�ε��� �迭 ���� ��
				if(lotto[cnt]==lotto[i-1]){
					lotto[cnt]=1+rand.nextInt(45); //cnt�ε��� �迭�� �������� �ٽ� �ְ� for���� �ٽ� ���� �� �˻�
					i=0;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto)); // �迭 ���� ������ ��� ���ڷ� �ѹ��� ���
	}
	
	
	
	
	
	public static void case02(String[] args) {
		
		int[] lotto = new int[6];
		int cnt = 0;

		while (cnt<6) {
			lotto[cnt]=1+rand.nextInt(45); 
			
			for(int i=1;i<=cnt;i++) { 
				if(lotto[cnt]==lotto[i-1]){
					cnt--; //cnt�� �ٽ� ���ҽ��� while���� �ٽ� ����
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
					continue aa; // �׳� continue�� ���� ���� ����� �ݺ������� �ٽ� ���ư��� ������ �ش� ���������� while������ ���ư��� �ϱ� ������ while���� ������ �̸��� �����ְ� continue �ڿ� while���� �̸��� �־��־� while������ ���ư��� �����
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
