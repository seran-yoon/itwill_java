package org.comstudy21.ch04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSliderUI;

public class Ch04Ex06 {
	//변수 선언 가능할까?
	//함수 밖에 선언하는 변수를 클래스의 멤버 필드라고 한다
	static Scanner sc = new Scanner(System.in); //static 붙이는 이유는  static 붙어있는 애한테 접근 가능
	
	public static void main(String[] args) {
		// switch~case 문
		
		//1.화성 2.금성 3.목성 4.지구
		//선택 : 2
		//금성으로 가세요
		
		System.out.println("1.화성 2.금성 3.목성 4.지구");
		System.out.print("choice >>> ");
		
		int no = sc.nextInt();
		
		switch(no){
		case 1 : System.out.println("화성으로 가세요"); break;
		case 2 : System.out.println("금성으로 가세요"); break;
		case 3 : System.out.println("목성으로 가세요"); break;
		case 4 : System.out.println("지구로 가세요"); break;
		default : System.out.println("안드로메다로 가세요");
		} //ctrl + shift + f 누르면 정렬 바뀜


	}
}
