package org.comstudy21.ch12ex02;

public interface 움직임 {

	//인터페이스는 상수만 선언 가능
	int MAX = 100; //static final 생략
	public static final int MIN = 0;
	
	//인터페이스는 추상 메소드만 선언 가능
	void move(); //public abstract 생략
	public abstract void stop();
	
	public static void sayHello(){
		//move();
		//stop(); //static 멤버가 인스턴스멤버 호출 불가능
		System.out.println("Hello World!");
	}
	
	public default void print(){ //추상메소드를 구현해주기 위해서 default를 사용 -> defult를 사용하면 다른 클래스에서 오버라이딩을 할 수 있기 때문! 
	//추상메소드는 default와 static을 접근제어자로 사용할 수 있는데, static을 사용하면 오버라이딩 불가하기 때문에 다른 클래스에서 오버라이딩을 할 경우(보통 추상메소드는 다른 클래스에서 오버라이딩을 해야 함) default를 접근제어자로 사용   
		move();
		stop();
	} 
	
}
