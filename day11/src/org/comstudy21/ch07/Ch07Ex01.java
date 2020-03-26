package org.comstudy21.ch07;

class Point { //�������� ������ class���� ��
	//��� �ʵ�
	private int x;
	private int y;
	
	//��� �޼ҵ�
	//���� ��������� private ����� ���� ����
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
		Point a = null; //class Point�� �����ϱ� ���� �������� a�� ����
		a = new Point();
		//Point a = new Point(); �� ���� ��. ��ü ���� ����
		
		//private ����� ���������� ���� ���� �Ұ���
		//a.x = 10; //a�� ����
		a.setX(12);
		//a.y = 20;
		a.setY(22);
		
		//System.out.printf("%d, %d\n", a.x, a.y);
		System.out.printf("%d, %d", a.getX(), a.getY());
	}

}
