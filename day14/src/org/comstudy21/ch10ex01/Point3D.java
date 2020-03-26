package org.comstudy21.ch10ex01;

import org.comstudy21.ch10ex02.Point;

public class Point3D extends Point { //슈퍼클래스 point에 상속받은 point3D클래스

	public int z;
	
	public void setX(int x){
		super.x = x; //this.x = x; 여도 됨
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
