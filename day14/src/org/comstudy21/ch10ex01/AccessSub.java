package org.comstudy21.ch10ex01;

import org.comstudy21.ch10ex02.AccessSuper;

public class AccessSub extends AccessSuper {
	
	@Override //
	public void show() {
//		System.out.println("a => " + a); //private�̶� ����
//		System.out.println("b => " + b); //default�̶� ����
		System.out.println("c => " + c); 
		System.out.println("d => " + d);
	}
	
}
