package org.comstudy21.ch06;

import java.util.Arrays;

public class Ch06Ex06 {

	public static void test01(String[] args) {
		/*
		 [1, 2, 3, 4, 5 ]
		 [6, 7, 8, 9, 10]
		 [11,12,13,14,15]
		 [16,17,18,19,20]
		 [21,22,23,24,25]
		 */

		int[][] arr = new int[5][5];
		int num = 1;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = num;
				num++;
			}
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		//위의 방식으로 문자열로 바꿔서 출력하는게 아닌 직접 출력하는 방법
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	
	
	
	
	public static void test02(String[] args) {
		/*
		 [1, 6, 11, 16, 21]
		 [2, 7, 12, 17, 22]
		 [3, 8, 13, 18, 23]
		 [4, 9, 14, 19, 24]
		 [5, 10,25, 20, 25]
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[j][i] = num;
				num++;
			}
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void test03(String[] args) {
		/*
		 1
		 2  3
		 4  5  6 
		 7  8  9  10
		 11 12 13 14 15
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i+1;j++){
				arr[i][j] = num;
				num++;
			}
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]!=0?arr[i][j]+"\t":"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void test04(String[] args) {
		/*
		 1  2  3  4  5
		 6  7  8  9
		 10 11 12
		 13 14
		 15
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<5-i;j++){
				arr[i][j] = num;
				num++;
			}
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]!=0?arr[i][j]+"\t":"\t");
			}
			System.out.println();
		}	
	}
	
	
	
	
	
	public static void test05(String[] args) {
		/*
		 1  1  1  1  1
		 2  2  2  2  2
		 3  3  3  3  3
		 4  4  4  4  4
		 5  5  5  5  5
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = num;
			}
			num++;
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	
	
	
	
	public static void test06(String[] args) {
		/*
		 5  5  5  5  5
		 4  4  4  4
		 3  3  3
		 2  2
		 1
		 */
		
		int[][] arr = new int[5][5];
		int num = 5;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<5-i;j++){
				arr[i][j] = num;
			}
			num--;
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]!=0?arr[i][j]+"\t":"\t");
			}
			System.out.println();
		}	
	}
	
	
	
	
	public static void test07(String[] args) {
		/*
		 5  5  5  5  5
		 4  4  4  4
		 3  3  3
		 2  2  2  2
		 1  1  1  1  1
		 */
		
		int[][] arr = new int[5][5];
		int num = 5;
		int end = 3;
		
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			if(i<3){
				end = 5-i;
			}else {
				end = i+1;
			}
			
			for(int j=0;j<end;j++){
				arr[i][j] = num;
			}
			num--;
		}
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]!=0?arr[i][j]+"\t":"\t");
			}
			System.out.println();
		}	
	}
	
	
	
	
	public static void test08(String[] args) {
		/*
		 1  2  3  4  5
		    6  7  8  9
		      10 11 12
		   13 14 15 16
		17 18 19 20 21
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		int start = 0;
		
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			if(i<3){
				start = i;
			} else{
				start = 4-i;
			}
			for(int j=start;j<arr.length;j++){
				arr[i][j] = num;
				num++;
			}	
		}
		
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]!=0?arr[i][j]+"\t":"\t");
			}
			System.out.println();
		}	
	}
	
	
	
	
	
	public static void test09(String[] args) {
		/*
		 1  2  3  4  5
		    6  7  8
		       9
		   10 11 12
		13 14 15 16 17
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		int start = 0, end = 3; 
		
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			if(i<3){
				start = i;
				end = 5-i;
			} else{
				start = 4-i;
				end = i+1;
			}
			for(int j=start;j<end;j++){
				arr[i][j] = num;
				num++;
			}	
		}
		
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]!=0?arr[i][j]+"\t":"\t");
			}
			System.out.println();
		}	
	}
	
	
	
	
	
	public static void test10(String[] args) {
		/*
		 5  4  3  2  1
		10  9  8  7  6
		15 14 13 13 11
		20 19 18 17 16
		25 24 23 22 21
		 */
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=4;j>=0;j--){
				arr[i][j] = num;
				num++;
			}
			/*
			for(int j=0;j<arr[i].length;j--){
				arr[i][4-j] = num;
				num++;
			}
			*/	
		}
		
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void test11(String[] args) {
		/*
		1   2  3  4  5
		10  9  8  7  6
		11 12 13 14 15
		20 19 18 17 16
		21 22 23 24 25
		 */

		
		//  >>출력부분을 바꿔준 코드
		int[][] arr = new int[5][5];
		int num = 1;
		int odd = 1; //홀수 변수 생성
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = num;
				num++;
			}
		}
		
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			if(i==odd){ //i가 홀수일때 출력 (1,3)
				odd += 2;
				for(int j=4;j>=0;j--){
					System.out.print(arr[i][j]+"\t");
				}
			} else { //i가 0과 짝수일때 출력 (0,2,4)
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
	
	
	/*
	      >>입력부분을 바꿔준 코드
	 
		int[][] arr = new int[5][5];
		int num = 1;
		int odd = 1; //홀수 변수를 줌
		
		//입력부분
		for(int i=0;i<arr.length;i++){
			if(i==odd){
				odd += 2;
				for(int j=4;j>=0;j--){
					arr[i][j] = num;
					num++;
				}
			} else {
				for(int j=0;j<arr[i].length;j++){
					arr[i][j] = num;
					num++;
				}
			}
		}
		
		
		//출력부분
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	
	 */
	
	
	
	
	
}
