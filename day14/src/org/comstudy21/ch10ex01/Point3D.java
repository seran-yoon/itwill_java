package org.comstudy21.ch10ex01;

import org.comstudy21.ch10ex02.Point;

public class Point3D extends Point { //����Ŭ���� point�� ��ӹ��� point3DŬ����

	public int z;
	
	public void setX(int x){
		super.x = x; //this.x = x; ���� ��
	}
	
	public void setY(int y){
		super.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
