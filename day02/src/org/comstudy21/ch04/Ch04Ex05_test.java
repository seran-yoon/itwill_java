package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex05_test {

	public static void main(String[] args) {
		// 세 수 a,b,c를 입력 받고 세 수를 비교하여 max, mid, min 값 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max, mid, min = 0;
		
		if(a>b){
			if(b>c){
				max = a;
				mid = b;
				min = c;
			}else{ //b<c
				if(a>c){
					max = a;
					mid = c;
					min = b;
				} else { //a<c
					max = c;
					mid = a;
					min = b;
				}
			}
		} else{ //a<b
			if(b<c){
				max = c;
				mid = b;
				min = a;
			}else{ //b>c
				if(a>c){
					max = b;
					mid = a;
					min = c;
				}else{ //a<c
					max = b;
					mid = c;
					min = a;
				}
			}
		}

		System.out.println("max : "+max+" "+"mid : "+mid+" "+"min : "+min);
		
	}
}


/*
 if(a>b){
 max = a; min = b;
 }else{
 max = b; min = a;
 }
 if(c>max){
 mid = max; max = c;
 } else if(c<min){
 mid = min; min = c;
 }
 else{
 mid = c;
 }
 */
