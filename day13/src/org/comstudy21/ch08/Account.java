package org.comstudy21.ch08;

public class Account {

	//필드 선언
	int money;
	static int total;
	
	//생성자 생성
	public Account(){ //디폴트 생성자
	}
	
	public Account(int money){ //매개변수 생성자
		this.money += money;
		total += money;
	}
	
	//메소드 생성
}
