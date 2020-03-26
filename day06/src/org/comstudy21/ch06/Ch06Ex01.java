package org.comstudy21.ch06;

public class Ch06Ex01 {

	public static void main(String[] args) {
		//1차원 배열
		
		//String[] arr = new String[6];
	
		final int SIZE = 5;
		int[] arr = new int[5];
		
		/*
		arr[0] = 50;
		arr[1] = 100;
		arr[2] = 150;
		arr[3] = 200;
		arr[SIZE-1] = 250;
		*/
		
		for(int i=0;i<arr.length;i++){
			arr[i] = 50*(i+1);
		}
		
		/*
		int num =50;
		
		for(int j=0;j<arr.length;j++){
			arr[j] = num;
			num += 50;
		}
		*/
		
		
		for(int i=0;i<arr.length;i++){ //arr.length == SIZE
			System.out.println((i+1)+") arr["+i+"]: "+arr[i]);
		}

		
		
	}

}
