package org.comstudy21.ch15;

public class Ch15Ex03 {
	
	public static void test01(String[] args) {
		
		String str1 = "Hello";
		System.out.println(str1.hashCode());
		
		str1 += " java"; //String에서 이어붙이기 식으로 문자열을 추가하니
		System.out.println(str1.hashCode()); //해쉬코드가 달라짐
	}

	public static void main(String[] args) {
		//String은 편리하지만 메모리의 소모가 많다
		//StringBuffer는 +나 =이 안된다 (오토박싱 불가능)
		StringBuffer sb = new StringBuffer("Hello");
		//문자열의 추가를 위해서는 항상 append로 새로 추가해줘야 함
		System.out.println(sb.hashCode());
		
		sb.append(" java");
		sb.append(" world");
		System.out.println(sb); //Hello java world
		System.out.println(sb.hashCode()); //StringBuffer식으로 문자열을 추가해도 해쉬코드가 달라지지 않음 -> 같은 객체로 인식
		
		sb.replace(sb.indexOf("java"), sb.indexOf("java")+"java".length(), "python");
		System.out.println(sb); //Hello python world
		
		sb.reverse(); 
		System.out.println(sb); //dlrow nohtyp olleH	
	}
	
}
