package org.comstudy21.ch11ex01;

public class School {

	public static void main(String[] args) {
		//������ ���������� ��� �ڼ����ν��Ͻ��� ���� ����
		People kim = new Student(); //StudentŬ������ ��ü�� ������ ����ϱ� ����  �θ�Ŭ������ PeopleŬ������ Ÿ���̰�, StudentŬ������ �����ϴ� �������� �����Ͽ� �ν��Ͻ�ȭ ��
		
		kim.name = "��浿";
		kim.age = 25;
		//�θ��� ���� ������ �ڼտ� Ȯ��� ��� ���� �Ұ���
		//kim.score = 100;
		
		System.out.println("���� >>> " + kim.name);
		System.out.println("���� >>> " + kim.age);
		
		//student Ÿ������ ����ȯ(�ٿ�ĳ����)�ϸ� ��� ��� ���� ����
		Student std = (Student)kim;
		std.score = 95;
		
		System.out.println("���� >>> " + std.score);
	}

}
