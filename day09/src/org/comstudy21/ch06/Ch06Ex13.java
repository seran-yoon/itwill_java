package org.comstudy21.ch06;

public class Ch06Ex13 {
	
	static int[] concatArr(int[] ar1, int[] ar2) {
		
		int[] ar3 = new int[7];
		
		for(int i=0;i<7;i++){
			if(i>2){
				ar3[i] = ar2[i-3];
			} else {
				ar3[i] = ar1[i];
			}
		}
		
		return ar3;
	}
	
	static void printArr(int[] ar3){
		
		System.out.println("----ar3 배열---- ");
//		System.out.println(Arrays.toString(ar3));
		for(int i=0;i<ar3.length;i++){
			System.out.printf("%d\t", ar3[i]);
		}
		System.out.println();
		
	}

	
	static int[][] mkArr(int[] ar1, int[] ar2) {
		
		int[][] ar4 = new int[2][];
		ar4[0] = new int[3];
		ar4[1] = new int[4];
		
		for(int i=0;i<2;i++){
			if(i>0){
				for(int j=0;j<ar2.length;j++){
					ar4[i][j] = ar2[j];
				}
			} else { //i==0
				for(int j=0;j<ar1.length;j++){
					ar4[i][j] = ar1[j];
				}
			}
		}
		
		return ar4;
	}
	
	static void printArr(int[][] ar4){
		
		System.out.println("----ar4 배열---- ");
		
//		for(int i=0;i<ar4.length;i++){
//			System.out.println(Arrays.toString(ar4[i]));
//		}
		for(int i=0;i<ar4.length;i++){
			for(int j=0;j<ar4[i].length;j++){
				System.out.printf("%d\t",ar4[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int[] ar1 = {10, 20, 30};
		int[] ar2 = {50, 60, 70, 80};
		
		int[] ar3 = concatArr(ar1, ar2); //두개의 배열을 하나의 배열로 합치기

		int[][] ar4 = mkArr(ar1, ar2); //두개의 배열을 2차원 배열로 만들기
		
		printArr(ar3);
		printArr(ar4);
	}

}


