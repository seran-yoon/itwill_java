package org.comstudy21.ch07;

class Point { //물리적인 공간에 class선언 됨
	//멤버 필드
	private int x;
	private int y;
	
	//멤버 메소드
	//같은 멤버끼리는 private 멤버도 접근 가능
	public void setX(int _x){
		x = _x;
	}
	
	public void setY(int _y){
		y = _y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
};

public class Ch07Ex01 {
	public static void main(String[] args) {
		Point a = null; //class Point를 참조하기 위한 참조변수 a를 선언
		a = new Point();
		//Point a = new Point(); 와 같은 말. 객체 생성 해줌
		
		//private 멤버는 참조변수를 통한 접근 불가능
		//a.x = 10; //a에 접근
		a.setX(12);
		//a.y = 20;
		a.setY(22);
		
		//System.out.printf("%d, %d\n", a.x, a.y);
		System.out.printf("%d, %d", a.getX(), a.getY());
	}

}
