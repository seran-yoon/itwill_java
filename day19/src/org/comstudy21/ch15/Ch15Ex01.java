package org.comstudy21.ch15;

class Point { //class Point extends Object라고 원래 써야하는데 생략한 상태
	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	//필드끼리 비교하기 위해 equals를 재정의 해야 함
	@Override
	public boolean equals(Object obj) {
		//깊은 비교로 변경
		if(obj instanceof Point){
			Point pt = (Point)obj;
			if(pt.x == x && pt.y == y){
				return true;
			}
		}
		return false;
	}
	
}

public class Ch15Ex01 {
	
	public static void main(String[] args) {
		
		Point pt1 = new Point(10,20);
		Point pt2 = new Point(10,20);

		System.out.println("pt1 => " + pt1);
		System.out.println("pt2 => " + pt2);

		System.out.println("pt1==pt2 : " + (pt1==pt2));
		//참조값 비교 -> equals를 재정의 해서 필드를 비교하는 형태로 변경
		System.out.println("pt1.equals(pt2) : " + (pt1.equals(pt2)));
		
	}

}
