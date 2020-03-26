package org.comstudy21.ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch20Ex01 { //스캐너를 이용하지 않고 입출력 하기
	
	
	public static void main(String[] args) throws IOException {
		
		byte[] by = new byte[256];
		
		System.out.print("Input >>> ");
		System.in.read(by); //배열로 입력 받음
		
		String str = new String(by).trim(); //trim을 쓰는 이유는 남는 배열을 잘라주어 쓸대없는 메모리공간을 차지하지 않게 하기 위함
		System.out.println("str => "+str);
		System.out.println("Number => "+ new Integer(str)*100);
	
	}	
	
	
	public static void test02(String[] args) throws IOException {
		
		System.out.print("Input >>> ");
		
		int ch = 0;
		int num = 0;
		
		while((ch = System.in.read()) != '\n'){
			if(ch>='0' && ch <='9'){
				num = num*10;
				num = num + ch-'0';
			}
		}
		
		System.out.println("num => "+num);
		
	}
	

	public static void test01(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String name = null;
		String address = null;
		
		System.out.print("성명 입력 >>> ");
		name = br.readLine();
		System.out.print("주소 입력 >>> ");
		address = br.readLine();
		
		System.out.printf("성명 : %s\n", name);
		System.out.printf("주소 : %s\n", address);
	}
	
}
