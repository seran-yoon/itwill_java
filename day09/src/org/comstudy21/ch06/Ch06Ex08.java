package org.comstudy21.ch06;

public class Ch06Ex08 {
	
	static void horizontal(char ch, int size){ //���Ϲ޴°� ������ �⺻ Ÿ���� void�� �ۼ�
		
		for(int i=0;i<size;i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		horizontal('+', 20);
		horizontal('*', 50);
		horizontal('#', 10);
		
	}

}
