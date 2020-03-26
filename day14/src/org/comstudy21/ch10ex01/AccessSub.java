package org.comstudy21.ch10ex01;

import org.comstudy21.ch10ex02.AccessSuper;

public class AccessSub extends AccessSuper {
	
	@Override //
	public void show() {
//		System.out.println("a => " + a); //private이라서 에러
//		System.out.println("b => " + b); //default이라서 에러
		System.out.println("c => " + c); 
		System.out.println("d => " + d);
	}
	
}
