package org.comstudy21.ch04;

//import java.util.Scanner;

public class Ch04Ex10 {

	public static void test01(String[] args) {
		//for���� �̿��ؼ� �Ʒ��� ���� ����ϵ��� �Ѵ�
		//1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		
		for(int i=1;i<=10;i++){ //1�� 10�� ������ ���̱� ������ ���� ������ �����ʿ� ������ ����� �������൵ �ȴ� -> final int min = 1; final int max = 10;���� for�� ���� �������ְ� for�� ���� ���ڸ� �� ����� �������ָ� ��
			sum += i;
			
			if(i<=9){
				System.out.print(i + "+");
			} else{
				System.out.print(i + "=" + sum);
			}
		}
		
		//for�� -> while������ ����
		/*
		 while(int i<=10){ 
			sum += i;
			
			if(i<=9){
				System.out.print(i + "+");
			} else{
				System.out.print(i + "=" + sum);
			}
			
			i++
		}
		 */
		
	}

	
	//������
	//1+2-3+4-5+6-7+8-9+10=7
	//1+1+2+3+5+8+13+21=54 (�Ǻ���ġ ����)
	//1+1-2+3-5+8-13+21=14
			
	
	public static void homework01(String[] args) {
		//1+2-3+4-5+6-7+8-9+10=7
		
		int sum = 0;
		
		for(int i=1;i<=10;i++){
			if(i%2==0){ //¦��
				sum += i;
				System.out.print(i<10?i+"-":i+"="+sum);
			}else if(i%2==1){
				if(i==1){}
				sum = i;
			}else{
				sum += i;
			}
			System.out.print(i+"+");
		}
	}
	
	public static void homework02(String[] args) {
		//1+1+2+3+5+8+13+21=54
		
		int sum = 0, total = 0;;
		int a = 1, b = 1; 

		for(int i=1;i<=8;i++){
			total = a+b;
			sum += a;
			
			System.out.print(i<8?a+"+":a+"=");
			
			a=b;
			b=total;
			}
		
		System.out.println(sum);
	
	}
	
	public static void homework03(String[] args) {
		//1+1-2+3-5+8-13+21=14
		
		int sum = 0, total = 0;
		int a = 1, b = 1;
		
		for(int i=1;i<=8;i++){
			if(i%2==0){
				total = a+b;
				sum += a;
				
				System.out.print(i<8?a+"-":a+"=");
			}else  if(i%2==1){
				total = a+b;
				
				if(i==1){
					sum += a;
				}else{
					sum -= a;
				}
				System.out.print(a+"+");
			}
			a=b;
			b=total;
		}
		System.out.println(sum);
	}
	

	
	
	
	
	
	
}
