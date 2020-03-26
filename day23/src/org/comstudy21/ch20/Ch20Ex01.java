package org.comstudy21.ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch20Ex01 { //��ĳ�ʸ� �̿����� �ʰ� ����� �ϱ�
	
	
	public static void main(String[] args) throws IOException {
		
		byte[] by = new byte[256];
		
		System.out.print("Input >>> ");
		System.in.read(by); //�迭�� �Է� ����
		
		String str = new String(by).trim(); //trim�� ���� ������ ���� �迭�� �߶��־� ������� �޸𸮰����� �������� �ʰ� �ϱ� ����
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
		
		System.out.print("���� �Է� >>> ");
		name = br.readLine();
		System.out.print("�ּ� �Է� >>> ");
		address = br.readLine();
		
		System.out.printf("���� : %s\n", name);
		System.out.printf("�ּ� : %s\n", address);
	}
	
}
