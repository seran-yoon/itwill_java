package org.comstudy21.ch10ex02;

public class AccessSuper {
	
	private int a;
	int b; //생략하면 default
	protected int c;
	public int d;
	
	public void show(){
		System.out.println("a => " + a);
		System.out.println("b => " + b);
		System.out.println("c => " + c);
		System.out.println("d => " + d);
	}
	
}


//<접근지정자>		 	<자신의 클래스>  <같은 패키지>  <하위 클래스>  <다른 패키지>
//private 				O	     	X		  X		    X
//default(생략,기본접근지정자)	O		 	O		  X		    X	
//protected				O		 	O		  O		    X
//public				O		 	O		  O		    O