package org.comstudy21.ch02;

import static java.lang.System.out; //System.out.print�� ���� System.�� �����ϱ� ���� import -> out.print ���� shift+ctrl+o �ؼ� import����
import java.util.Scanner;

public class Ch02Ex03Pi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
 		final double PI = 3.141592; //final�� ���̸� ���� ���ٲ� -> ������ ����� �� -> ����� �빮�ڷ� ���ִ°� ����
		 
		int r = sc.nextInt(); //�Լ� �ȿ��� �����ϴ� ������ ��������(local) -> r�� Ŭ���� ���� �Լ��ȿ��� ���������� �������� -> ���������� �ʱ�ȭ �ʼ�, ���� �̸� ��������� ��
		
		double area = 0;
		double round = 0;
		
		area = r*r*PI;
		round = 2*PI*r;
		
		out.printf("�������� %d��  ���� �ѷ��� ���̴�  %f�̴�\n", r, round); //printf�� �ٹٲ��� ���� ����� ��
		out.printf("�������� %d��  ���� ���̴�  %f�̴�", r, area);

	}

}

//�ڹٿ����� �������� �Ǽ��� �� ū Ÿ��
//������ ������ �����ϸ� ������� ����, ������ �Ǽ��� �����ϸ� ������� �Ǽ�
//longŸ�Ժ��� floatŸ���� �� ū Ÿ������ �ν�
