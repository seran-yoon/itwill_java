package org.comstudy21.ch15;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ch15Ex04 {

	public static void main(String[] args) {

		String str = "01|홍길동|서울시 은평구 응암동|010-1234-5555";
		StringTokenizer st = new StringTokenizer(str, "|");
		
		ArrayList<String> list = new ArrayList<>(); //<String> -> 제네릭 ! -> String외에는 못들어간다고 지정해주는 것
		
		while(st.hasMoreTokens()){
			//System.out.println(st.nextToken());
			list.add(st.nextToken());
		}
		
//		for(String s : list){
//			System.out.println(s);
//		}
		
		String titles[] = {"번호","성명","주소","전번"};
		for(int i=0;i<list.size();i++){
			System.out.println(titles[i] + " : " + list.get(i));
		}
	}
	
}
