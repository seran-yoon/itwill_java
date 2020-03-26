package org.comstudy21.ch16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Point {
	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point pt = null;
		
		if(obj instanceof Point){
			pt = (Point)obj; //�ٿ�ĳ����
			if(pt.x==x && pt.y==y){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	
}

public class Ch16Ex02 {
	
	public static void main(String[] args) {
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(new Point(5,5));
		list.add(new Point(7,7));
		list.add(new Point(2,2));
		list.add(new Point(4,4));
		list.add(new Point(3,3));
		list.add(new Point(6,6));
		list.add(new Point(8,8));
		list.add(new Point(8,3));
		list.add(new Point(1,3));
		list.add(new Point(1,1));
		list.add(new Point(9,9));
		
		
		Collections.sort(list, new Comparator<Point>(){
			@Override
			public int compare(Point p1, Point p2){
				if(p1.x<p2.x){
					return -1;
				} else if(p1.x==p2.x){
					if(p1.y<p2.y){
						return -1;
					}
				}
				return 0;
			}
		}); //sort=�����Լ�
		
		System.out.println(list);
		
	}
	
	public static void test03(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(1);
		list.add(9);
		
		
		//��������
		Collections.sort(list, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				if(o1<o2){
					return -1; 
				} else if(o1>o2){
					return 1;
				}
				return 0;
			}
		}); //sort=�����Լ�
		
		System.out.println(list);
		
	}
	
	/*
	 
	*��������*
	���� ��ü   < �Ķ���ͷ� �Ѿ�� ��ü	:  ����(-1) ����
	���� ��ü  == �Ķ���ͷ� �Ѿ�� ��ü	:  0 ����
	���� ��ü   > �Ķ���ͷ� �Ѿ�� ��ü	:  ���(1) ����
	**����(-1) �Ǵ� 0�̸� ��ü�� �ڸ��� �״�� �����Ǹ�, ���(1)�� ��쿡�� �� ��ü�� �ڸ��� �ٲ��**
	
	*��������*
	**���ϰ��� ���������� �ݴ�θ� ���ָ� �ȴ�**
	 
	 */
	
	
	
	
	public static void test02(String[] args) {
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(new Point(10,12));
		list.add(new Point(20,22));
		list.add(new Point(30,32));
		list.add(new Point(40,42));
		list.add(new Point(50,52));

		Point pt = new Point(30,32);
		
		System.out.println(list.indexOf(pt)); //2
		
	}
	
	
	
	public static void test01(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("���");
		list.add("�ٳ���");
		list.add("��");
		list.add("����");
		list.add("�ٳ���");

		list.set(4, "����");
		
		list.set(3, "����");
		//list.remove(3);
		
		if(list.indexOf("����") == -1){
			System.out.println("��Ͽ��� ����� ����");
		} else {
			System.out.println("���� ��ġ : "+list.indexOf("����"));
		}
		
		System.out.println(list.size()); //5
		
//		System.out.println(list);
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]"+arr[i]);
		}
		
	}

}
