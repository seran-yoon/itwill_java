package org.comstudy21.ch06;

import java.util.Arrays;

public class Ch06Ex11 {
	
	// �Լ� ����� ��
	// 1. ȣ���ϴ� �Լ��� �����
	// 2. �� �Լ��� �����
	// 3. �Ű������� Ÿ���� �����ش�
	// 4. �Լ��� ����Ÿ���� �����Ѵ�
	// 5. ȣ���ϴ� �Լ��� static�� �����ش�
	// 6. ��ȯ���� �ִٸ� �������� return�� ���δ�
	
	static void printArr(int[] arr){
		System.out.println("printArr �Լ� : ");
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
