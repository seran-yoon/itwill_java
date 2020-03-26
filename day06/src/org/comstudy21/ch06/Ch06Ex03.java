package org.comstudy21.ch06;

public class Ch06Ex03 {

	public static void main(String[] args) {
		//배열을 선언과 동시에 초기화 하기
		
		//int[] arr = new int[]{30,35,40,45,50};
		int[] arr = {30,35,40,45,50};
		int total = 0;
		double avg = 0.0;
		
		for(int i=0;i<arr.length;i++){
			total += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("\ntotal => "+total);
		avg = (double)total/arr.length; //total을 형변환 시켜줌 (int->double)
		System.out.println("avg => "+avg);

		
	}

}
