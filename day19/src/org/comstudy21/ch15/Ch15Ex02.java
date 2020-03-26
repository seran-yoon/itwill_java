package org.comstudy21.ch15;

public class Ch15Ex02 {
	
	public static void test06(String[] args) {
		
		String str1 = "Hello World!";
		String str2 = "Hello world!";

		System.out.println(str1.toLowerCase()); //hello world!
		System.out.println(str1.toUpperCase()); //HELLO WORLD!
		
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2)); //true //��ҹ��� ������� ���ڸ� ��
		
		System.out.println(str2.charAt(4)); //o
		
		String str3 = " Hello ";
		System.out.println("Hello".equals(str3)); //str3�� ���鶧���� false
		System.out.println("Hello".equals(str3.trim())); //������ �����ؼ� ���ϱ� ������ true //���ڿ� ����� �ִ� ������ ���Ÿ���
		
		String value = String.valueOf(5000);
		System.out.println(value); //valueof�� ���ָ� ���ڿ��� �ٲ�
		System.out.println(5000+value); //value�� ���ڿ��̱� ������ +�� �ص� �������°� �ƴ϶� �̾���
	}
	
	public static void main(String[] args) {
		
		String path = "/hello/world/";
		String uri1 = "/hello/world/profile.do";
		String uri2 = "/hello/world/gallery.do";
		String uri3 = "/hello/world/phto.do";
		
		int idx1 = path.length(); //idx1=13
//		System.out.println(idx1);
		uri1 = uri1.substring(idx1, uri1.lastIndexOf('.'));
		System.out.println(uri1);
		
		System.out.println(uri1.substring(idx1, uri1.lastIndexOf('.'))); //profile
		System.out.println(uri2.substring(idx1, uri2.lastIndexOf('.'))); //gallery
		System.out.println(uri3.substring(idx1, uri3.lastIndexOf('.'))); //phto

	}
	
	public static void test04(String[] args) { //���ڿ� indexOf, substring

		String str1 = "Hello java World!";
		
		int beginIndex = str1.indexOf("java");
		System.out.println("beginIndex => " + beginIndex); //6 //���ڿ� java�� �������� j�� ��ġ�� �˷���
		
		str1 = str1.substring(0, beginIndex) + str1.substring(beginIndex+("java ".length())); //Hello World! 
		//�߶��ִ� �����ΰ� �ƴ϶�, �����ִ� ���ڿ��� ��ȣ�� �������ִ� ����!
		//str1.substring(0, beginIndex) -> 0������ 6��(beginIndex=6)�������� ���ڿ� ��� (����� ó����ȣ���� ����ȣ���� �� ��������) => 'Hello '���
		//str1.substring(beginIndex+("java ".length())) -> beginIndex=6, "java ".length()=5(java ���ڿ��� ����) �ΰ��� ���� ���� 11�̱� ������ str1.substring(11)�� ���� �ڵ�! (����� ó�� ��ȣ�� 11�� �������ְ� ����ȣ�� ���������� �ʾұ� ������ �� ������ ����ϸ� ��) => 'World!' ���
		System.out.println(str1); //Hello World!
	}
	
	public static void test03(String[] args) { //replace

		String str1 = "Hello World!";

		//String�� �Һ� ��ü�̹Ƿ� �ٲ� ���ڿ��� ������� ��
		str1 = str1.replace("World", "Java");
		
		System.out.println(str1); //Hello Java!
	}

	public static void test02(String[] args) { //�� ���� indexOf, lastIndexOf
		//indexOf -> ���� ó���� ã�� �� �ִ� ���ڸ� ã�Ƴ���
		//lastIndexOf -> ���� �������� ã�� �� �ִ� ���ڸ� ã�Ƴ���
		//�Ѵ� ã���� �� ó���� 0������ ã��
		//ù��° �ε����� 0������ ����
		
		String str1 = "Hello World!";

		int i = str1.indexOf('o');
		System.out.println("i => " + i); //4
		
		int j = str1.lastIndexOf('o');
		System.out.println("j => " + j); //7
	}
	
	public static void test01(String[] args) { //equals
		
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		String str3 = new String("Hello World!");
		String str4 = new String("Hello World!");
		
		System.out.println(str1 == str2); //true
		System.out.println(str2 == str3); //false
		System.out.println(str3 == str4); //false //str3�� str4�� ���ο� ��ü�� ������ذ��̱� ������ �ȿ� ���ڰ� ���Ƶ� �ٸ� ��ü��!
		System.out.println(str3.equals(str4)); //true //���ڿ� �񱳴� equals() �޼ҵ带 �̿��ؾ� ��
		
	}
	
}
