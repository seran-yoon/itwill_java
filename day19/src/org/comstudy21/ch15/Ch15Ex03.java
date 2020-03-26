package org.comstudy21.ch15;

public class Ch15Ex03 {
	
	public static void test01(String[] args) {
		
		String str1 = "Hello";
		System.out.println(str1.hashCode());
		
		str1 += " java"; //String���� �̾���̱� ������ ���ڿ��� �߰��ϴ�
		System.out.println(str1.hashCode()); //�ؽ��ڵ尡 �޶���
	}

	public static void main(String[] args) {
		//String�� �������� �޸��� �Ҹ� ����
		//StringBuffer�� +�� =�� �ȵȴ� (����ڽ� �Ұ���)
		StringBuffer sb = new StringBuffer("Hello");
		//���ڿ��� �߰��� ���ؼ��� �׻� append�� ���� �߰������ ��
		System.out.println(sb.hashCode());
		
		sb.append(" java");
		sb.append(" world");
		System.out.println(sb); //Hello java world
		System.out.println(sb.hashCode()); //StringBuffer������ ���ڿ��� �߰��ص� �ؽ��ڵ尡 �޶����� ���� -> ���� ��ü�� �ν�
		
		sb.replace(sb.indexOf("java"), sb.indexOf("java")+"java".length(), "python");
		System.out.println(sb); //Hello python world
		
		sb.reverse(); 
		System.out.println(sb); //dlrow nohtyp olleH	
	}
	
}
