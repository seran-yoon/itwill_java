package org.comstudy21.review;

public class Ch05_practice_6 {

	public static void Q1(String[] args) {
		
//		int num = 0;
		int count = 0;
		
//		while((num++)<100){
//			if(((num%5)!=0) || ((num%7)!=0)){
//				continue;
//			}
//			count++;
//			System.out.println(num);
//		}
		
		for(int num=1;num<=100;num++){
			if(((num%5)!=0) || ((num%7)!=0)){
				continue;
			} else{
				count++;
				System.out.println(num);
			}
		}
		
		System.out.println("count : "+count);
	}

	
	public static void main(String[] args) { //Ãâ·Â¾ÈµÊ
		
		int n = 1;
		int sum = 0;
		
		while(true){
			if(n==1 || n%2==1){
				sum += n;
				if(sum>1000){
					break;
				}
				n++;
			}
		}
		sum += n;
		
		System.out.println(n+" "+sum);
	}
	
	
}
