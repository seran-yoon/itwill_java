package org.comstudy21.ch10ex01;

public class Ch10Ex01 {

	public static void main(String[] args) {
		//point3D 객체를 생성하고 x,y,z 좌표 사용
		//extend를 이용해 상속받은 Point의 멤버에도 접근 가능
		Point3D pt3d = new Point3D(); //Point3D의 참조변수 선언
		
//		pt3d.x=1;
//		pt3d.y=2;
		pt3d.setX(10); //외부 클래스에 있는 Point를 Point3D로 상속받을건데, Point클래스의 필드를 protected로 선언해놔서 외부 클래스 상속을 못받으니 Point3D클래스에 Point클래스에 대한 set,get 메소드를 작성해 참조 변수를 이용해 상속해줌
		pt3d.setY(20);
		pt3d.z=3;
		
//		System.out.println(pt3d.x +" "+ pt3d.y +" "+ pt3d.z);
		System.out.println(pt3d.getX() +" "+ pt3d.getY() +" "+ pt3d.z);
	}

}
