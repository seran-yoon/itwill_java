package day12;

import java.util.Scanner;

public class day0904_tryCatch_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("나뉨수를 입력하시오 : ");
			int dividend = sc.nextInt(); //나뉨수 입력
			
			System.out.print("나눔수를 입력하시오 : ");
			int divisor = sc.nextInt(); //나눔수 입력
			
			try{
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break; //정상적인 나누기 완료 후 while문 벗어나기
			}
			catch(ArithmeticException e){ //ArithmeticException 예외 처리 코드
				System.out.println("0으로 니눌 수 없습니다! 다시 입력하세요!");
			}
		}
		sc.close();
	}
}
