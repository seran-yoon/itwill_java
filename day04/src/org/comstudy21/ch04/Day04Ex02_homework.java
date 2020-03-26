package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Day04Ex02_homework {

	public static void test01(String[] args) {
		//���� �߻���  Math.random(); -> 1���� ���� �Ǽ��� ����  -> double�� ���� //Math.abs(); -> ���밪(Ȥ�� ������ ���� �� ������ ����� �������� ����)

		
		double num = Math.random();
		
		//1���� 99������ ���� �߻�
		System.out.println(1+Math.abs((int)(num*100))); //*100�ϸ� 100�� ���� �ȳ��� -> 100������ ���� ���̱� ����
		
		
		//15~45�� ���� �߻�
		//15+Math.abs((int)(Math.random()*31));
		
	}
	
	public static void test02(String[] args) {
		//Math.random �� �Ⱦ��� Scanneró�� import ���༭ �ٷ� ��� ����
		
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		double num2 = rand.nextDouble();
		
		System.out.println("num => "+num);
		System.out.println("num2 => "+num2);		
	}

	
	public static void main(String[] args) {
		//���� �߻��⸦ �̿��� ���� ���� -> ���� ���� ����
		//��ǻ�Ͱ� ������ �߻���Ű�� ����ڰ� 5ȸ �õ� �ȿ� ������ ���ߴ� ����
		//���� ����� �ٽ� �Է¹ް� �ؾ��ϰ�, 5ȸ �������� �����߸� �ٽ� ����
		//�����߻� �����ϰ�(����� ����) �Է� ������ ���߸�  �¾Ҵٰ� ��¶߰�
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int min = 1, max = 100; //����
		int cnt = 5;
		char yn = 'y';
		
		int sysNum = min + rand.nextInt(max);
		
		for(int i=1;i<=cnt;i++){
			System.out.print("1~100������ ���ڸ� �����ּ���! >>> ");
			int userNum = sc.nextInt();
			
			if (userNum < min || userNum > max) {
				System.out.println("�߸��� �����Դϴ�! �ٽ� �Է����ּ���!");
			} else if (userNum != sysNum) {
				if (userNum > sysNum) {
					max = userNum-1;
					System.out.println("Ʋ�Ƚ��ϴ�!" + userNum + "���� ���� �� �Դϴ�! " + min + "~" + max + "�� ���� �Է����ּ���");
				} else { //userNum<sysNum
					min = userNum+1;
					System.out.println("Ʋ�Ƚ��ϴ�!" + userNum + "���� ū �� �Դϴ�! " + min + "~" + max + "�� ���� �Է����ּ���");
				}
				if (i==cnt) { //5�� Ƚ���� �ʰ������� ������ ��õ� ����, �ƴ��� �����ϴ� if��
					System.out.println("5���� Ƚ���� �ʰ��߽��ϴ�! ������ " + sysNum + "�Դϴ�");
					System.out.print("������ �ٽ� �����ϰڽ��ϱ�? (y/n)");
					
					yn = sc.next().charAt(0);
					
					if (yn == 'y') {
						i = 0;
						min = 1;
						max = 100;
						sysNum = min + rand.nextInt(max);
					} else if(!(yn=='y' || yn=='n')) {
					    System.out.println("y�Ǵ� n�� �Է��ϼ���");
					    System.out.print("��� �Ͻðڽ��ϱ�? (y/n) ");
					    yn = sc.next().charAt(0);						
					} else { //yn == 'n'
						System.out.println("������ �����մϴ�");
					}
					
				}
			} else { //userNum == sysNum
				System.out.println("�¾ҽ��ϴ�!");
				break;
			}
		}
	}
	
	
	
	
}
