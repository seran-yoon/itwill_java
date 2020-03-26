package org.comstudy21.ch11ex01;

public class School {

	public static void main(String[] args) {
		//슈퍼의 참조변수로 모든 자손의인스턴스를 참조 가능
		People kim = new Student(); //Student클래스의 객체를 가져와 사용하기 위해  부모클래스인 People클래스가 타입이고, Student클래스를 참조하는 참조변수 생성하여 인스턴스화 함
		
		kim.name = "김길동";
		kim.age = 25;
		//부모의 참조 변수로 자손에 확장된 멤버 접근 불가능
		//kim.score = 100;
		
		System.out.println("성명 >>> " + kim.name);
		System.out.println("나이 >>> " + kim.age);
		
		//student 타입으로 형변환(다운캐스팅)하면 모든 멤버 접근 가능
		Student std = (Student)kim;
		std.score = 95;
		
		System.out.println("성적 >>> " + std.score);
	}

}
