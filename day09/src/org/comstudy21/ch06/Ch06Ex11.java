package org.comstudy21.ch06;

import java.util.Arrays;

public class Ch06Ex11 {
	
	// 함수 만드는 법
	// 1. 호출하는 함수를 만든다
	// 2. 블럭 함수를 만든다
	// 3. 매개변수의 타입을 맞춰준다
	// 4. 함수의 리턴타입을 지정한다
	// 5. 호출하는 함수의 static을 맞춰준다
	// 6. 반환형이 있다면 마지막에 return을 붙인다
	
	static void printArr(int[] arr){
		System.out.println("printArr 함수 : ");
		System.out.println(Arrays.toString(arr));
	}
	
	static void printArr(int[][] arr2){
		System.out.println("printArr : ");
		
		for(int i=0;i<arr2.length;i++){
			System.out.println(Arrays.toString(arr2[i]));
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		printArr(arr);
		printArr(arr2);
	}
}
