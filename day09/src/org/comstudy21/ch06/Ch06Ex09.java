package org.comstudy21.ch06;

public class Ch06Ex09 {
	
	static int getMax(int a, int b){ //���Ϲ޴� ������ Ÿ���� int�̱� ������  void -> int�� �ۼ�
		
		if(a>b){
			return a;
		} else{
			return b;
		}
		
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 35;
		
		int max = getMax(a, getMax(b, c)); //getMax(b, c)�Լ��� ���� ������ �ʾƵ� �� ->������ �Լ��� ���°� �ƴ϶� ������ ���� ���� ������ ������ �̸��� ��� ���� ������ ����Ÿ�Ը� �� �����ָ� ��!
		
		System.out.printf("result => %d\n", max);
	}

}
