package org.comstudy21.ch05;

import java.util.Scanner;


public class Ch05Ex01 {

	public static void main(String[] args) {
		//������
		
		Scanner sc = new Scanner(System.in);

		int startDan;
		int endDan;

		System.out.print("�����ϴ� �� : ");
		startDan = sc.nextInt();
		System.out.print("������ �� : ");
		endDan = sc.nextInt();

		while (startDan < 2 || endDan < 2 || startDan > 9 || endDan > 9) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���!");
			
			System.out.print("�����ϴ� �� : ");
			startDan = sc.nextInt();
			System.out.print("������ �� : ");
			endDan = sc.nextInt();
		}

		// startDan~endDan���� ����Ѵ�
		// ��, startDan�� endDan���� ū ���� �ԷµǾ ���� ��� ��������
		// �Է��� 2~9���̸� �Է� �޵��� ��ȿ�� üũ�ǵ��� �Ѵ�
		
		
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for (int dan = startDan; dan <= endDan; dan++) {
			System.out.println("**" + dan + "��**");
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.println(dan+"*"+cnt+"="+dan*cnt);
			}
			System.out.println();
		}
	}
		
		
	
	
	public static void test02(String[] args) {
		//�� �켱 ����
		
		for(int cnt=0;cnt<=9;cnt++){
			for(int dan=2;dan<=9;dan++){
				System.out.print(cnt==0?"**" + dan + "��**\t":dan+"*"+cnt+"="+dan*cnt+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	public static void test03(String[] args) {
		//�������� 3�� 3���� ��µǵ���
	
		int i = 2; //2�ܺ��� ����

		for(int j=1;j<=3;j++){
			for(int cnt=0;cnt<=9;cnt++) {
				for(int dan=i;dan<=i+2 && dan<=9;dan++) { //dan�� i�ܺ��� i+2�ܱ��� ��µǰ�(2~4��/5~7��/8~10��), 9�ܱ����� ������
					System.out.print(cnt==0?"**" + dan + "��**\t":dan+"*"+cnt+"="+dan*cnt+"\t");
				}
				System.out.println();
			}
			System.out.println();
			i += 3;
		}
		
	}
	
	
	
	public static void test04(String[] args) {
		//test01�� test03�� ��ġ��
		
		Scanner sc = new Scanner(System.in);

		int startDan;
		int endDan;

		System.out.print("�����ϴ� �� : ");
		startDan = sc.nextInt();
		System.out.print("������ �� : ");
		endDan = sc.nextInt();

		while (startDan < 2 || endDan < 2 || startDan > 9 || endDan > 9) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���!");

			System.out.print("�����ϴ� �� : ");
			startDan = sc.nextInt();
			System.out.print("������ �� : ");
			endDan = sc.nextInt();
		}
		
		
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}

		for(int j=1;j<=3;j++){
			for(int cnt=0;cnt<=9;cnt++) {
				for(int dan=startDan;dan<=startDan+2 && dan<=endDan;dan++) {
					System.out.print(cnt==0?"**" + dan + "��**\t":dan+"*"+cnt+"="+dan*cnt+"\t");
				}
				System.out.println();
			}
			System.out.println();
			startDan += 3;
		}
		
		
	}
	
	

}
