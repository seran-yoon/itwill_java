package day12;

class Circle{ //Circle class 생성
	int radius; //반지름 필드
	String name; //이름 필드
	
	//생성자
	public Circle(){
		
	} //매개변수가 없는 생성자이기 때문에 디폴트 생성자
		
	//메소드
	public double getArea(){ //리턴값이 있으면 리턴받는 변수의 타입과 동일한 타입을 선언해줘야 함 //리턴받는 값이 double형이어서 void가 아닌 double
		//원의 면적 계산
		return 3.14*radius*radius; //3.14*반지름*반지름 한 값을 반환해라(리턴)
	}
}

public class day0904_circleClass_1 {
	public static void main(String[] args) {
		
		Circle pizza = new Circle(); //Circle class의 pizza 객체 생성
		pizza.radius = 10; //*************************>> Circle class에서 필드를 선언해줄때 private을 써주지 않으면 main에서 직접적으로 class에 있는 필드 변수를 선언해줄 수 있음
		pizza.name = "자바피자";
		double area = pizza.getArea(); //getArea에서 리턴받은 값을 area에 넣기
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(); //Circle class의 donut 객체 생성
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea(); //getArea에서 리턴받은 값을 area에 넣기
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
