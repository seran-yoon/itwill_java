package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex04 {
	public static void test01(String[] args) {
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		
		//1년은 total입니다 출력
		for(int i=0;i<days.length;i++){
			total += days[i];
		}
		System.out.println("1년은 "+total+"일 입니다.");
	
	}
	
	
	
	
	public static void test02(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		//월 입력 : 2
		//-> 2월은 28일 까지 있다
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.println(month+"월은 "+days[month-1]+"일 까지 있다");
		
		
	}
	
	
	
	public static void test03(String[] args) {
		Scanner sc = new Scanner(System.in);
		//월 입력 : 8
		//일 입력 : 27
		//->1년이 ?일 남았습니다
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
	
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		//month의 해당 일 days[month-1];
		
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		int num = days[month-1]-day; //month의 해당 일에서 입력받은 일 만큼 빼준 값
		
		for(int i=month;i<days.length;i++){ //i가 month부터 시작하는 이유는 내가 입력받은 month의 값은 배열 days에서 month-1인덱스 값이기 때문에 입력받은 다음 달부터 total을 해줘야 하기 때문
			total += days[i];
		}
		
		System.out.println("1년이 "+(total+num)+"일 남았습니다");
		
		
	}
	
	
	
	
	public static void test04(String[] args) {
		Scanner sc = new Scanner(System.in);
		//과제
		//월 입력 : 8
		//일 입력 : 27
		//->100일 후의 날짜를 출력
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		int i;
	
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		int num = days[month-1]-day; //입력받은 달의 해당 일수-입력 받은 일=입력 받은 달의 남은 일 수
		
		for(i=month;i<month+3;i++){ //입력 받은 달의 다음달부터 3달동안의 일수 총 합을 구함. ex)월 입력 : 4 -> 5,6,7월의 일수 총 합=92일=total값에 저장
			total += days[i%12];
		} 
		
		month=i; //month값은 입력받은 달의 세번째 달로 바꿔줌
		if(month>12) { //12월 이상일 경우 다시 1월로 바꿔주기
			month %= 12;
		}
		
		int num2 = 99-(total+num); //100일째를 구하기 위해 99-(입력받은 달의 남은 일수+입력받은 달의 다음 세 달의 합)=부족한 일 수
		
		System.out.print("100일 후의 날짜는 >>> ");
		
		if(num2<0) { //num2값이 음수이면 입력받은 달의 다음 세번째 달이므로 3번째 달의 총 일수에서 num2값을 빼줌
			num2=days[month-1]+num2; //num2값이 음수이기 때문에 순수하게 빼주려면 덧셈을 해야 함
			System.out.println(month+"월 "+num2+"일");
		} else if(num2==0) { //num2값이 0이면 입력받은 달의 다음 세번째 달의 마지막 날
			System.out.println(month+"월 "+days[month-1]+"일"); 
		} else { // num2>0 //num2값이 양수이면 입력받은 달의 다음 세번째 달을 꽉 채우고 네번째 달의 일수부터 시작
			month += 1;
			if(month>12)
				month %= 12;
			System.out.println(month+"월 "+num2+"일"); 
		} //입력받은 날짜에서 누적해서 100일을 찾는 방법
		
		
		
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
  
  		System.out.printf("%d월%d일 의 100일 후는 ", month, day);
  
  		// total에 현재 달의 남은 날짜를 저장.
  		// 현재달은 month, 현재달의 index는 [month-1]
  		total = days[month-1] - day;
  		
  		int i = month; // 현재달의 다음달 첨자
  		
  		while(total < 100) {
   		i = i%12;
   		total += days[i];
   		i++;
  		}
  		// 무조건 100보다 크다.
  		
  		dDay = days[i-1]-(total-100);
  		dMonth = i;
  		
  		System.out.printf("%d월%d일입니다.\n", dMonth, dDay);
	}
		 
		 */
		

		
		/* 100일부터 빼서 찾는 방법
 
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
  
  		System.out.printf("%d월%d일 의 100일 후는 ", month, day);
  
  		total = 100 - (days[month-1] - day); // 현재달의 남은 날짜를 뺀다.
  		
  		int i = month % 12;
  		
  		while(total > days[i]) {
   		total = total - days[i];
   		i++;
   		i %= 12;
  		}
  		
  		dMonth = i + 1;
  		dDay = total;
  		
  		System.out.printf("%d월%d일입니다.\n", dMonth, dDay);
 	 }

		 */
		
		
		
		
		
		
	}
	
	
	
	public static void test05(String[] args) {
		Scanner sc = new Scanner(System.in);
		//과제
		//월 입력 : 8
		//일 입력 : 27
		//->100일 후의 날짜를 출력
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
	
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		int num = days[month-1]-day;
		
		//System.out.print("100일 후의 날짜는 >>> ");
		
		for(int i=month;num<i;i++){
			num += days[i%12];
			System.out.print("num>"+num+" "); //num값의 진행을 보기 위한 출력
			month = i+2;
			System.out.print("month>"+month+" "); //i값의 진행을 보기 위한 출력
			day = 99-num;
			System.out.print("day>"+day+" /");
		}

		System.out.println(month+"월"+day+"일"); 
		
		//해야할 것들
		//12월 넘어가면 1월로 안바뀌는거
		//10월24일부터 day가 30일을 넘어가는거

		
	}
	
	

	
}
