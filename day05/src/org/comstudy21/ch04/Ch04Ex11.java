package org.comstudy21.ch04;

public class Ch04Ex11 {

	public static void test01(String[] args) {
		//while문 사용
		//1~100사이의 숫자중에 3의 배수이면서 5의 배수를 total에 누적한다
		
		int i = 1;
		int total = 0;
		
		while(i<=100){
			if(i%3==0 && i%5==0){
			total += i;
			System.out.print(i+(i==90?"=":"+"));
			}
			
			i++;
		}// end of while
		System.out.println(total);
	}
	
	public static void test02(String[] args) {
		//3+4+7+11+18+29+47=119
		
		int a = 3, b = 4;
		int total = 0, sum = 0;
		
		for(int i=1;i<=7;i++){
			total = a+b;
			sum += a;
			
			System.out.print(i<7?a+"+":a+"=");
			
			a=b;
			b=total;
		}
		System.out.println(sum);
		
		
		/*
		 
		int a = 1; // 이전항 prev
		int b = 3; // 현재항 cur
		int total = 4; // 다음항
		int sum = 0;

		while (b <= 47) {
			sum += b;
			System.out.print(b);
			if (b != 47) {
				System.out.print("+");
			}
			total = a + b;
			a = b;
			b = total;

		}

		System.out.println("=" + sum);
	}

		 
		 */
	}
	
	public static void test03(String[] args) {
		//3+4-7+11-18+29-47=-25
		
		int a = 3, b = 4;
		int total = 0, sum = 0;
		
		for(int i=1;i<=7;i++){
			total = a+b;
			
			if(i%2==0){
				sum += a;
				
				System.out.print(a+"-");
			}else  if(i%2==1){				
				if(i==1){
					sum += a;
				}else{
					sum -= a;
				}
				System.out.print(i<7?a+"+":a+"=");
			}
			a=b;
			b=total;
		}
		System.out.println(sum);
	}
	
	/*
	 
	     int a = 1; //이전항 prev
		 int b = 3; //현재항 cur
		 int total = 4; //다음항
		 int sum = 6;
		 boolean flag = true; //+와 -를 순서대로 처리하기 위한 변수
		 
		 while(b<=47){
		 	System.out.print(b);
		 	if(flag){
		 		sum -= a;
		 		
		  		if(b != 47){
		 		System.out.print("+");
		 		}
		  		
		 		flag = false;
		 	} else {
		 		sum += a;
		 		System.out.print("-");
		 		flag = true;
		 	}

		 total = a+b;
		 a = b;
		 b = total;
		 }
		 
		 System.out.println("="+sum);
		}
	 
	 */
	
	
	
	
	
	
}
