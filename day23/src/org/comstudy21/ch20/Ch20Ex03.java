package org.comstudy21.ch20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch20Ex03 { 
	
	static String file = "C:\\Users\\user\\workspace\\output.txt";
	static String file2 = "C:\\Users\\user\\workspace\\output2.txt";

	
	public static void main(String[] args) throws IOException { //file�� ������ file2�� �����Ѵ�
		
		int data = 0;
		
		OutputStream myOut = System.out;
		InputStream myIn = System.in;
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file2);
		
		System.out.print("������ �Է��ϼ��� >>> ");
		while((data = myIn.read()) != -1){
			fos.write(data);
		}
		fos.close();
		System.out.println("���� ���� �Ϸ�!");
		
		
		while((data = fis.read()) != -1){
			fos.write(data);
			myOut.write(data);
		}
		
		fis.close();
		System.out.println("���� �б� �Ϸ�!");
	}
	
	public static void test02(String[] args) throws IOException { //���� �б�
		
		int data = 0;
		
		FileInputStream fis = null;
		OutputStream myOut = System.out;
		
		fis = new FileInputStream(file);
		
		while((data = fis.read()) != -1){
			myOut.write(data);
		}
		
		fis.close();
		System.out.println("���� �б� �Ϸ�!");
		
	}

	public static void test01(String[] args) throws IOException { //���� ����
		
		int data = 0;
		
		InputStream myIn = System.in;
		FileOutputStream fos = null;
		
		fos = new FileOutputStream(file); //������ �ּҷ� �޸����� ����� �Է��� ���ڰ� �� ������ ������
		
		while((data = myIn.read()) != -1){
			fos.write(data);
		}
		
		fos.close(); //�ݾ��־�� ���� �Ϸ��!!!!
		System.out.println("���� ���� �Ϸ�!");
		
	}
	
}
