package org.comstudy21.ch10ex03;

public class Point3D extends Point2D {

	protected int z = 30;
	
	public Point3D(){
		System.out.println("Point3D »ý¼ºÀÚ");
	}
	
	@Override
	public void showPoint(){
		System.out.println("z=> " + z);
	}
}
