package org.comstudy21.review;

public class Ch05_practice_3 {

	public static void Q1(String[] args) {
		
		int n = 3;
		
//		switch(n){
//		case 1: System.out.println("Simple Java"); break;
//		case 2: System.out.println("Funny Java"); break;
//		case 3: System.out.println("Fantastic Java"); break;
//		default : System.out.println("The best programming language");
//		}
//		
//		System.out.println("do you like Java?");

		
		if(n==1){
			System.out.println("Simple Java");
		} else if(n==2){
			System.out.println("Funny Java");
		} else if(n==3){
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		
		System.out.println("do you like Java?");

	}
	
	
	
	public static void Q2(String[] args) {
		
		int n = 24;
		
//		if(n>=0 && n<10){
//			System.out.println("0�̻� 10�̸��� ��");
//		} else if(n>=10 && n<20){
//			System.out.println("10�̻� 20�̸��� ��");
//		} else if(n>=20 && n<30){
//			System.out.println("20�̻� 30�̸��� ��");
//		} else{
//			System.out.println("���� Ȥ�� 30�̻��� ��");
//		}
		
		switch(n){
		case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: System.out.println("0�̻� 10�̸��� ��"); break;
		case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: System.out.println("10�̻� 20�̸��� ��"); break;
		case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: System.out.println("20�̻� 30�̸��� ��"); break;
		default : System.out.println("���� Ȥ�� 30�̻��� ��");
		}
		
	}
}


