package org.comstudy21.ch10ex01;

public class Ch10Ex01 {

	public static void main(String[] args) {
		//point3D ��ü�� �����ϰ� x,y,z ��ǥ ���
		//extend�� �̿��� ��ӹ��� Point�� ������� ���� ����
		Point3D pt3d = new Point3D(); //Point3D�� �������� ����
		
//		pt3d.x=1;
//		pt3d.y=2;
		pt3d.setX(10); //�ܺ� Ŭ������ �ִ� Point�� Point3D�� ��ӹ����ǵ�, PointŬ������ �ʵ带 protected�� �����س��� �ܺ� Ŭ���� ����� �������� Point3DŬ������ PointŬ������ ���� set,get �޼ҵ带 �ۼ��� ���� ������ �̿��� �������
		pt3d.setY(20);
		pt3d.z=3;
		
//		System.out.println(pt3d.x +" "+ pt3d.y +" "+ pt3d.z);
		System.out.println(pt3d.getX() +" "+ pt3d.getY() +" "+ pt3d.z);
	}

}
