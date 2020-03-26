package org.comstudy21.ch16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ch16Ex01 {

	static Random rand = new Random();
	
	public static void main(String[] args) {
		//Set�� Ȱ���ؼ� �ζǹ�ȣ �����⸦ �����
		
		HashSet<Integer> lotto = new HashSet<>();

		while(lotto.size()<6){
			lotto.add(1+rand.nextInt(45));
		}
		
		System.out.println(lotto);
		
//		Integer[] arr = new Integer[lotto.size()];
//		lotto.toArray(arr);
		
//		System.out.println(lotto.toString());
		
//		for(int i=0;i<arr.length;i++){
//			System.out.println("arr["+(i+1)+"] => "+arr[i]);
//		}
		
		
	}
	
	public static void test01(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("���");
		set.add("�ٳ���");
		set.add("������");
		set.add("����");
		set.add("�ٳ���");

		System.out.println("set.size() => " + set.size()); //4
		
//		Iterator<String> iter = set.iterator();
//		
//		while(iter.hasNext()){
//			System.out.println(iter.next());
//		}
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"] => "+arr[i]);
		}
		
	}
	
}
