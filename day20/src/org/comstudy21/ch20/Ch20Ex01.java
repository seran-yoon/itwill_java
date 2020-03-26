package org.comstudy21.ch20;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ch20Ex01 {
	public static void main(String[] args) {

		Hashtable<String, String> map = new Hashtable<>(); //hashtable은 순서없이 table안에 저장됨, 순서까지 같이 저장하는 애는 list뿐이기 때문에 순서를 저장하려면 list를 새로만들어줘서 정렬해서 저장하면 됨!
		map.put("홍길동", "010-1111-1111");
		map.put("김길동", "010-2222-2222");
		map.put("고길동", "010-3333-3333");
		map.put("박길동", "010-4444-4444");
		map.put("김길동", "010-5555-5555");
		
		System.out.println(map.size());
		
		Enumeration<String> keys = map.keys();
		
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
