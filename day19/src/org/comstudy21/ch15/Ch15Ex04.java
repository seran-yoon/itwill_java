package org.comstudy21.ch15;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ch15Ex04 {

	public static void main(String[] args) {

		String str = "01|ȫ�浿|����� ���� ���ϵ�|010-1234-5555";
		StringTokenizer st = new StringTokenizer(str, "|");
		
		ArrayList<String> list = new ArrayList<>(); //<String> -> ���׸� ! -> String�ܿ��� �����ٰ� �������ִ� ��
		
		while(st.hasMoreTokens()){
			//System.out.println(st.nextToken());
			list.add(st.nextToken());
		}
		
//		for(String s : list){
//			System.out.println(s);
//		}
		
		String titles[] = {"��ȣ","����","�ּ�","����"};
		for(int i=0;i<list.size();i++){
			System.out.println(titles[i] + " : " + list.get(i));
		}
	}
	
}
