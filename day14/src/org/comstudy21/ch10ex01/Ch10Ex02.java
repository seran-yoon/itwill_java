package org.comstudy21.ch10ex01;

import org.comstudy21.ch10ex02.AccessSuper;

public class Ch10Ex02 {
	
	public static void showManager(AccessSuper access){ //super를 참조하는 참조변수 access 선언
		System.out.println("::: showManager :::");
		access.show(); //참조변수를 통해 show안의 내용을 출력
	}
	
	public static void main(String[] args) {
		showManager(new AccessSuper()); //AccessSuper access = new AccessSuper(); 와 같은 말  
		//타입은 super , 실체는 super => 출력 super
		showManager(new AccessSub()); //AccessSuper access = new AccessSub(); 와 같은 말 
		//타입은 super, 실체는 sub => 출력 sub
	}

	
	
	public static void test(String[] args) {
		
		//AccessSub sub = new AccessSub();
		//AccessSub sub = new AccessSuper(); //상속을 받은애는 Sub라 이런식으로 못씀
		AccessSuper sub = new AccessSub(); //큰거에 작은애 들어가는거 -> 상속한애의 참조변수를 상속받은애한테서 생성
		//타입은 Super, 실체는 Sub ->실체의 값을 출력함
		
//		System.out.println("a => " + sub.a); //private이라서 에러
//		System.out.println("b => " + sub.b); //default이라서 에러
//		System.out.println("c => " + sub.c); //protected이라서 에러
		//System.out.println("d => " + sub.d);
		
		sub = new AccessSuper(); //Super꺼로 sub를 바꿔줌(이거 안쓰면 Sub값이 sub로 실행)
		
		sub.show(); //AccessSub에 있는 show가 실행되는것 -> AccessSub의 참조변수이기 때문에
	}
}
