package org.comstudy21.ch10ex02;

public class AccessSuper {
	
	private int a;
	int b; //�����ϸ� default
	protected int c;
	public int d;
	
	public void show(){
		System.out.println("a => " + a);
		System.out.println("b => " + b);
		System.out.println("c => " + c);
		System.out.println("d => " + d);
	}
	
}


//<����������>		 	<�ڽ��� Ŭ����>  <���� ��Ű��>  <���� Ŭ����>  <�ٸ� ��Ű��>
//private 				O	     	X		  X		    X
//default(����,�⺻����������)	O		 	O		  X		    X	
//protected				O		 	O		  O		    X
//public				O		 	O		  O		    O