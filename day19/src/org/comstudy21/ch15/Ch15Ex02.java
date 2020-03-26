package org.comstudy21.ch15;

public class Ch15Ex02 {
	
	public static void test06(String[] args) {
		
		String str1 = "Hello World!";
		String str2 = "Hello world!";

		System.out.println(str1.toLowerCase()); //hello world!
		System.out.println(str1.toUpperCase()); //HELLO WORLD!
		
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2)); //true //대소문자 상관없이 문자만 비교
		
		System.out.println(str2.charAt(4)); //o
		
		String str3 = " Hello ";
		System.out.println("Hello".equals(str3)); //str3의 공백때문에 false
		System.out.println("Hello".equals(str3.trim())); //공백을 제거해서 비교하기 때문에 true //문자열 가운데에 있는 공백은 제거못함
		
		String value = String.valueOf(5000);
		System.out.println(value); //valueof를 써주면 문자열로 바뀜
		System.out.println(5000+value); //value가 문자열이기 때문에 +를 해도 합해지는게 아니라 이어짐
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
	
	public static void test04(String[] args) { //문자열 indexOf, substring

		String str1 = "Hello java World!";
		
		int beginIndex = str1.indexOf("java");
		System.out.println("beginIndex => " + beginIndex); //6 //문자열 java의 시작점인 j의 위치를 알려줌
		
		str1 = str1.substring(0, beginIndex) + str1.substring(beginIndex+("java ".length())); //Hello World! 
		//잘라주는 개념인게 아니라, 보여주는 문자열의 번호를 지정해주는 개념!
		//str1.substring(0, beginIndex) -> 0번부터 6번(beginIndex=6)전까지의 문자열 출력 (출력할 처음번호부터 끝번호까지 다 지정해줌) => 'Hello '출력
		//str1.substring(beginIndex+("java ".length())) -> beginIndex=6, "java ".length()=5(java 문자열의 길이) 두개를 더한 값은 11이기 때문에 str1.substring(11)과 같은 코드! (출력할 처음 번호는 11로 지정해주고 끝번호는 지정해주지 않았기 때문에 맨 끝까지 출력하면 됨) => 'World!' 출력
		System.out.println(str1); //Hello World!
	}
	
	public static void test03(String[] args) { //replace

		String str1 = "Hello World!";

		//String은 불변 객체이므로 바뀐 문자열을 돌려줘야 함
		str1 = str1.replace("World", "Java");
		
		System.out.println(str1); //Hello Java!
	}

	public static void test02(String[] args) { //한 문자 indexOf, lastIndexOf
		//indexOf -> 제일 처음에 찾을 수 있는 문자를 찾아내줌
		//lastIndexOf -> 제일 마지막에 찾을 수 있는 문자를 찾아내줌
		//둘다 찾을때 맨 처음인 0번부터 찾음
		//첫번째 인덱스는 0번부터 시작
		
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
		System.out.println(str3 == str4); //false //str3과 str4는 새로운 객체를 만들어준것이기 때문에 안에 문자가 같아도 다른 객체임!
		System.out.println(str3.equals(str4)); //true //문자열 비교는 equals() 메소드를 이용해야 함
		
	}
	
}
