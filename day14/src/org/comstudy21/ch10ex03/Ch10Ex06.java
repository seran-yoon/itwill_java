package org.comstudy21.ch10ex03;

public class Ch10Ex06 {
	public static void main(String[] args) { //2D가 3D보다 먼저 생성된다는 것을 보기 위한 실습
		
		Point3D pt = new Point3D();
		
		pt.x=10;
		pt.y=20;
		
		System.out.println(pt.x +" "+ pt.y +" "+ pt.z);

	}
}
