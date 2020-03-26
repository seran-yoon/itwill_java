package org.comstudy21.ch20;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ch20Ex01 {
	public static void main(String[] args) {

		Hashtable<String, String> map = new Hashtable<>(); //hashtable�� �������� table�ȿ� �����, �������� ���� �����ϴ� �ִ� list���̱� ������ ������ �����Ϸ��� list�� ���θ�����༭ �����ؼ� �����ϸ� ��!
		map.put("ȫ�浿", "010-1111-1111");
		map.put("��浿", "010-2222-2222");
		map.put("��浿", "010-3333-3333");
		map.put("�ڱ浿", "010-4444-4444");
		map.put("��浿", "010-5555-5555");
		
		System.out.println(map.size());
		
		Enumeration<String> keys = map.keys();
		
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
