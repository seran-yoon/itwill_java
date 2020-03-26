package org.comstudy21.ch08;

public class MainCls {
	public static void main(String[] args) {
		
		Account acc01 = new Account(100);
		Account acc02 = new Account(200);
		System.out.println(acc02.total); //300
		Account acc03 = new Account(300);
		
		System.out.println(Account.total); //600
		System.out.println(acc02.money); //200
		System.out.println(acc02.total); //600
	}

}
