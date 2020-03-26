package org.comstudy21.ch06;

public class Ch06Ex05 {

	public static void main(String[] args) {
		
		//int[][] arr = new int[][] { {},{},{} }; //정석적인 배열 초기화 방법
		//int[][] arr = new int[5][];
		
		int[][] arr = { {89,78,85},
						{99,100,87},
						{83,85,90},
						{90,75,85},
						{88,98,70} };
		
		//2중 for문을 이용한 2차원 배열 순회
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++)
				System.out.print(arr[row][col] + "\t");
		}
		System.out.println();
	}

}
