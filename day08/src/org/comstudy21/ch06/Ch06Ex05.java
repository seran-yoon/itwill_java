package org.comstudy21.ch06;

public class Ch06Ex05 {

	public static void main(String[] args) {
		
		//int[][] arr = new int[][] { {},{},{} }; //�������� �迭 �ʱ�ȭ ���
		//int[][] arr = new int[5][];
		
		int[][] arr = { {89,78,85},
						{99,100,87},
						{83,85,90},
						{90,75,85},
						{88,98,70} };
		
		//2�� for���� �̿��� 2���� �迭 ��ȸ
		for(int row=0;row<arr.length;row++){
			for(int col=0;col<arr[row].length;col++)
				System.out.print(arr[row][col] + "\t");
		}
		System.out.println();
	}

}
