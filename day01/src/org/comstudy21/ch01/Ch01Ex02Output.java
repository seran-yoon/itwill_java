package org.comstudy21.ch01;

public class Ch01Ex02Output {

	public static void main(String[] args) {
		
		System.out.println("���� : ");
		System.out.println("ȫ�浿");
		
		System.out.printf("���� : %s\n", "��浿");
		System.out.printf("���� : %d\n", 25);
		System.out.printf("�÷� : %.1f\n", 1.5);
		System.out.printf("������ : %c\n", 'A');

	}
}

/*
 
 *** ��ȯ���� ***
 %s - ���ڿ��� ��ȯ
 %i - ������ ��ȯ
 %d - (10����)������ ��ȯ  %o(8����) %x(16����)
 %c - ���ڷ� ��ȯ
 %f - �Ǽ��� ��ȯ
 
 *** ���ڿ� ���ڿ��� ���� ***
 ���ڴ� Ȭ����ǥ�� ����ϰ� ���ڿ��� �ֵ���ǥ�� ����Ѵ�
 'A' - ���� -> [A]
 "A" - ���ڿ� -> [A][\0]
 ���ڿ��� �޸𸮿� �ּ� 2���ڰ� ����
 
 *** Ư������ ***
 \n - �� �ٲ�
 \r - ����
 \t - �� Ű
 \' - Ȭ����ǥ
 \" - �ֵ���ǥ
 \a - �����
 
 */
