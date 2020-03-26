package org.comstudy21.review;

public class Ch05_practice_7 {

	public static void Q1(String[] args) {
	
		for(int dan=2;dan<10;dan++){
			if(dan%2==0){
				for(int i=1;i<=dan;i++)
					System.out.println(dan+"*"+i+"="+dan*i);
			}
			System.out.println();
		}
	}
	
	
	public static void Q2(String[] args) { 
		
		int result = 0;
		
		for(int A=1;A<10;A++){
			for(int B=1;B<10;B++){
				result = ((A*10)+B)+((B*10)+A);
				
				if(result==99)
					System.out.println(A+" "+B);
			}
		}
	
	}
	

}
