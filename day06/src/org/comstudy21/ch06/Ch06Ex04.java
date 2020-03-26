package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex04 {
	public static void test01(String[] args) {
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		
		//1���� total�Դϴ� ���
		for(int i=0;i<days.length;i++){
			total += days[i];
		}
		System.out.println("1���� "+total+"�� �Դϴ�.");
	
	}
	
	
	
	
	public static void test02(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		//�� �Է� : 2
		//-> 2���� 28�� ���� �ִ�
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		System.out.println(month+"���� "+days[month-1]+"�� ���� �ִ�");
		
		
	}
	
	
	
	public static void test03(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�� �Է� : 8
		//�� �Է� : 27
		//->1���� ?�� ���ҽ��ϴ�
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
	
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		//month�� �ش� �� days[month-1];
		
		System.out.print("�� �Է� : ");
		int day = sc.nextInt();
		int num = days[month-1]-day; //month�� �ش� �Ͽ��� �Է¹��� �� ��ŭ ���� ��
		
		for(int i=month;i<days.length;i++){ //i�� month���� �����ϴ� ������ ���� �Է¹��� month�� ���� �迭 days���� month-1�ε��� ���̱� ������ �Է¹��� ���� �޺��� total�� ����� �ϱ� ����
			total += days[i];
		}
		
		System.out.println("1���� "+(total+num)+"�� ���ҽ��ϴ�");
		
		
	}
	
	
	
	
	public static void test04(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����
		//�� �Է� : 8
		//�� �Է� : 27
		//->100�� ���� ��¥�� ���
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		int i;
	
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		System.out.print("�� �Է� : ");
		int day = sc.nextInt();
		int num = days[month-1]-day; //�Է¹��� ���� �ش� �ϼ�-�Է� ���� ��=�Է� ���� ���� ���� �� ��
		
		for(i=month;i<month+3;i++){ //�Է� ���� ���� �����޺��� 3�޵����� �ϼ� �� ���� ����. ex)�� �Է� : 4 -> 5,6,7���� �ϼ� �� ��=92��=total���� ����
			total += days[i%12];
		} 
		
		month=i; //month���� �Է¹��� ���� ����° �޷� �ٲ���
		if(month>12) { //12�� �̻��� ��� �ٽ� 1���� �ٲ��ֱ�
			month %= 12;
		}
		
		int num2 = 99-(total+num); //100��°�� ���ϱ� ���� 99-(�Է¹��� ���� ���� �ϼ�+�Է¹��� ���� ���� �� ���� ��)=������ �� ��
		
		System.out.print("100�� ���� ��¥�� >>> ");
		
		if(num2<0) { //num2���� �����̸� �Է¹��� ���� ���� ����° ���̹Ƿ� 3��° ���� �� �ϼ����� num2���� ����
			num2=days[month-1]+num2; //num2���� �����̱� ������ �����ϰ� ���ַ��� ������ �ؾ� ��
			System.out.println(month+"�� "+num2+"��");
		} else if(num2==0) { //num2���� 0�̸� �Է¹��� ���� ���� ����° ���� ������ ��
			System.out.println(month+"�� "+days[month-1]+"��"); 
		} else { // num2>0 //num2���� ����̸� �Է¹��� ���� ���� ����° ���� �� ä��� �׹�° ���� �ϼ����� ����
			month += 1;
			if(month>12)
				month %= 12;
			System.out.println(month+"�� "+num2+"��"); 
		} //�Է¹��� ��¥���� �����ؼ� 100���� ã�� ���
		
		
		
		/*
		 
	 public static void main(String[] args) {
	 	static Scanner scan = new Scanner(System.in);
  		
  		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
  		
  		int month, day;
  		int dMonth, dDay;
  		int total = 0;

  		System.out.print("Input month >>> ");
  		month = scan.nextInt();
  		System.out.print("Input day >>> ");
  		day = scan.nextInt();
  
  		System.out.printf("%d��%d�� �� 100�� �Ĵ� ", month, day);
  
  		// total�� ���� ���� ���� ��¥�� ����.
  		// ������� month, ������� index�� [month-1]
  		total = days[month-1] - day;
  		
  		int i = month; // ������� ������ ÷��
  		
  		while(total < 100) {
   		i = i%12;
   		total += days[i];
   		i++;
  		}
  		// ������ 100���� ũ��.
  		
  		dDay = days[i-1]-(total-100);
  		dMonth = i;
  		
  		System.out.printf("%d��%d���Դϴ�.\n", dMonth, dDay);
	}
		 
		 */
		

		
		/* 100�Ϻ��� ���� ã�� ���
 
 	public static void main(String[] args) {
 		static Scanner scan = new Scanner(System.in);
  		
  		int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
  		
  		int month, day;
  		int dMonth, dDay;
  		int total = 0;

  		System.out.print("Input month >>> ");
  		month = scan.nextInt();
  		System.out.print("Input day >>> ");
  		day = scan.nextInt();
  
  		System.out.printf("%d��%d�� �� 100�� �Ĵ� ", month, day);
  
  		total = 100 - (days[month-1] - day); // ������� ���� ��¥�� ����.
  		
  		int i = month % 12;
  		
  		while(total > days[i]) {
   		total = total - days[i];
   		i++;
   		i %= 12;
  		}
  		
  		dMonth = i + 1;
  		dDay = total;
  		
  		System.out.printf("%d��%d���Դϴ�.\n", dMonth, dDay);
 	 }

		 */
		
		
		
		
		
		
	}
	
	
	
	public static void test05(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����
		//�� �Է� : 8
		//�� �Է� : 27
		//->100�� ���� ��¥�� ���
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
	
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		System.out.print("�� �Է� : ");
		int day = sc.nextInt();
		int num = days[month-1]-day;
		
		//System.out.print("100�� ���� ��¥�� >>> ");
		
		for(int i=month;num<i;i++){
			num += days[i%12];
			System.out.print("num>"+num+" "); //num���� ������ ���� ���� ���
			month = i+2;
			System.out.print("month>"+month+" "); //i���� ������ ���� ���� ���
			day = 99-num;
			System.out.print("day>"+day+" /");
		}

		System.out.println(month+"��"+day+"��"); 
		
		//�ؾ��� �͵�
		//12�� �Ѿ�� 1���� �ȹٲ�°�
		//10��24�Ϻ��� day�� 30���� �Ѿ�°�

		
	}
	
	

	
}
