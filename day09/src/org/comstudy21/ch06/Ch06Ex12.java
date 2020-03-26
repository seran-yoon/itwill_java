package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06Ex12 {
	
	static Scanner sc = new Scanner(System.in);
	
	static void inputNames(String[] names) {
		for(int i=0;i<names.length ;i++){
			System.out.print("name("+(i+1)+") : ");
			names[i] = sc.next();
		}
	}
	
	static void outputNames(String[] names){
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		inputNames(names);
		
		outputNames(names);
		
		
	}
}
