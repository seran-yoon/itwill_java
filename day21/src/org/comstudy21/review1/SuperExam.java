package org.comstudy21.review1;

//부모클래스
class Point { 
	
	//Point클래스의 멤버필드
	private int x;
	private int y;
	
	//디폴트 생성자
	public Point() {
		
	}

	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("x = "+x+", y = "+y);
	}
	
}

//부모클래스를 상속받는 자식클래스
class ColorPoint extends Point {
	
	//ColorPoint클래스의 멤버필드
	private String color;

	//생성자
	public ColorPoint(int x, int y, String color) {
		super(x,y); //부모클래스의  생성자도 호출해줌
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint(); //부모클래스의 출력문을 가져와서 여기서 실행 시킴
	}
	
}

public class SuperExam {
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}

//출력되기까지의 순서! -> main 에서 ColorPoint의 타입으로 생성한 cp객체를 이용해 ColorPoint클래스에 있는 showColorPoint메소드에 가서 출력문을 출력하고, showPoint()메소드로 가라고 써있기 때문에 ColorPoint의 상위클래스인 Point클래스에 있는 showPoint메소드에 가서 출력문을 출력 

}
