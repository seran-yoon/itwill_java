package org.comstudy21.ch04;

//import java.util.Scanner;

public class Ch04Ex09 {

	public static void test01(String[] args) {
		//별 찍기
		//*****
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void test02(String[] args) {
		//차례로 별 찍기
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void test03(String[] args) {
		//거꾸로 별 찍기
		//*****
		//****
		//***
		//**
		//*
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void test04(String[] args) {
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		for(int i=0;i<5;i++){ //i=*, j=공백
			for(int j=0;j<5;j++){
				System.out.print(j<i?" ":"*"); //삼항연산자 (조건?참:거짓)
			}
			System.out.println();
		}
		
		/*
		 for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		 */
	}
	
	public static void test05(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		/*
		for(int i=0;i<5;i++){ //i=*, j=공백
			for(int j=4;j>=0;j--){
				System.out.print(j>i?" ":"*"); //삼항연산자 (조건?참:거짓)
			}
			System.out.println();
		}
		*/
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				if(j<4-i){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void test06(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		int end = 5;
		
		for(int i=0;i<9;i++){
			for(int j=0;j<end;j++){
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4){
				end--;
			} else{
				end++;
			}
		}
	}
	
	public static void test07(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		int end = 5;
		
		for(int i=0;i<9;i++){ 
			for(int j=1;j<=5;j++){ 
				System.out.print(j<end?" ":"*");
			} //한줄에서 별찍기 반복되는 for문
			System.out.println();
			
			if(i<4){ 
				end--;
			} else{
				end++;
			}
		}
	
	}
	
	public static void test08(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		int num = 1; //num = 2*i+1
		
		for(int i=0;i<5;i++){ 
			for(int j=4-i;j>0;j--){ //for(int j=0;j<4-i;j--)
				System.out.print(" ");
			}
			for(int k=0;k<num;k++){
				System.out.print("*");
			}
			
			System.out.println();
			
			num += 2;
		}
		
		
		/*
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i + 2*i+1;j--)
				System.out.print(j<4-i?" ":"*");
			}
			System.out.println();
		}
		 */
		

	}
	
	public static void test09(String[] args) {
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		int num = 9; //num = (4-i)*2+1
		
		 for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<num;k++){
				System.out.print("*");
			}
			System.out.println();
			
			num -= 1;
		 }
		
		 
		 /*
		 for(int i=0;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<(4-i)*2+1;k++){
				System.out.print("*");
			}
			System.out.println();
		
		 }
		  
		  */
		 
		 
		 
	}
	
	
	public static void test10(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		int end = 5;
		int num1 = 1;
		int num2 = 13;
		
		for(int i=0;i<9;i++){
			if(i<4){
				for (int j=4-i;j>0;j--) {
					System.out.print(" ");
				}
				for (int k=0;k<num1;k++) {
					System.out.print("*");
				}

				num1 += 2;
				end--;
			} 
			else{
				for(int j=4;j<i;j++){
					System.out.print(" ");
				}
				for(int k=i;k<num2;k++){
					System.out.print("*");
				}
				
				num2 -= 1;
				end++;
			}
			
			System.out.println();
		}
		
		
		/*
		 int cnt = 0;
		 
		 for(int i=0;i<9;i++) {
		 	for(int j=0;j<4-cnt + cnt*2+1;j++)
		 		if(j<4-cnt)
		 			System.out.print("");
		 		else()
		 }
		 
		 */
		
		
	}
		
	
	
	public static void test11(String[] args) {
		//*********
		//**** ****
		//***   ***
		//**     **
		//*       *
		//**     **
		//***   ***
		//**** ****
		//*********

	}
		
		

	public static void test12(String[] args) {
		//*
		//**
		//* *
		//*  *
		//*****
		
	}
	
	
	public static void test13(String[] args) {
		//*****
		//*  *
		//* *
		//**
		//*
		
	}
	
	
	
	public static void test14(String[] args) {
		//행수 : 5
		//*****
		//**  *
		//* * *
		//*  **
		//*****
	}
	
	

	public static void test15(String[] args) {
		//*********
		//*  * *  *
		//* *   * *
		//**     **
		//*       *
		//**     **
		//* *   * *
		//*  * *  *
		//*********
		
	}
	
	
}
