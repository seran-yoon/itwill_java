package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex07 {

	public static void test01(String[] args) { //main �̸��� �ٲٸ� main�Լ��� �ٸ��� �Ǽ� ���ο� main�� ���� class�� ���� �� �ִ�
		//1.INPUT 2.OUTPUT 3.SERACH 4.SORT 5.END
		//CHOICE >>> 2
		//----- ����� �����Ͽ����ϴ� -----
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.INPUT 2.OUTPUT 3.SEARCH 4.SORT 5.END");
		System.out.print("CHOICE >>> ");
		
		int no = sc.nextInt();
		
		switch(no){
		case 1 : System.out.println("----- �Է��� �����Ͽ����ϴ� -----"); break;
		case 2 : System.out.println("----- ����� �����Ͽ����ϴ� -----"); break;
		case 3 : System.out.println("----- �˻��� �����Ͽ����ϴ� -----"); break;
		case 4 : System.out.println("----- ������ �����Ͽ����ϴ� -----"); break;
		case 5 : System.out.println("----- ���Ḧ �����Ͽ����ϴ� -----"); System.exit(0); //���μ����� ����
		default : System.out.println("����");
		}
		test01(null); // ���ȣ�� -> �����Ҷ� ���� ��� ���ư�
		//main �̸��� ���������� main�� ������ �������� �̸� ��������� ��
		//main(null) -> test01(null)
		
	} //end of method
	
	public static void main(String[] args) { //�ι�° ������ �ϱ� ���� ���ο� ���� ����
		//System.out.println("���ο� ����");
		
		//test01(null); //���� Ŭ������ �ٸ� �Լ� ȣ�� ����!
		
		
		//�� �Է� >>> 2
		//2���� 28�� ���� �ִ�
		//�� �Է� >>> 7
		//7���� 31�� ���� �ִ�
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("�� �Է� >>> ");
		
		//int month = sc.nextInt();
		
		
		/*switch(month){
		case 1 : System.out.println("1���� 31�ϱ��� �ִ�"); break;
		case 2 : System.out.println("2���� 28�ϱ��� �ִ�"); break;
		case 3 : System.out.println("3���� 31�ϱ��� �ִ�"); break;
		case 4 : System.out.println("4���� 30�ϱ��� �ִ�"); break;
		case 5 : System.out.println("5���� 31�ϱ��� �ִ�"); break;
		case 6 : System.out.println("6���� 30�ϱ��� �ִ�"); break;
		case 7 : System.out.println("7���� 31�ϱ��� �ִ�"); break;
		case 8 : System.out.println("8���� 31�ϱ��� �ִ�"); break;
		case 9 : System.out.println("9���� 30�ϱ��� �ִ�"); break;
		case 10 : System.out.println("10���� 31�ϱ��� �ִ�"); break;
		case 11 : System.out.println("11���� 30�ϱ��� �ִ�"); break;
		case 12 : System.out.println("12���� 31�ϱ��� �ִ�"); break;
		default : System.out.println("����"); 
		}*/
		
		/*
		switch(month){
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.println(month+"���� 31�ϱ��� �ִ�"); break;
		case 2 : System.out.println("2���� 28�ϱ��� �ִ�"); break;
		case 4 : case 6 : case 9 : case 11 : System.out.println(month+"���� 30�ϱ��� �ִ�"); break;
		default : System.out.println("����");
		}
		*/
		
		
		//month�� 1~12 ���̰� �ƴϸ� �ٽ� �Է� �޵���
		int month = 0, day =31; 
		
		System.out.print("�� �Է� >>> ");
		
		month = sc.nextInt();
		 
		while(month<1 || month>12) {
			System.out.println("��ȿ�� �� ���� �ƴմϴ� �ٽ� �Է����ּ���");
			System.out.print("�� �Է� >>> ");
			month = sc.nextInt();
		}
		
		 switch(month){
		 case 2 : day = 28; break;
		 case 4 : case 6 : case 9 : case 11 : day = 30;}
		 System.out.printf("%d���� %d�ϱ��� �ִ�", month, day);
		
		
	}
}
