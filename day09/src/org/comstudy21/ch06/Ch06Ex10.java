package org.comstudy21.ch06;

public class Ch06Ex10 {
	
	static String toString(String name, int age){ //���Ϲ޴� ������ Ÿ���� String�̱� ������  void -> String�� �ۼ�
		
		return name+"�� �� "+age+"�� �Դϴ�";
	}

	public static void main(String[] args) {
		
		String name  = "ȫ�浿";
		int age = 23;
		
		String infoStr = toString(name, age);
		
		System.out.println(infoStr);
		System.out.println(toString("������", 15));
		
	}

}
