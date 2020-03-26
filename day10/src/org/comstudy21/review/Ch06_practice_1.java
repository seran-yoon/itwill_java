package org.comstudy21.review;

public class Ch06_practice_1 {

	public static void Q1(String[] args) {
		
		operation(5, 2);
		
	}
	
	static void operation(int a, int b){
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}

// --------------------------------------------------
	
	
	public static void Q2(String[] args) {
		
		abvalue(2, 5);
	
	}
	
	static void abvalue(int a, int b){
		System.out.println(a+"-"+b+"="+(a-b)+" >>> "+(Math.abs((a-b))));
	}
	
}
