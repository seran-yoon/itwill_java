package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex07 {

	public static void test01(String[] args) { //main 이름을 바꾸면 main함수가 다른게 되서 새로운 main을 같은 class에 만들 수 있다
		//1.INPUT 2.OUTPUT 3.SERACH 4.SORT 5.END
		//CHOICE >>> 2
		//----- 출력을 선택하였습니다 -----
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.INPUT 2.OUTPUT 3.SEARCH 4.SORT 5.END");
		System.out.print("CHOICE >>> ");
		
		int no = sc.nextInt();
		
		switch(no){
		case 1 : System.out.println("----- 입력을 선택하였습니다 -----"); break;
		case 2 : System.out.println("----- 출력을 선택하였습니다 -----"); break;
		case 3 : System.out.println("----- 검색을 선택하였습니다 -----"); break;
		case 4 : System.out.println("----- 정렬을 선택하였습니다 -----"); break;
		case 5 : System.out.println("----- 종료를 선택하였습니다 -----"); System.exit(0); //프로세스를 종료
		default : System.out.println("에러");
		}
		test01(null); // 재귀호출 -> 종료할때 까지 계속 돌아감
		//main 이름을 변경했으면 main을 선언한 곳에서도 이름 변경해줘야 함
		//main(null) -> test01(null)
		
	} //end of method
	
	public static void main(String[] args) { //두번째 예제를 하기 위해 새로운 메인 선언
		//System.out.println("새로운 메인");
		
		//test01(null); //같은 클래스의 다른 함수 호출 가능!
		
		
		//월 입력 >>> 2
		//2월은 28일 까지 있다
		//월 입력 >>> 7
		//7월은 31일 까지 있다
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("월 입력 >>> ");
		
		//int month = sc.nextInt();
		
		
		/*switch(month){
		case 1 : System.out.println("1월은 31일까지 있다"); break;
		case 2 : System.out.println("2월은 28일까지 있다"); break;
		case 3 : System.out.println("3월은 31일까지 있다"); break;
		case 4 : System.out.println("4월은 30일까지 있다"); break;
		case 5 : System.out.println("5월은 31일까지 있다"); break;
		case 6 : System.out.println("6월은 30일까지 있다"); break;
		case 7 : System.out.println("7월은 31일까지 있다"); break;
		case 8 : System.out.println("8월은 31일까지 있다"); break;
		case 9 : System.out.println("9월은 30일까지 있다"); break;
		case 10 : System.out.println("10월은 31일까지 있다"); break;
		case 11 : System.out.println("11월은 30일까지 있다"); break;
		case 12 : System.out.println("12월은 31일까지 있다"); break;
		default : System.out.println("에러"); 
		}*/
		
		/*
		switch(month){
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.println(month+"월은 31일까지 있다"); break;
		case 2 : System.out.println("2월은 28일까지 있다"); break;
		case 4 : case 6 : case 9 : case 11 : System.out.println(month+"월은 30일까지 있다"); break;
		default : System.out.println("에러");
		}
		*/
		
		
		//month가 1~12 사이가 아니면 다시 입력 받도록
		int month = 0, day =31; 
		
		System.out.print("월 입력 >>> ");
		
		month = sc.nextInt();
		 
		while(month<1 || month>12) {
			System.out.println("유효한 달 수가 아닙니다 다시 입력해주세요");
			System.out.print("월 입력 >>> ");
			month = sc.nextInt();
		}
		
		 switch(month){
		 case 2 : day = 28; break;
		 case 4 : case 6 : case 9 : case 11 : day = 30;}
		 System.out.printf("%d월은 %d일까지 있다", month, day);
		
		
	}
}
