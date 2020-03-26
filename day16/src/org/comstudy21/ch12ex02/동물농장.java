package org.comstudy21.ch12ex02;

public class 동물농장 {

	public static void main(String[] args) {
		
		동물 ani = new 닭();
		
		ani.play();
		System.out.println(); //줄바꿈 용도
		
		
//		움직임 m = new 움직임(); //인터페이스는 인스턴스할 수 없기 때문에 에러
		//인터페이스는 인스턴스로 만들 수 없지만, 익명 클래스 형태로 인스턴스 생성 가능
		움직임 m = new 움직임( ){

			@Override
			public void move() {
				System.out.println("움직인다!");
			}

			@Override
			public void stop() {
				System.out.println("멈춘다!");
			} 
		};
		
		m.print();
		System.out.println(); //줄바꿈 용도
		
		
		
		//추상클래스도 인스턴스로 만들 수 없지만, 익명 클래스 형태로 인스턴스 생성 가능
		동물 a = new 동물(){

			@Override
			public void 먹다() {
				System.out.println("모이 콕콕");
			}
		};
		
		a.play();
		System.out.println(); //줄바꿈 용도
		
		
		
		//익명 클래스를 객체로 사용해서 나타냄 (한번만 사용할때 유용함 -> 변수를 사용하지 않음)
		( new 동물() {

			@Override
			public void 먹다() {
				System.out.println("알수없는 동물이 먹이를 먹는다...");
			}
			
		} ).play();
		
		
		
	}
}
