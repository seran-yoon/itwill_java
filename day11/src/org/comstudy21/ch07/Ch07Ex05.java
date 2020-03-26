package org.comstudy21.ch07;

class 자동차 {
	private String type;
	private int km;
	private String color;
	
	//생성자 - constructor
	//리턴타입이 없다.
	//클래스 이름과 동일한 식별자를 갖는다.
	//직접 구현 하지 않으면 디폴트 생성자를 컴파일러가 추가 해준다.
	//생성자도 메소드이다 - 일반 메소드가 가지는 특징을 모두 가진다.
	
	// 생성자 오버로딩 할때 디폴트 생성자도 필수로 추가 해야 한다.
	public 자동차() {
		// 매개변수가 없으면 디폴트 생성자이다.
	} //car
		
	// 생성자 메소드 오버로딩 ...
	public 자동차(String type, int km, String color){
		//생성자의 목적 : 멤버를  초기화한다
		this.type=type;
		this.km=km;
		this.color=color;
	} //car2
	
	public 자동차(String type, int km){
		this(type,km,"은색");
	}//car3
	
	
	//각 변수에 해당하는 값을 넣어주기 위한 메소드 생성
	public void set차종(String _type){
		//this는 객체 자신이다
		//this.type = type; //이렇게 쓰면 필드쪽의 type은 알아서 인식되기때문에 변수이름을 동일하게 줘도 상관없음
		type = _type;
	}
	
	public void set속도(int _km){
		km = _km;
	}
	
	public void set색상(String _color){
		color = _color;
	} 
	
	//출력을 위한 메소드
	public void run(){
		System.out.println(color+" "+type+"가 "+km+"키로로 달린다.");
	}
}

public class Ch07Ex05 {

	public static void main(String[] args) {
		
		자동차 car = new 자동차();
		car.set차종("람보르기니");
		car.set속도(250);
		car.set색상("진주색");
		car.run(); //진주색 람보르기니가 250키로로 달린다.
		
		자동차 car2 = new 자동차("페라리",300,"빨간색");
		car2.run(); //빨간색 페라리가 300키로로 달린다.
		
		자동차 car3 = new 자동차("소나타",180);
		car3.run(); //은색 소나타가 180키로로 달린다.
	}

}
