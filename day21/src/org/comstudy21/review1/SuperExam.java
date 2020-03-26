package org.comstudy21.review1;

//�θ�Ŭ����
class Point { 
	
	//PointŬ������ ����ʵ�
	private int x;
	private int y;
	
	//����Ʈ ������
	public Point() {
		
	}

	//������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("x = "+x+", y = "+y);
	}
	
}

//�θ�Ŭ������ ��ӹ޴� �ڽ�Ŭ����
class ColorPoint extends Point {
	
	//ColorPointŬ������ ����ʵ�
	private String color;

	//������
	public ColorPoint(int x, int y, String color) {
		super(x,y); //�θ�Ŭ������  �����ڵ� ȣ������
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint(); //�θ�Ŭ������ ��¹��� �����ͼ� ���⼭ ���� ��Ŵ
	}
	
}

public class SuperExam {
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}

//��µǱ������ ����! -> main ���� ColorPoint�� Ÿ������ ������ cp��ü�� �̿��� ColorPointŬ������ �ִ� showColorPoint�޼ҵ忡 ���� ��¹��� ����ϰ�, showPoint()�޼ҵ�� ����� ���ֱ� ������ ColorPoint�� ����Ŭ������ PointŬ������ �ִ� showPoint�޼ҵ忡 ���� ��¹��� ��� 

}
