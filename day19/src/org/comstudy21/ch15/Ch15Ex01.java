package org.comstudy21.ch15;

class Point { //class Point extends Object��� ���� ����ϴµ� ������ ����
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
	
	//�ʵ峢�� ���ϱ� ���� equals�� ������ �ؾ� ��
	@Override
	public boolean equals(Object obj) {
		//���� �񱳷� ����
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
		//������ �� -> equals�� ������ �ؼ� �ʵ带 ���ϴ� ���·� ����
		System.out.println("pt1.equals(pt2) : " + (pt1.equals(pt2)));
		
	}

}
